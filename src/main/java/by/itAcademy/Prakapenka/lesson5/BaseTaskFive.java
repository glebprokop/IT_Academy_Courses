package main.java.by.itAcademy.Prakapenka.lesson5;

import java.util.Scanner;
import java.util.Random;

public class BaseTaskFive {
    public static void main(String[] args) {
        //1 task
        System.out.println("The first task tested.");
        String[] testArr = createWeekDaysArray();
        System.out.println(testArr[testArr.length - 1]);
        System.out.println();

        //2 task (array is generated by Random class)
        System.out.println("The second task tested.");
        int[] testArr2 = generateUserArray();
        System.out.println(checkElemBelowAverage(testArr2));
        System.out.println();

        //3 task
        System.out.println("The third task tested.");
        int[] testArr3 = createUserArrayWithoutLast();
        System.out.print("User array: ");
        for (int num : testArr3){
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Input the number for adding in array:");
        Scanner userScn = new Scanner(System.in);
        int userNumber = userScn.nextInt();
        System.out.println("Input the index:");
        int userNumberIndex = userScn.nextInt();

        int[] resultTest3 = correctUserArray(testArr3, userNumber, userNumberIndex);

        for (int num : resultTest3){
            System.out.print(num + " ");
        }
        System.out.println();

        //4 task
        System.out.println("The fourth task tested.");
        int[][] testArr4 = {{1, 2, 3}, {4, 5, 6}};
        System.out.println(foundBiggestNumber(testArr4));

    }

    public static String[] createWeekDaysArray(){
        String[] weekDays = {"Monday", "Tuesday", "Wednesday", "Trursday", "Friday", "Saturday", "Sunday"};
        return weekDays;
    }

    public static String checkElemBelowAverage(int[] workArr){
        double sum = 0.0;
        String elemBelowAvg = "";

        for (int i:workArr){
            sum += i;
        }

        double avgValue = sum / workArr.length;

        for (int i:workArr){
            if (i < avgValue){
                elemBelowAvg += (i + " ");
            }
        }
        return elemBelowAvg;
    }

    public static int[] correctUserArray(int[] userArray, int addNumber, int addNumberIndex){
        if ((addNumberIndex < 0) || (addNumberIndex > (userArray.length - 1))){
            return userArray;
        }

        int reversIndex = userArray.length - 1;

        while (reversIndex != addNumberIndex){
            userArray[reversIndex] = userArray[reversIndex - 1];
            reversIndex--;
        }

        userArray[addNumberIndex] = addNumber;
        return userArray;
    }

    public static int foundBiggestNumber(int[][] userArray){
        int maxValue = userArray[0][0];

        for(int[] firstArr:userArray){
            for(int numberSecondArr:firstArr){
                if (numberSecondArr > maxValue){
                    maxValue = numberSecondArr;
                }
            }
        }
        return maxValue;
    }

    public static int[] createUserArrayWithoutLast() {
        System.out.println("Input the right number of array`s elements (integer value):");
        Scanner userScn = new Scanner(System.in);
        int numElements = userScn.nextInt();

        if (numElements < 0) {
            return createUserArrayWithoutLast();
        }

        int[] userArray = new int[numElements];

        for (int i = 0; i < numElements - 1; i++) {
            System.out.println("Input the element №" + (i + 1));
            userArray[i] = userScn.nextInt();
        }
        return userArray;
    }

    public static int[] generateUserArray() {
        System.out.println("Input the right number of array`s elements (integer value):");
        Scanner userScn = new Scanner(System.in);
        int numElements = userScn.nextInt();

        if (numElements < 0) {
            return new int[]{-1};
        }

        int[] userArray = new int[numElements];
        Random random = new Random();
        for (int i = 0; i < numElements; i++) {
            userArray[i] = random.nextInt();
        }
        return userArray;
    }
}






