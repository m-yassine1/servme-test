package com.servme.test.part4and5;

import java.io.Closeable;

public interface Listener extends Closeable {
    void itemPut(Item item);
    void itemRemoved(Item item);
}
