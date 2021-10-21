package main.java.by.itAcademy.Prakapenka.lesson4;

import java.util.Scanner;

public class BaseTaskFour {
    public static void main(String[] args) {


        Scanner scn = new Scanner(System.in);

        int userInput;

        //switch in do-while loop
        do{
            System.out.println("Let`s start working, input 1 (sum method), " +
                    "2 (check prime number)," +
                    " 3 (for printing the gap from 90 to 0)," +
                    " 4 (for checking even number)," +
                    " 5 (for calculating a factorial)," +
                    "0 for exit.");

            userInput = scn.nextInt();

            switch (userInput) {
                case 1:
                    System.out.println("Input your number for sum method");
                    int userNumber1 = scn.nextInt();
                    int returnedSum = sumFromOneToNumber(userNumber1);

                    if (returnedSum <= 0){
                        System.out.println("User input is uncorrected (your number - " + userNumber1 +
                                " - is  negative or Zero). The original number will returned.");
                    }
                    else{
                        System.out.println(returnedSum);
                    }

                    break;
                case 2:
                    System.out.println("Input your number for checking prime number method");
                    int userNumber2 = scn.nextInt();
                    System.out.println(isPrimeNumber(userNumber2));
                    break;
                case 3:
                    printPositivsInGap();
                    break;
                case 4:
                    System.out.println("Input your number for checking even number method");
                    int userNumber3 = scn.nextInt();
                    System.out.println(isEvenNumber(userNumber3));
                    break;
                case 5:
                    System.out.println("Input your number for calc factorial");
                    int userNumber4 = scn.nextInt();
                    System.out.println(calculateFactorialRecursion(userNumber4));
                    break;
                case 0:
                    System.out.println("Finish!");
                    break;
                default:
                    System.out.println("Some error is coming, restart the program");
                }
            } while (userInput!=0);
        }

    public static int sumFromOneToNumber(int userNumber) {
        if (userNumber > 0) {
            int sumNumber = 0;
            for (int i = 1; i <= userNumber; i++){
                sumNumber += i;
            }
            return sumNumber;
        }
        return userNumber;
    }

    public static boolean isEvenNumber(int userNumber) {
        return (userNumber % 2 == 0) ? true : false;
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
        if ((userNumber == 1)||(userNumber == 0)) return 1;
        return userNumber * calculateFactorialRecursion(userNumber - 1);
    }
}