package main.java.by.itAcademy.Prakapenka.lesson13;

public class PasswordCheckerUtil {
    private static final String REGEXPASSWORD = "(.*[a-zA-Z])(.*[0-9])";

    public static boolean checkCorrPassword(String password) throws PasswordException {
        if ((password.length() < 8)||(password.length() > 20)){
            throw new PasswordException("Error in length of password!");
        } else if ((!password.matches(REGEXPASSWORD))){
            throw new PasswordException("Error in password - it need to contain latin symbols and numbers!");
        }

        return false;
    }

}
