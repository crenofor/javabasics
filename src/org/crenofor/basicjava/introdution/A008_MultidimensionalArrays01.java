package org.crenofor.basicjava.introdution;

public class A008_MultidimensionalArrays01 {
    public static void main(String[] args) {
        int[][] days ={{31,28,30},{31,28,30}};

        for (int i = 0; i < days.length; i++) {
            for (int j = 0; j < days[i].length; j++) {
                System.out.println(days[i][j]);
            }

            System.out.println("______________________________________");

            for (int[] arrB : days){
                for (int num : arrB ){
                    System.out.println(num);
                }
            }
        }
    }
}
