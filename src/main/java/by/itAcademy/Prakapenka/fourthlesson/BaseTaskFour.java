package main.java.by.itAcademy.Prakapenka.fourthlesson;

import java.util.Scanner;

public class BaseTaskFour {
    public static void main(String[] args) {
        int userInterfaceArray[] = inputUserIntNumbers("Let`s start working, input 1 (sum method), " +
                "2 (check prime number)," +
                " 3 (for printing the gap from 90 to 0)," +
                " 4 (for checking even number)," +
                "5 (for calculating a factorial)", 1);

        switch (userInterfaceArray[0]) {
            case 1:
                int userNumber1[] = inputUserIntNumbers("Input your number for sum method", 1);
                System.out.println(sumFromOneToNumber(userNumber1[0]));
                break;
            case 2:
                int userNumber2[] = inputUserIntNumbers("Input your number for checking prime number method", 1);
                System.out.println(isPrimeNumber(userNumber2[0]));
                break;
            case 3:
                printPositivsInGap();
                break;
            case 4:
                int userNumber3[] = inputUserIntNumbers("Input your number for checking even number method", 1);
                System.out.println(isEvenNumber(userNumber3[0]));
                break;
            case 5:
                int userNumber4[] = inputUserIntNumbers("Input your number for calc factorial", 1);
                System.out.println(calculateFactorialRecursion(userNumber4[0]));
                break;
            default:
                System.out.println("Some error is coming, restart the program");
        }
    }

    public static int sumFromOneToNumber(int userNumber) {
        if (userNumber > 0) {
            int sumNumber = 0;
            for (int i = 1; i <= userNumber; i++) sumNumber += i;
            return sumNumber;
        }
        System.out.println("User input is uncorrected (your number - " + userNumber + " - is  negative or Zero). The original number will returned.");
        return userNumber;
    }

    public static boolean isEvenNumber(int userNumber) {
        boolean checkingEvenNumber = userNumber % 2 == 0;
        return checkingEvenNumber;
    }

    //suppose using with only positive numbers
    public static boolean isPrimeNumber(int userNumber) {
        for (int i = 2; i < (Math.sqrt(userNumber)); i++) {
            if (userNumber % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void printPositivsInGap() {
        for (int i = 90; i >= 0; i -= 5) {
            System.out.println(i);
        }
    }

    public static int calculateFactorialRecursion(int userNumber) {
        if (userNumber == 1) return userNumber;
        else if (userNumber == 0) return 1;

        return userNumber * calculateFactorialRecursion(userNumber - 1);
    }

    //this method used for given the user`s integer numbers (in array)
    public static int[] inputUserIntNumbers(String message, int countOfNumbers){
        System.out.println(message);
        int returnedNumbers[] = new int [countOfNumbers];
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < countOfNumbers; i++) returnedNumbers[i] = scn.nextInt();
        return returnedNumbers;
    }
}