package com.bxw.algorithm.array;

/**
 * time complexity: add: O(1)
 *                  delete: O(n)
 *                  get: O(1)
 *                  set: O(1)
 * @param <E>
 */

public class ArrayList<E> {
    private E[] data;
    private int size;
    public ArrayList(int capacity){
        data = (E[])new Object[capacity];
        size = 0;
    }
    public ArrayList(){
        this(10);
    }

    public int getSize(){
        return this.size;
    }

    public int getCapacity(){
        return data.length;
    }

    public void add(E e){
        if (size >= data.length){
            resize(2 * data.length);
        }
        data[size] = e;
        size ++;
    }

    public E get(int index){
        return data[index];
    }

    public void set(int index, E e){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("error index");
        }
        data[index] = e;
    }

    public E remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("error index");
        }
        E ret = data[index];
        for (int i = index; i < size - 1; i++){
            data[i] = data[i + 1];
        }
        size -- ;
        if (size < data.length / 4){
            resize(data.length / 2);
        }
        return ret;
    }



    private void resize(int newCapacity) {
        E[] newData = (E[])new Object[newCapacity];
        for (int i = 0; i < size; i++){
            newData[i] = data[i];
        }
        data = newData;
    }



}
