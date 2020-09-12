package com.servme.test.part4through7;

import java.io.Closeable;
import java.io.IOException;

import static com.servme.test.part4through7.ItemRepo.unregisterListener;

public interface Listener extends Closeable {
    void itemPut(Item item);
    void itemRemoved(Item item);

    @Override
    default void close() throws IOException {
        unregisterListener(this);
    }
}
