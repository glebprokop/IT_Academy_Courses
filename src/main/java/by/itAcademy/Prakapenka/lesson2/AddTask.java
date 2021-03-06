package main.java.by.itAcademy.Prakapenka.lesson2;

import java.util.Scanner;

public class AddTask {
    public static void main(String[] args) {
        // base values` blocks
        int testIntOne = -3;
        int testIntTwo = -8;

        //first task test
        System.out.println("The first test begins");
        int testNValue = takeIntFromScanner("Unput your \"n \" parameter...");
        boolean compareResult = compareTwoNumbers(testIntOne, testIntTwo, testNValue);

        System.out.printf("Is number %d more than number %d by %d? - %s.", testIntOne, testIntTwo, testNValue, compareResult);
        System.out.println();

        //second task test
        System.out.println("The second test begins");
        int secondtestIntOne = takeIntFromScanner("Unput your first number...");
        int secondtestIntTwo = takeIntFromScanner("Unput your second number...");
        boolean devideResult = checkingDevide(secondtestIntOne, secondtestIntTwo);

        System.out.printf("Is number %d divide by %d? - %s.", secondtestIntOne, secondtestIntTwo, devideResult);
    }

    public static boolean compareTwoNumbers(int firstnumber, int secondnumber, int nParam) {
        return (firstnumber-secondnumber)==nParam;
    }

    public static boolean checkingDevide(int firstnumber, int secondnumber) {
        return (firstnumber%secondnumber)==0;
    }

    public static int takeIntFromScanner(String message) {
        System.out.println(message);
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }
}