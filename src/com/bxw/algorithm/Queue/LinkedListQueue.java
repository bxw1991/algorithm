package com.bxw.algorithm.Queue;

import com.bxw.algorithm.linkedlist.LinkedList;

/**
 * time complexity  inqueue: o(1)
 *                  enqueue: o(n)
 * @param <E>
 */
public class LinkedListQueue<E> implements Queue<E> {

    private LinkedList<E> linkedList;
    public LinkedListQueue(){
        linkedList = new LinkedList<>();
    }

    @Override
    public void inQueue(E e) {
        linkedList.add(e);
    }

    @Override
    public E enQueue() {
        return linkedList.removeFirst();
    }

    @Override
    public int getSize() {
        return linkedList.getSize();
    }

    @Override
    public boolean isEmpty() {
        return linkedList.isEmpty();
    }

    @Override
    public E getFront() {
        return linkedList.getLast();
    }
}
