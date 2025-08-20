package org.crenofor.basicjava.introdution;

public class A004_Operators {
    public static void main(String[] args) {
        //Operadores Aritiméticos: + - / *

        int num1 = 10;
        double num2 = 20;
        double result = num1 / num2;

        System.out.println(result);

        //OR; %
        int resto = 27 % 7;
        System.out.println(resto);

        //Operadores Relacionais: < > <= >= == !=, sempre vai retornar valores booleanos
        boolean isDezMaiorQueVinte = 10 > 20;
        System.out.println("isDezMaiorQueVinte " + isDezMaiorQueVinte);

        //Operadores Lógicos: && (AND), || (OR), ! (NOT).
        //AND
        int idade = 30;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 40 && salario <= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta " + isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta " + isDentroDaLeiMenorQueTrinta);

        //OR
        double valorContaPoupaca = 10000;
        double valorContaCorrente = 2000;
        float playstationValor = 5000F;

        boolean comprarPlaystation = valorContaPoupaca > playstationValor || valorContaCorrente > playstationValor;

        System.out.println("comprarPlaystation " + comprarPlaystation);

        //Operadoers de Atribuição ( =, +=, -=, *=, /=, %=)
        double bonus = 1800;

        bonus += 1000; //2800
        bonus -= 1000; //1800
        bonus *= 2; // 3200
        bonus /= 2; // 1800
        bonus %= 2; // 0.0
        System.out.println(bonus);

        // (==, --)
        int contador = 1;
        contador++;
        contador--;
        --contador;
        ++contador;
        System.out.println(contador);
    }
}
