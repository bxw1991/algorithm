package com.bxw.algorithm.heap;


public class Heap<E extends Comparable<E>> {
    private E[] data;
    private int size;

    public Heap(int capacity){
        data = (E[])new Object[capacity];
        size = 0;
    }

    /**
     * 无参构造函数
     */
    public Heap(){
        this(10);
    }

    public int getSize() {
        return size;
    }

    /**
     * 判断堆是否为空
     * @return
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * 获取左还在坐标
     */
    public int getLeftChild(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index error");
        }
        return 2 * index + 1;
    }

    /**
     * 获取右孩子坐标
     */
    public int getRightChild(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index error");
        }
        return 2 * index + 2;
    }

    /**
     * 获取父亲节点坐标
     */
    public int getParent(int index){
        if (index <= 0 || index >= size){
            throw new IndexOutOfBoundsException("index error");
        }
        return (index - 1) / 2;
    }

    /**
     * 向最大堆中添加节点
     */
    public void add(E e){
        if (size == data.length){
            resize(2 * data.length);
        }
        if (size == 0){
            data[0] = e;
        }else {
            data[size] = e;
            shiftUp(size);
        }
        size ++;
    }
    /**
     * 删除最大堆头结点
     */
    public E remove(){
        E ret = data[0];
        data[0] = data[size - 1];
        shiftDown(0);
    }

    public void shiftDown(int index){


    }

    /**
     * 上浮过程,递归实现
     * @param index
     */
    private void shiftUp(int index) {
        if (index == 0){
            return;
        }
        int parentIndex = getParent(index);
        if (data[index].compareTo(data[parentIndex]) > 0){
            E temp = data[index];
            data[index] = data[parentIndex];
            data[parentIndex] = temp;
        }
        shiftUp(parentIndex);
    }


    /**
     * 数组扩容
     * @param newCapacity
     */
    private void resize(int newCapacity) {
        E[] newData = (E[])new Object[newCapacity];
        for (int i = 0; i < size; i++){
            newData[i] = data[i];
        }
        data = newData;
    }


}
