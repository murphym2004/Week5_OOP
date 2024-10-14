package atu.ie;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
       num.add(100);
        num.add(200);
        num.add(300);
        num.add(400);
        num.add(500);
        num.add(600);
        num.add(700);
        num.add(800);
        num.add(900);
        num.add(1000);

        for (Integer i: num ) {
            System.out.println("Element at index "+i);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a new number :");
        int input = scanner.nextInt();
        num.set(9,input);
        for (Integer i: num ) {
            System.out.println("Element at index "+i);
        }
    }
}
