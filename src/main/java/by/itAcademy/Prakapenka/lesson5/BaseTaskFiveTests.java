package main.java.by.itAcademy.Prakapenka.lesson5;

import static main.java.by.itAcademy.Prakapenka.lesson5.BaseTaskFive.createWeekDaysArray;
import static main.java.by.itAcademy.Prakapenka.lesson5.BaseTaskFive.checkElemBelowAverage;
import static main.java.by.itAcademy.Prakapenka.lesson5.BaseTaskFive.correctUserArray;
import static main.java.by.itAcademy.Prakapenka.lesson5.BaseTaskFive.foundBiggestNumber;

import java.util.*;
//import static main.java.by.itAcademy.Prakapenka.lesson5.BaseTaskFive.printPositivsInGap;
//import static main.java.by.itAcademy.Prakapenka.lesson5.BaseTaskFive.calculateFactorialRecursion;

public class BaseTaskFiveTests {
    public static void main(String[] args) {
        //createWeekDaysArrayTest();
        //checkElemBelowAverageTest();
        correctUserArrayTest();
        foundBiggestNumberTest();
    }


    public static void createWeekDaysArrayTest() {
        String[] testArr = createWeekDaysArray();
        if (testArr[6] == "Sunday") {
            System.out.println("Corrected method, the last element of array is " + testArr[6]);
        } else
            System.out.println("Warning! Error - method is uncorrected! The last element of array is " + testArr[6]);
    }

    public static void checkElemBelowAverageTest() {
        int[] testArr = new int[]{1, 2, 3, 4};
        String resultMethod = checkElemBelowAverage(testArr);
        String testOutput = "1 2 ";

        if (testOutput.equals(resultMethod)) {
            System.out.println("Corrected method, the right output is " + resultMethod);
        } else {
            System.out.println("Warning! Error - method is uncorrected! The output is " + resultMethod +
                    " instead of " + testOutput);
        }
    }

    public static void correctUserArrayTest() {
        int[] testInArr = new int[]{1, 2, 3, 0};
        int testAddNumber = 4;
        int testAddNumberIndex = 2;

        int[] testOutArr = new int[]{1, 2, 4, 3};
        int[] resultArr = correctUserArray(testInArr, testAddNumber, testAddNumberIndex);

        if (Arrays.equals(testOutArr, resultArr)) {
            System.out.println("Corrected method!");
        } else {
            System.out.println("Warning! Error - method is uncorrected! The output is " + Arrays.toString(resultArr) +
                    " instead of " + Arrays.toString(testOutArr));
        }
    }

    public static void foundBiggestNumberTest() {
        int[][] testInArr = new int[][]{{1, 2, 6}, {3, 8, 0}};
        int testBiggestNumber = 8;
        int resultBiggestNumber = foundBiggestNumber(testInArr);

        if (testBiggestNumber == resultBiggestNumber) {
            System.out.println("Corrected method, the biggest number is " + resultBiggestNumber);
        } else {
            System.out.println("Warning! Error - method is uncorrected! The output is " + resultBiggestNumber +
                    " instead of " + testBiggestNumber);
        }
    }
}
