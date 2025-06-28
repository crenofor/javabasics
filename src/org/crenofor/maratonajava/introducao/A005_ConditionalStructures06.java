package org.crenofor.maratonajava.introducao;

public class A005_ConditionalStructures06 {
    public static void main(String[] args) {
        //Ultilizando switch e dados os dados de 1 a 7, imprima se é um dia de semana ou um final de semana
        //Considerando 1 como domingo

        int dia = 1;
        switch (dia) {
            case 1:
                System.out.println("Domingo, Final de semana");
                break;

            case 2:
                System.out.println("Segunda, Dia últil");
                break;

            case 3:
                System.out.println("Terça, Dia últil");
                break;

            case 4:
                System.out.println("Quarta, Dia últil");
                break;

            case 5:
                System.out.println("Quinta, Dia últil");
                break;

            case 6:
                System.out.println("Sexta, Dia últil");

                break;
            case 7:
                System.out.println("Sabado, Final de samana");
                break;
            default:
                System.out.println("Opção invalida");
                break;
        }

    }
}
