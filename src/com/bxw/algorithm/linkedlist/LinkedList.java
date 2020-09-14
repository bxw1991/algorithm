package com.bxw.algorithm.linkedlist;

import java.util.Currency;

/**
 * take advantage of array to realize LinkedList, dummyHead is a good idea
 * @param <E>
 */
public class LinkedList<E> {

    public Node dummyHead;
    private int size;

    private class Node {
        private E e;
        private Node next;
        public Node(E e){
            this.e = e;
            next = null;
        }
        public Node(){
            this(null);
        }
    }

    public LinkedList(){
        dummyHead = new Node();
        size = 0;
    }



    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(E e){
        add(dummyHead,e);
        size ++;
    }



    private Node add(Node node, E e){
        if (node == null){
            return new Node(e);
        }
        node.next = add(node.next,e);
        return node;
    }

    public E getLast(){
        while (dummyHead.next != null){
            dummyHead = dummyHead.next;
        }
        return dummyHead.e;
    }

    /**
     * 查看链表头元素
     * @param e
     * @return
     */
    public E getFirst(){
        if (size <= 0){
            throw new IndexOutOfBoundsException("index error");
        }
        return dummyHead.next.e;
    }


    public boolean find(E e){
        Node cur = dummyHead.next;
        while(cur != null){
            if (cur.e == e){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    /**
     * 删除节点,不要直接用dummyhead进行删除！
     * @return
     */
    public E remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index error");
        }
        Node cur = dummyHead;
        for (int i = 0; i < index; i++){
            cur = cur.next;
        }
        Node remNode = cur.next;
        cur.next = remNode.next;
        remNode.next = null;
        size--;
        return remNode.e;
    }

    /**
     * 删除第一个元素
     * @return
     */
    public E removeFirst(){
        return remove(0);
    }

    /**
     * 删除最后一个元素
     * @return
     */
    public E removeLast(){
        return remove(size - 1);
    }



    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur = dummyHead.next;
        while (cur != null){
            sb.append(cur.e);
            sb.append("-->");
            if (cur.next == null){
                sb.append("null");
            }
            cur = cur.next;
        }
        return sb.toString();
    }
}
