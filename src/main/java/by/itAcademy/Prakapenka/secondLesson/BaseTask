package main.java.by.itAcademy.Prakapenka.secondLesson;

import java.util.Random;
import java.util.Scanner;

public class BaseTask
{
    public static void main(String[] args) {
        // tests` blocks
        System.out.println("User`s int number: " + inputIntNumber()); //for func to input integer number
        System.out.println("User`s double number: " + inputDoubleNumber()); //for func to input double number
        System.out.println("User`s namr: " + inputUserName()); //for func to input name

        //calc the square of number
        System.out.println("Its the test for sqrt function.");
        int sqrtIntOne = inputIntNumber();
        System.out.println("Sqrt of " + sqrtIntOne + " is " + numSqrt(sqrtIntOne));

        //calc the avg value of 2 int
        System.out.println("Its the test for calculating average value for 2 int numbers.");
        int avgIntOne = inputIntNumber();
        int avgIntTwo = inputIntNumber();
        System.out.println("Average of " + avgIntOne + " and " + avgIntTwo + " is " + calcAverage(avgIntOne, avgIntTwo));


        //calc the avg value of 3 double
        System.out.println("Its the test for calculating average value for 3 double numbers.");
        double testDoubleOne = inputDoubleNumber();
        double testDoubleTwo = inputDoubleNumber();
        double testDoubleThree = inputDoubleNumber();
        System.out.println("Average of numbers " + testDoubleOne + ", " + testDoubleTwo + " and " + testDoubleThree + " is " + calcAverage(testDoubleOne, testDoubleTwo, testDoubleThree));

        //search random value in range of 2 numbers
        System.out.println("Its the test for searching random value in range of 2 numbers.");
        int randomIntOne = inputIntNumber();
        int randomIntTwo = inputIntNumber();
        System.out.println("Random value in range of " + randomIntOne + " - " + randomIntTwo + " is " + calcRandomInGap(randomIntOne, randomIntTwo));
    }

    public static int inputIntNumber(){
        System.out.println("Unput your integer number...");
        Scanner scn = new Scanner(System.in);
        return scn.nextInt();
    }

    public static double inputDoubleNumber(){
        System.out.println("Unput your double number...");
        Scanner scn = new Scanner(System.in);
        return scn.nextDouble();
    }

    public static String inputUserName(){
        System.out.println("Unput your name...");
        Scanner scn = new Scanner(System.in);
        return scn.nextLine();
    }

    public static int numSqrt(int number){
        return number * number;
    }

    public static double calcAverage(int number1, int number2){
        return (double)(number1 + number2)/2;
    }

    public static double calcAverage(double number1, double number2, double number3){
        return (number1 + number2 + number3)/3;
    }

    public static int calcRandomInGap(int number1, int number2){
        Random random = new Random();
        return number1 + random.nextInt(number2 - number1 + 1);
    }
}