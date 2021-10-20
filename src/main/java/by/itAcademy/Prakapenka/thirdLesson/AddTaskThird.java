package main.java.by.itAcademy.Prakapenka.thirdLesson;

import java.util.Scanner;

public class AddTaskThird {

    public static void main(String[] args) {
        int userInterfaceArray[] = inputUserIntNumbers("Let`s start working, input 1" +
                " (test for longest substr), 2 (test for palindrome) " +
                "or 3 (test for calculate target)...", 1);

        switch (userInterfaceArray[0]) {
            case 1:
                testForLongSubstring();
                break;
            case 2:
                testForPalindrom();
                break;
            case 3:
                testForCalculateTarget();
                break;
            default:
                System.out.println("Some error is coming, restart the program");
        }
    }

    public static void testForLongSubstring(){
        lengthOfLongestSubstring("abcabcde");
        lengthOfLongestSubstring("bbbbbb");
        lengthOfLongestSubstring("pwwkew");
        lengthOfLongestSubstring("");
        }

    public static void testForPalindrom(){
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(10));
        System.out.println(isPalindrome(-101));
    }

    public static void testForCalculateTarget(){
        int[] test1 = calculateTargetFromArray(new int[] {2, 7, 11, 15}, 9);
        System.out.println(test1[0] + ", " + test1[1]);

        int[] test2 = calculateTargetFromArray(new int[] {3, 2, 4}, 6);
        System.out.println(test2[0] + ", " + test2[1]);

        int[] test3 = calculateTargetFromArray(new int[] {3, 3}, 6);
        System.out.println(test3[0] + ", " + test3[1]);
        }

    // main code block
    public static void lengthOfLongestSubstring(String checkingStr) {
        String[] strArray = checkingStr.split("");

        String currentStr = "";
        String maxStr = "";

        for (int i = 0; i < strArray.length; i++) {
            if (currentStr.contains(strArray[i])) {
                if (currentStr.length() > maxStr.length()) {
                    maxStr = currentStr;
                    currentStr = "" + strArray[i];
                } else continue;
            } else currentStr += strArray[i];
        }

        if (currentStr.length()>maxStr.length()){
                maxStr = currentStr;
            }

        //output
        if (checkingStr.length() == 0) {
            System.out.println(0);
        }
        else {
            System.out.println("Test string is " + checkingStr);
            System.out.println("The answer is " + maxStr + ", with length " + maxStr.length());
        }
    }

    public static int[] calculateTargetFromArray(int checkingArray[], int target) {
        for (int i = 0; i < checkingArray.length; i++) {
            for (int j = 0; j < checkingArray.length; j++) {
                if (((checkingArray[i] + checkingArray[j]) == target) && (i != j)) {
                    return new int[]{i, j};
                } else continue;
            }
        }
        return new int[]{0, 0};
    }

    public static boolean isPalindrome(int checkingNumber) {
        String strNumber = (new Integer(checkingNumber)).toString();
        char[] chNumber = strNumber.toCharArray(); //convert number to array of chars

        for (int i = 0; i < chNumber.length / 2; i++) {
            if (chNumber[i] == chNumber[chNumber.length - i - 1]) {
                continue;
            } else return false;
        }
        return true;
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


