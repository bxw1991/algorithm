package com.bxw.algorithm.linkedlist;

import com.bxw.algorithm.linkedlist.LinkedList;

public class Test {


    public static void  main(String[] args){
        LinkedList<Integer> ll = new LinkedList<>();
        for (int i = 0 ; i < 10; i++){
            ll.add(i);
        }
        System.out.println(ll.find(6));
        System.out.println(ll.find(10));
        System.out.println(ll);
        System.out.println(ll);

    }
}
