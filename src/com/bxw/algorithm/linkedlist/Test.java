package com.bxw.algorithm.linkedlist;

import com.bxw.algorithm.linkedlist.LinkedList;

public class Test <E>{



    public static void  main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();

        for (int i = 0 ; i < 10; i++){
            ll.add(i);
        }

        System.out.println(ll.find(6));
        System.out.println(ll.find(10));
        System.out.println(ll);
        System.out.println(ll);

        TestNode testNode = new TestNode();
        TestNode next = testNode.getNext();
        System.out.println(next);

        for (int i = 0; i < 10; i++){
            ll.removeLast();
            System.out.print(ll);
            System.out.println(" size = " + ll.getSize());

        }

    }
}
