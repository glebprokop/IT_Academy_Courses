package main.java.by.itAcademy.Prakapenka.lesson6;

import javax.swing.*;

public class TaskSixTests {
    public static void main(String[] args) {
        //checkNumbersMoreIndexTest();
        //matrixRowAndColumnTest();
        //ChildrenClassTest();
        CustomerClassTests();

    }

    public static void CustomerClassTests() {
        Customer Darya = new Customer("Darya", "Drutsko", "unknown", 1996, 1551, 10);
        System.out.println("Test for methods in Customer class:");
        System.out.println(Darya.getFirstName());
        System.out.println(Darya.getSecondName());
        System.out.println(Darya.getPatronymic());
        System.out.println(Darya.getAge());
        System.out.println(Darya.getCardNumber());
        System.out.println(Darya.getBankAccount());
        System.out.println("And printing of data in class method");
        Darya.printClientInfo();
    }

    public static void ChildrenClassTest() {
        Children emptyChildren = new Children();
        System.out.println("Test for emptyChildren:");
        emptyChildren.printInfo();
        System.out.println("");

        Children userChildren = new Children();
        System.out.println("Test for userChildren:");
        userChildren.inputInfo();
        userChildren.printInfo();
        System.out.println("");

        System.out.println("Test for added child:");
        Children Jason = new Children("Jason", "Statham", 54);
        Jason.printInfo();
    }

    public static void checkNumbersMoreIndexTest() {
        int[] testInputArray = {0, 2, 1, 4, 3};
        String testOut = "2 4 ";
        String workOut = BaseTaskSix.checkNumbersMoreIndex(testInputArray);

        if (testOut.equals(workOut)) {
            System.out.println("Corrected method, the out is right - " + workOut);
        } else {
            System.out.println("Warning! Error - method is uncorrected! The out is " + workOut);
        }
    }

    public static void matrixRowAndColumnTest() {
        int[][] testInputMatrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int testRow = 2;
        int testColumn = 1;

        String testOutRow = "4 5 6 ";
        String testOutColumn = "1 4 7 ";

        String[] workOut = BaseTaskSix.matrixRowAndColumn(testInputMatrix, testRow, testColumn);

        if ((workOut[0].equals(testOutRow)) && (workOut[1].equals(testOutColumn))) {
            System.out.println("Corrected method, everything is right");
        } else {
            System.out.println("Warning! Error - method is uncorrected! Output is " + workOut[0] + " " + workOut[1]);
        }
    }


}
