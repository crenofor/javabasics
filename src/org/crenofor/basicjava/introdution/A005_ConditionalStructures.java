package org.crenofor.basicjava.introdution;

public class A005_ConditionalStructures {
    public static void main(String[] args) {
        //if conditions
        int age = 15;
        boolean autorizadoComprarBebidaAlcolica = age >= 18;

        if (autorizadoComprarBebidaAlcolica) {
            System.out.println("Autorizado");
        } else {
            System.out.println("Negado");
        }
    }
}
