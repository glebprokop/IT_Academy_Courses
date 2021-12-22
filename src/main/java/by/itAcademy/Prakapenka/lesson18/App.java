package main.java.by.itAcademy.Prakapenka.lesson18;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable newRG = new RandomGenerator();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future<String>> results = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            results.add(executorService.submit(newRG));
        }

        for (Future<String> fS : results){
            System.out.println(fS.get());
        }
        executorService.shutdown();
    }
}
