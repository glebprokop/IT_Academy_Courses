package main.java.by.itAcademy.Prakapenka.lesson13;

public class PasswordException extends Exception{

    public PasswordException() {
    }

    public PasswordException(String message) {
        super(message);
    }

    public PasswordException(String message, Throwable cause) {
        super(message, cause);
    }
}
