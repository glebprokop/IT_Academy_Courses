package main.java.by.itAcademy.Prakapenka.thirdLesson;

import java.util.Random;
import java.util.Scanner;
import java.util.Calendar;

public class BaseTaskThird {
    public static void main(String[] args) {
        //user interface
        int userInterfaceArray[] = inputUserIntNumbers("Let`s start working, input 1, 2 or 3", 1);

        switch (userInterfaceArray[0]) {
            case 1:
                isNumberInGap();
                break;
            case 2:
                isTriangleExistChecking();
                break;
            case 3:
                String nowDay = whatDayNow();
                System.out.println(nowDay);
                break;
            default:
                System.out.println("Some error is coming, restart the program");
        }
    }

    //main methods - №№1-3
    public static void isNumberInGap(){
        int randomNumber = calcRandomInGap(5, 155);

        if ((randomNumber>25)&(randomNumber<100)) {
            System.out.println("The number " + randomNumber + " is in interval (25, 100)");
        }
        else {
            System.out.println("The number " + randomNumber + " is not in interval (25, 100)");
        }
    }

    public static void isTriangleExistChecking(){
        int sides[] = inputUserIntNumbers("Input 3 sides for checking after Ent...", 3);
        int a = sides[0], b = sides[1], c = sides[2];

        if ((a + b > c)&(a + c > b)&(c + b > a)){
            System.out.printf("Triangle this sides %d, %d and %d may exist!", a, b, c);
        }
        else {
            System.out.printf("Triangle this sides %d, %d and %d can`t be!", a, b, c);
        }
    }

    public static String whatDayNow(){
        Calendar calendar = Calendar.getInstance();
        int nowDay = calendar.get(Calendar.DAY_OF_WEEK);
        switch (nowDay){
            case 1: return("SUNDAY");
            case 2: return("MONDAY");
            case 3: return("TUESDAY");
            case 4: return("WEDNESDAY");
            case 5: return("THURSDAY");
            case 6: return("FRIDAY");
            case 7: return("SATURDAY");
            default:
                return ("Some error");
        }
    }

    //facultative methods for work
    public static int calcRandomInGap(int number1, int number2){
        Random random = new Random();
        return number1 + random.nextInt(number2 - number1 + 1);
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