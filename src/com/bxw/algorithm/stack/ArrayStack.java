package com.bxw.algorithm.stack;

import com.bxw.algorithm.array.ArrayList;

/**
 * time complexity : push O(1)
 *                   pop O(1)
 *                   peek O(1)
 * @param <E>
 */
public class ArrayStack<E> implements Stack<E> {
    private ArrayList<E> arrayList;
    public ArrayStack(){
        arrayList = new ArrayList<>();
    }

    @Override
    public int getSize() {
        return arrayList.getSize();
    }

    @Override
    public boolean isEmpty(){
        return arrayList.isEmpty();
    }

    @Override
    public void push(E e) {
        arrayList.add(e);
    }

    @Override
    public E pop() {
        E e = arrayList.removeLast();
        return e;
    }

    @Override
    public E peek() {
        return arrayList.getLast();
    }

}
