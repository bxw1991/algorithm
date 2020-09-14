package com.bxw.algorithm.stack;

import com.bxw.algorithm.linkedlist.LinkedList;

/**
 * time complexity: push o(1)
 *                  pop o(1)
 *                  peek o(1)
 * @param <E>
 */
public class LinkedListStack<E> implements Stack<E>{
    private LinkedList<E> linkedList;
    public LinkedListStack(){
        this.linkedList = new LinkedList<>();
    }

    @Override
    public void push(E e) {
        linkedList.add(e);
    }

    @Override
    public E pop() {
        return linkedList.removeLast();
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
    public E peek() {
        return linkedList.getLast();
    }
}
