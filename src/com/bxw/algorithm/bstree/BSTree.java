package com.bxw.algorithm.bstree;

import javax.jws.WebParam;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class BSTree<E extends Comparable<E>> {

    private Node root;
    private int size;

    private class Node{
        private E e;
        private Node left,right;

        public Node(E e){
            this.e = e;
            left = right = null;
        }
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return isEmpty();
    }

    public void add(E e){
        add(root,e);

    }

    public void remove(E e){
        remove(root,e);
    }

    private Node remove(Node node,E e){

        if (node == null){
            return null;
        }
        if (e.compareTo(node.e) < 0){
            node.left = remove(node.left,e);
            return node;
        }
        else if (e.compareTo(node.e) > 0){
            node.right = remove(node.right,e);
            return node;
        }
        else {
            if (node.left == null) {
                Node rightNode = node.right;
                node = null;
                size--;
                return rightNode;
            }
            else if (node.right == null) {
                Node leftNode = node.left;
                node = null;
                size--;
                return leftNode;
            }
            else {
                Node preMax = getPreMax(node.left);
                preMax.left = removeMax(node.left);
                preMax.right = node.right;
                return preMax;
            }
        }


    }

    public Node removeMax(){
        return removeMax(root);
    }

    private Node removeMax(Node node){
        if (node.right == null){
            size --;
            return node.left;
        }
        node.right = removeMax(node.right);
        size--;
        return node;
    }

    private Node getPreMax(Node node){
        if (node.right == null){
            return node;
        }
        return getPreMax(node.right);

    }






    private Node add(Node node, E e){
        if (node == null){
            size ++;
            return new Node(e);
        }
        if (e.compareTo(node.e) < 0){
            node.left = add(node.left,e);
        }
        if(e.compareTo(node.e) > 0){
            node.right = add(node.right,e);
        }
        return node;
    }





}
