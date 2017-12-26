package com.testpackage;


public class Main {

    public static void main(String[] args) {
        int[] consistency = new int[100];
        for (int i = 0; i < consistency.length; i++) {
            consistency[i] = 1 + (int) (Math.random() * 101);
        }
        int sum = consistency[0] + consistency[1];
        int counter = 0;
        for (int i = 0; i < consistency.length; i++) {
            if (consistency[i] < sum) {
                System.out.println(consistency[i] + " ");
            } else counter++;
        }
        if (counter == consistency.length)
            System.out.println("Таких чисел не найдено.");
    }
}
