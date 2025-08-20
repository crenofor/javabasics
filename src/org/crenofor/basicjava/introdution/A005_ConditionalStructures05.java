package org.crenofor.basicjava.introdution;

public class A005_ConditionalStructures05 {
    public static void main(String[] args) {
        //Switch, case, default.
        char sexo = 'M';
        switch (sexo){
            case 'M':
                System.out.println("Homem");
                break;
            case 'F':
                System.out.println("Mulher");
                break;
            default:
                System.out.println("Invalido");
                break;
        }
    }
}
