package org.crenofor.maratonajava.introducao;

public class A005_ConditionalStructures03 {
    public static void main(String[] args) {

        double salario = 4000;
        String mensagemDoar = "Eu vou doar 500 pro devDojo";
        String mensagemNaoDoar = "Eu não tenho condições, mas um dia vou ter!";
        //Operador ternario
        //(condição) ? verdadeiro ; falso;
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;

        System.out.println(resultado);
    }
}
