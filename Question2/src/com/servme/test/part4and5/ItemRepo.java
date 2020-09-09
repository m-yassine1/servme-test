package com.servme.test.part4and5;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ItemRepo {
    private Set<Item> items = new HashSet<>();
    private List<Listener> listeners = new ArrayList<>();

    public void removeItemById(int itemId){
        // TODO
        Item item = getItemById(itemId);
        items.removeIf(i -> i.getId() == itemId);
        listeners.forEach( l -> l.itemRemoved(item));
    }

    public Item getItemById(int itemId){
        // TODO
        return items.stream().filter(i -> itemId == i.getId()).findFirst().orElse(null);
    }

    public Closeable addListener(Listener listener) {
        listeners.add(listener);
        return listener;
    }

    public void unregisterListener(Listener listener) {
        listeners.remove(listener);
    }

    public void putItem(Item item) {
        items.add(item);
        listeners.forEach( l -> l.itemPut(item));
    }

    public void putItem(Item item, CallBack callback){
        // TODO execute actualPutItem on a background thread and when it finishes call 'callback'
        try {
            Thread t = new Thread(() -> actualPutItem(item));
            t.start();
            t.wait();
            // TODO to notify the caller that the operation finished
            callback.callBack();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }



    private Future<Item> putItemAlt(Item item) {
        CompletableFuture<Item> completableFuture = new CompletableFuture<>();

        Executors.newCachedThreadPool().submit(() -> {
            actualPutItem(item);
            completableFuture.complete(item);
        });

        return completableFuture;
    }

    private void actualPutItem(Item item) {
        // Simulate an expensive operation
        try {
            Thread.sleep(2000);
            items.add(item);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
