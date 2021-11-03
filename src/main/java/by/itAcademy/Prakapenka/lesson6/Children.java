package main.java.by.itAcademy.Prakapenka.lesson6;

import java.util.Scanner;

class Children {

    private String firstName;
    private String secondName;
    private int age;

    Children(){
    }

    Children (String firstName, String secondName, int age){
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public void inputInfo(){
        System.out.println("Input the first name:");
        Scanner userScn = new Scanner(System.in);
        this.firstName = userScn.nextLine();
        System.out.println("Input the second name:");
        this.secondName = userScn.nextLine();
        System.out.println("Input the age (years):");
        this.age = userScn.nextInt();
    }

    public void printInfo(){
        System.out.println("Name: " + this.firstName);
        System.out.println("Second name: " + this.secondName);
        System.out.println("Age: " + this.age + " years");
    }
}
