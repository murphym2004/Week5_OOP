package atu.ie;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] myArray = new int[10];
        myArray[0] = 100;
        myArray[1] = 200;
        myArray[2] = 300;
        myArray[3] = 400;
        myArray[4] = 500;
        myArray[5] = 600;
        myArray[6] = 700;
        myArray[7] = 800;
        myArray[8] = 900;
        myArray[9] = 1000;

        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter new value of the array:");
        int newvalue = scanner.nextInt();

        myArray[10] = newvalue;
        System.out.println("" + myArray[10]);
        try {
            myArray[10] = newvalue;
            System.out.println("" + myArray[10]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("error");
        }

        scanner.close();
    }
}
