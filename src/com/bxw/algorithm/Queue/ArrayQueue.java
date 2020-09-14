package com.bxw.algorithm.Queue;

import com.bxw.algorithm.array.ArrayList;

/**
 * time complexity  inqueue: o(1)
 *                  enQueue: o(n)
 *
 * @param <E>
 */
public class ArrayQueue<E> implements Queue<E>{
    private ArrayList<E> arrayList;
    public ArrayQueue(){
        arrayList = new ArrayList();
    }

    @Override
    public void inQueue(E e) {
        arrayList.add(e);
    }

    @Override
    public E enQueue() {
        return arrayList.removeFirst();
    }

    @Override
    public int getSize() {
        return arrayList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return arrayList.isEmpty();
    }

    @Override
    public E getFront() {
        return arrayList.getFirst();
    }
}
