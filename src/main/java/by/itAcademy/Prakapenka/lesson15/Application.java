package main.java.by.itAcademy.Prakapenka.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Application
{
    public static void main(String[] args) {

        ArrayMaxCounter a0 = new ArrayMaxCounter();
        ArrayMaxCounter a1 = new ArrayMaxCounter();
        ArrayMaxCounter a2 = new ArrayMaxCounter();
        ArrayMaxCounter a3 = new ArrayMaxCounter();
        ArrayMaxCounter a4 = new ArrayMaxCounter();
        ArrayMaxCounter a5 = new ArrayMaxCounter();
        ArrayMaxCounter a6 = new ArrayMaxCounter();
        ArrayMaxCounter a7 = new ArrayMaxCounter();
        ArrayMaxCounter a8 = new ArrayMaxCounter();
        ArrayMaxCounter a9 = new ArrayMaxCounter();

        List<ArrayMaxCounter> workList = Arrays.asList(a0, a1, a2, a3, a4, a5, a6, a7, a8, a9);

        for (ArrayMaxCounter a : workList){
            a.newTh.start();
        }

    }
}
