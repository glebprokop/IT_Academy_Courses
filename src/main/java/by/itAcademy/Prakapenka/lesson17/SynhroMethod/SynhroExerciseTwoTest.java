package main.java.by.itAcademy.Prakapenka.lesson17.SynhroMethod;

import java.util.ArrayList;
import java.util.List;

public class SynhroExerciseTwoTest
{
    public static void main(String[] args) throws InterruptedException {
        List<SynhroExerciseTwo> threadList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            threadList.add(new SynhroExerciseTwo());
        }

        for(SynhroExerciseTwo thread : threadList){
            thread.start();
            thread.join();
        }
    }
}
