package com.bxw.algorithm.avltree;

/**
 * AVLTree the first kind of balanced tree
 * realize way : node
 * @param <E>
 */
public class AVLTree<E extends Comparable<E>> {
    private Node root;
    private int size;

    /**
     * 内部节点类
     */
    private class Node{
        private E e;
        private Node left,right;

        public Node(E e){
            this.e = e;
            this.left = this.right = null;
        }

        public Node(){
            this(null);
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * add element to AVLTree
     * @param e
     */
    public void add(E e){
        add(root,e);
    }

    private Node add(Node node, E e){
        if (node == null){
            return new Node(e);
        }
    }
}
