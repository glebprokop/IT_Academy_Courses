package main.java.by.itAcademy.Prakapenka.lesson7;

public class BaseTaskSevenTest {
    public static void main(String[] args) {
        calculateCommasTest();
        getStringWithLastLetterTest();
    }

    public static void calculateCommasTest() {
        String[] testStrings = {"No one comma", "One, comma", "Three ,,, commas"};
        int[] testResult = {0, 1, 3};

        for (int i = 0; i < 3; i++) {
            int workOut = BaseTaskSeven.calculateCommas(testStrings[i]);

            if (workOut == testResult[i]) {
                System.out.println("'calculateCommas' - corrected method, the out is right - " + workOut);
            } else {
                System.out.println("Warning! Error - method is uncorrected! The out is " + workOut);
            }
        }
    }

    public static void getStringWithLastLetterTest() {
        String[] testInStrings = {"Best courses", "I like programming", "State forensic examination committee"};
        String[] testOutStrings = {"ts", "Ieg", "ecne"};

        for (int i = 0; i < 3; i++) {
            String workOut = BaseTaskSeven.getStringWithLastLetter(testInStrings[i]);

            if (workOut.equals(testOutStrings[i])) {
                System.out.println("'getStringWithLastLetter' - corrected method, the out is right - " + workOut);
            } else {
                System.out.println("Warning! Error - method is uncorrected! The out is " + workOut);
            }
        }
    }
}




