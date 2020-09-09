package com.servme.test.part1;

public class Main {
    public static void main(String[] args) {
        ItemRepo itemRepo = new ItemRepo();
        itemRepo.putItem(new Item(1, "test"));
        itemRepo.putItem(new Item(2, "test1"));
        itemRepo.putItem(new Item(3, "test2"));
        System.out.println(itemRepo.getItemById(2).getId());
        itemRepo.removeItemById(2);
        System.out.println(itemRepo.getItemById(2));
    }
}
