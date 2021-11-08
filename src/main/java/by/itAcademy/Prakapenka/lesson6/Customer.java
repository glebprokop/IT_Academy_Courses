package main.java.by.itAcademy.Prakapenka.lesson6;

import java.util.Scanner;
import java.util.Calendar;

class Customer {

    private String firstName;
    private String secondName;
    private String patronymic;
    private int birthYear;
    private int cardNumber;
    private int bankAccount;

    Customer(){
    }

    Customer(String firstName, String secondName, String patronymic, int birthYear, int cardNumber, int bankAccount){
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
        this.birthYear = birthYear;
        this.cardNumber = cardNumber;
        this.bankAccount = bankAccount;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getSecondName(){
        return this.secondName;
    }

    public String getPatronymic(){
        return this.patronymic;
    }

    public int getCardNumber(){
        return this.cardNumber;
    }

    public int getBankAccount(){
        return this.bankAccount;
    }

    public void printClientInfo(){
        System.out.println("Information about client:");
        System.out.println("First name: " + this.firstName);
        System.out.println("Second name: " + this.secondName);
        System.out.println("Patronymic: " + this.patronymic);
        System.out.println("Birth year: " + this.birthYear);
        System.out.println("Card number: " + this.cardNumber);
        System.out.println("Bank account: " + this.bankAccount);
    }

    public int getAge() {
        Calendar cal = Calendar.getInstance();
        return  (cal.get(Calendar.YEAR) - this.birthYear);
    }
}
