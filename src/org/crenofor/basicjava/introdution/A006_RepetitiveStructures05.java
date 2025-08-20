package org.crenofor.basicjava.introdution;

public class A006_RepetitiveStructures05 {
    public static void main(String[] args) {
        //Como usar o continue em java:
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
