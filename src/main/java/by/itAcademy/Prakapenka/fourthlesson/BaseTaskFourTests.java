package main.java.by.itAcademy.Prakapenka.fourthlesson;
import main.java.by.itAcademy.Prakapenka.fourthlesson.BaseTaskFour;

import static main.java.by.itAcademy.Prakapenka.fourthlesson.BaseTaskFour.sumFromOneToNumber;
import static main.java.by.itAcademy.Prakapenka.fourthlesson.BaseTaskFour.isEvenNumber;
import static main.java.by.itAcademy.Prakapenka.fourthlesson.BaseTaskFour.isPrimeNumber;
import static main.java.by.itAcademy.Prakapenka.fourthlesson.BaseTaskFour.printPositivsInGap;
import static main.java.by.itAcademy.Prakapenka.fourthlesson.BaseTaskFour.calculateFactorialRecursion;

public class BaseTaskFourTests {
    public static void main(String[] args) {
        sumFromOneToNumberTest();
        isEvenNumberTest();
        isPrimeNumberTest();
        printPositivsInGapTest();
        calculateFactorialRecursionTest();
    }

    public static void sumFromOneToNumberTest(){
        int testUserNumbersArray[] = {3, 0, -1};
        int testOutputNumbersArray[] = {6, 0, -1};
        int testResult;

        for (int i = 0; i<testUserNumbersArray.length; i++){
            System.out.println("Test №" + (i+1));
            testResult = sumFromOneToNumber(testUserNumbersArray[i]);
            if (testResult == testOutputNumbersArray[i]){
                System.out.println("The sum method works good, for the number " + testUserNumbersArray[i] + " result is " + testResult);
            }
            else
                System.out.println("Warning! Error - method is uncorrected! For the number " + testUserNumbersArray[i] + " result is " + testResult);
        }
    }

    public static void isEvenNumberTest() {
        int testUserNumbersArray[] = {0, 1, 2, 3, 4};
        boolean testOutputArray[] = {true, false, true, false, true};
        boolean testResult;

        for (int i = 0; i < testUserNumbersArray.length; i++) {
            System.out.println("Test №" + (i + 1));
            testResult = isEvenNumber(testUserNumbersArray[i]);

            if (testResult == testOutputArray[i]) {
                System.out.println("Output is correct, number " + testUserNumbersArray[i] + " is " + testResult + " for even!");
            } else
                System.out.println("Warning! Error - method is uncorrected! For the number " + testUserNumbersArray[i] + " result is " + testResult);
        }
    }
    public static void isPrimeNumberTest(){
        int testUserNumbersArray[] = {0, 1, 5, 10, 17, 21};
        boolean testOutputArray[] = {true, true, true, false, true, false};
        boolean testResult;

        for (int i = 0; i < testUserNumbersArray.length; i++) {
            System.out.println("Test №" + (i + 1));
            testResult = isPrimeNumber(testUserNumbersArray[i]);

            if (testResult == testOutputArray[i]) {
                System.out.println("Output is correct, number " + testUserNumbersArray[i] + " is " + testResult + " for prime!");
            } else
                System.out.println("Warning! Error - method is uncorrected! For the number " + testUserNumbersArray[i] + " result is " + testResult);
        }
    }

    public static void printPositivsInGapTest(){
        printPositivsInGap();
    }

    public static void calculateFactorialRecursionTest(){
        int testUserNumbersArray[] = {0, 1, 2, 3, 4, 5};
        int testOutputNumbersArray[] = {1, 1, 2, 6, 24, 120};
        int testResult;

        for (int i = 0; i<testUserNumbersArray.length; i++){
            System.out.println("Test №" + (i+1));
            testResult = calculateFactorialRecursion(testUserNumbersArray[i]);
            if (testResult == testOutputNumbersArray[i]){
                System.out.println("The factorial method works good, for the number " + testUserNumbersArray[i] + " result is " + testResult);
            }
            else
                System.out.println("Warning! Error - method is uncorrected! For the number " + testUserNumbersArray[i] + " result is " + testResult);
        }
    }
}
