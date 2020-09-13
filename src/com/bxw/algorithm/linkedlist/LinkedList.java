package com.bxw.algorithm.linkedlist;

import java.util.Currency;

public class LinkedList<E> {

    private Node<E> root;
    private int size;
    private class Node<E> {
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
        root = null;
        size = 0;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void add(E e){
        if (root == null){
            root = new Node<>(e);
        }else {
            add(root,e);
        }

        size ++;
    }

    private Node add(Node node, E e){
//        if (node.next == null){
//            node.next = new Node(e);
//            return node;
//        }
//        node.next = add(node.next,e);
//        return node;
        if (node == null){
            return new Node(e);
        }
        node.next = add(node.next,e);
        return node;
    }


    public boolean find(E e){
        Node cur = root;
        while(cur != null){
            if (cur.e == e){
                return true;
            }
            cur = cur.next;
        }
        return false;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node cur = root;
        while (cur != null){
            sb.append(root.e);
            sb.append("-->");
            if (cur.next == null){
                sb.append("null");
            }
            cur = cur.next;
        }
        return sb.toString();
    }
}
