package main.java.by.itAcademy.Prakapenka.lesson17.SynhroMethod;

public class SynhroExerciseTwoTest
{
    public static void main(String[] args) throws InterruptedException {
        BuisnessLogicClass buisnessLogicObject = new BuisnessLogicClass();

        for (int i = 0; i < 10; i++){
            SynhroExerciseTwo synchroTest = new SynhroExerciseTwo(buisnessLogicObject);
            synchroTest.start();
        }
    }
}
