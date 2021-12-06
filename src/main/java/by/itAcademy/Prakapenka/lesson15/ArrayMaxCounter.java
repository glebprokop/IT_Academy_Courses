package main.java.by.itAcademy.Prakapenka.lesson15;

import java.util.Random;

public class ArrayMaxCounter implements Runnable
{
    Thread newTh;

    public ArrayMaxCounter(){
        newTh = new Thread(this);
    }

    @Override
    public void run() {
        int newRandomArray[] = getRandomArray();
        int newMaxValue = getMaxValueInArray(newRandomArray);
        Thread.yield();

        System.out.println("In thread " + newTh.getName() + " for random array max value is " + newMaxValue);
    }

    public static int[] getRandomArray(){
        Random rand = new Random();
        int generatedArray[] = new int[10];

        for(int i = 0; i < 10; i++){
            generatedArray[i] = rand.nextInt();
        }
        return generatedArray;
    }

    public static int getMaxValueInArray(int[] array){
        int maxValue = array[0];

        for (int curValue: array) {
            if (maxValue < curValue){
                maxValue = curValue;
            }
        }
        return maxValue;
    }
}
