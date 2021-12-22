package main.java.by.itAcademy.Prakapenka.lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.Callable;

public class RandomGenerator implements Callable<String> {

    @Override
    public String call() throws InterruptedException {
        List<Integer> intList = new ArrayList();
        Integer sum = 0;

        for (int i = 0; i < 10; i++){
            intList.add(new Random().nextInt());
            sum += intList.get(i);
        }
        Thread.sleep(new Random().nextInt(10000));
        return Thread.currentThread().getName() + " " + sum;
    }
}
