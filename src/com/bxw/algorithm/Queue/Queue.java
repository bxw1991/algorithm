package com.bxw.algorithm.Queue;

public interface Queue<E> {
    void inQueue(E e);
    E enQueue();
    int getSize();
    boolean isEmpty();
    E getFront();
}
