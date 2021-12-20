package main.java.by.itAcademy.Prakapenka.lesson17.SynhroObject;

public class SynhroExerciseTest
{
    public static void main(String[] args) throws InterruptedException {
        SynhroExercise synchroTest = new SynhroExercise();

        for (int i = 0; i < 10; i++) {
            Thread newThread = new Thread(synchroTest);
            newThread.start();
        }
    }
}
