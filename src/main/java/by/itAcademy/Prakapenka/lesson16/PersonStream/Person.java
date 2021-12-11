package main.java.by.itAcademy.Prakapenka.lesson16.PersonStream;

import java.util.Random;

public class Person
{
    private String name;
    private String surName;
    private int age;

    public Person() {}

    public Person(String names[], String surNames[], int ages[]){
        /**
         * Не знаю, насколько корректно использовать конструктор в качестве
         * генератора объектов класса со случайными параметрами, показалось,
         * что это может быть логичным. В любом случае лучше, чем создавать 50
         * экземпляров класса вручную )))
         */
        this.name = names[(new Random()).nextInt(names.length)];
        this.surName = surNames[(new Random()).nextInt(surNames.length)];
        this.age = ages[(new Random()).nextInt(ages.length)];
    }

    public Person(String name, String surName, int age) {
        this.name = name;
        this.surName = surName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surName='" + surName + '\'' +
                ", age=" + age +
                '}';
    }
}
