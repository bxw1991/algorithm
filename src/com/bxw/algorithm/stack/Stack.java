package com.bxw.algorithm.stack;


public interface Stack<E> {
    void push(E e);
    E pop();
    int getSize();
    boolean isEmpty();
    E peek();
}
