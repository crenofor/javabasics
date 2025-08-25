package org.crenofor.basicjava.introdution;

public class A007_Arrays03 {
    public static void main(String[] args) {
        //types of the arrays declaration:
        int[] num = {1, 2, 3, 4, 5};
        int[] num2 = new int[5];
        int[] num3 = new int[]{5, 4, 3, 2, 1};

        //for (int i = 0; i < num.length; i++) {
        //    System.out.println(num[i]);
        //}

        //for each:
        for(int n :num2);{
            System.out.println(num2);
        }
    }
}
