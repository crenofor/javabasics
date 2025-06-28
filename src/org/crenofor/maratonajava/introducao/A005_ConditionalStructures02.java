package org.crenofor.maratonajava.introducao;

public class A005_ConditionalStructures02 {
    public static void main(String[] args) {
        int age = 15;
        String categoria;

        if (age < 15) {
            System.out.println("Categoria infantil");
        } else if (age < 18) {
            System.out.println("Categoria juvenil");
        } else {
            System.out.println("Categoria Adulto");
        }
    }
}