package org.crenofor.maratonajava.introducao;

public class A006_RepetitiveStructures02 {
    public static void main(String[] args) {
        //imprima todso os numeros pares ate o numero 1.000.000
        for (int i = 999999; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
