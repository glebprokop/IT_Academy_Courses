package main.java.by.itAcademy.Prakapenka.lesson13;

import java.io.*;

public class PasswordCheckerUtil {
    private static String regexPassword = "(.*[a-zA-Z])(.*[0-9])";

    public static boolean checkCorrPassword(String password) throws PasswordException {
        if ((password.length() < 8)||(password.length() > 20)){
            throw new PasswordException("Error in length of password!");
        } else if ((!password.matches(regexPassword))){
            throw new PasswordException("Error in password - it need to contain latin symbols and numbers!");
        }

        return false;
    }

}
