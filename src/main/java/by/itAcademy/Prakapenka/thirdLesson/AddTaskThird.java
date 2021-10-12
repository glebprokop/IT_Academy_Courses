package main.java.by.itAcademy.Prakapenka.thirdLesson;

public class AddTaskThird {
    public static void main(String[] args) {
//        int array[] = {2, 5, 2};
//        int target = 4;
//
//        int arr [] =  calculateTargetFromArray(array, target);
//        System.out.println(arr[0] + " " + arr[1]);
//        int x = 100;
//        String strNumber = (new Integer(x)).toString();
//        char[] chArr = strNumber.toCharArray();
//
//        System.out.println(chArr[1]);

    }

    public static int[] calculateTargetFromArray(int checkingArray[], int target) {
        for (int i = 0; i < checkingArray.length; i++) {
            for (int j = 0; j < checkingArray.length; j++) {
                if (((checkingArray[i] + checkingArray[j]) == target) && (i != j)) {
                    System.out.println("Good");
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
            } else {
                return false;
            }
        }
        return true;
    }

    public static int lengthOfLongestSubstring(String checkingStr){
        String testStr = "abcabcas";
        char[] chStringArr = testStr.toCharArray();

        char[] longestStr;
        int longestLength = 0;

        for (int i = 0; i < chStringArr.length; i++){
            for (int j = i+1; j < chStringArr.length; j++) {
                if (chStringArr[i] != chStringArr[j]){


                }

        }


    }


}


