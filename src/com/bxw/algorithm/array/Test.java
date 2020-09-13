package com.bxw.algorithm.array;

import javax.sound.midi.Soundbank;

public class Test {
    public static void main(String[] args){
//        ArrayList<Integer> a = new ArrayList<>();
//        System.out.println(a.getCapacity());
        ArrayList<Integer> arrayList = new ArrayList();
        for (int i = 0; i < 20; i++){
            arrayList.add(i);
        }
        System.out.println(arrayList.getCapacity());
        for (int i = 0; i < 20; i++){
            arrayList.remove(0);
            System.out.println(arrayList.getCapacity());
        }

    }
}
