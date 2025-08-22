package org.crenofor.basicjava.introdution;

public class A007_Arrays02 {
    public static void main(String[] args) {
        //byte, short, int, long, float end double, Return: 0
        //char, Return: '/u0000', ' '
        //boolean, Return: False
        //String, Return: null

        String[] cars = {"Volvo", "Ford", "BMW", "Madza"};

        for (int i = 0; i < cars.length; i++) {

            System.out.println(cars[i]);
        }
    }
}
