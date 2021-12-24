package main.java.by.itAcademy.Prakapenka.lesson12;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Application
{
    public static void main(String[] args) {
        Map<String, Pet> petMap = new HashMap<>();

        Cat Fedot = new Cat("Fedot", 5);
        Cat Timka = new Cat("Timka", 2);
        Dog Belka = new Dog("Belka", 10);
        Dog Strelka = new Dog("Strelka", 7);
        Parrot Jack = new Parrot("Jack", 5);

        petMap.put(Fedot.name, Fedot);
        petMap.put(Timka.name, Timka);
        petMap.put(Belka.name, Belka);
        petMap.put(Strelka.name, Strelka);
        petMap.put(Jack.name, Jack);

        printNames(petMap);
        petsSpeak(petMap);
    }

    public static void printNames(Map<String, Pet> petMap){
        System.out.println(petMap.keySet());
    }

    public static void petsSpeak(Map<String, Pet> petMap){
        Iterator<Map.Entry<String, Pet>> iterPet = petMap.entrySet().iterator();

        while(iterPet.hasNext()) {
            Map.Entry<String, Pet> nextPet =  iterPet.next();
            nextPet.getValue().speak();
        }
    }
}
