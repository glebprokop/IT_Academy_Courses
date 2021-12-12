package main.java.by.itAcademy.Prakapenka.lesson17.SynhroObject;

import java.util.ArrayList;
import java.util.List;

public class SynhroExerciseTest
{
    public static void main(String[] args) throws InterruptedException {
        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < 10; i++){
            threadList.add(new Thread(new SynhroExercise()));
        }

        for(Thread thread : threadList){
            thread.start();
            thread.join();
        }
    }
}
