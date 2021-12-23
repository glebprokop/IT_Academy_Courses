package main.java.by.itAcademy.Prakapenka.lesson16.PersonStream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.Random;

public class PersonStream
{
    public static void main(String[] args) {
        List<Person> myCity = new ArrayList<>();
        myCity = generatePersonList(myCity, 50);

        Map<String, List<Person>> myCitySorted = myCity.stream()
                .filter(person -> person.getAge() < 21)
                .peek(person -> System.out.println(person))
                .sorted(Comparator.comparing((Person person) -> person.getName()).thenComparing((Person person) -> person.getSurName()))
                .limit(4)
                .collect(Collectors.groupingBy(Person::getSurName));

        System.out.println(myCitySorted.keySet());
    }

    public static List<Person> generatePersonList(List<Person> generatedList, int length){
        String names[] = {"Hleb", "Yliana", "Aleksandr", "Daria", "Maria"};
        String surNames[] = {"Petrov", "Ivanov", "Sidorov", "Suvorov"};

        int minAge = 15;
        int maxAge = 30;
        int randomAge = minAge + new Random().nextInt(maxAge - minAge + 1);


        for (int i = 0; i < length; i++){
            generatedList.add(new Person(names[(new Random()).nextInt(names.length)],
                    surNames[(new Random()).nextInt(surNames.length)],
                    minAge + new Random().nextInt(maxAge - minAge + 1)));
        }
        return generatedList;
    }
}
