package org.crenofor.basicjava.introdution;

public class A006_RepetitiveStructures01 {
    public static void main(String[] args) {
        //while, do while, for.
        int caunt = 0;
        while (caunt < 10) {
            System.out.println(++caunt);
        }

        int count = 0;
        do {
            System.out.println("dentro do while" + ++count);
        } while (count < 10);

        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }
    }
}
