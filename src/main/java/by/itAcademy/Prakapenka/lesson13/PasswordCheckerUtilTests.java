package main.java.by.itAcademy.Prakapenka.lesson13;

/**
 * Тесты работы утилитарного класса PasswordCheckerUtil
 * для проверки паролей на коорректность ввода
 */

public class PasswordCheckerUtilTests {
    public static void main(String[] args) throws PasswordException {
        String[] rightPasswords = {"stathem123", "ITAcademy2", "UserPC1234"};
        String[] falsePasswords = {"little", "VeryBiggggggggggggggggggggggggggg1", "OnlyLetters", "12345678912"};

        TestForRightPasswords(rightPasswords);
        TestForFalsePasswords(falsePasswords);
    }

    public static void TestForRightPasswords(String[] passwords) throws PasswordException {
        for(String password : passwords){
            try {
                if (!PasswordCheckerUtil.checkCorrPassword(password)){
                    System.out.println("Good test for password " + password);
                }
            }catch (PasswordException e){
                System.out.println("Error in method for password " + password + " - test is not right! Look in log.");
            }
        }
    }

    public static void TestForFalsePasswords(String[] passwords) throws PasswordException {
        for(String password : passwords){
            try {
                if (!PasswordCheckerUtil.checkCorrPassword(password)){
                    System.out.println("Something strange for password " + password + " - it is right!");
                }
            }catch (PasswordException e){
                System.out.println("Everything is good, exception is thrown for password " + password);
            }
        }
    }
}
