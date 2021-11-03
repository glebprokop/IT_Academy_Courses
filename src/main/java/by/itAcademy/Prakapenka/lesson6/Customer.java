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

    public void setValues(){
        Scanner scn = new Scanner(System.in);
        String userInput;

        //switch in do-while loop
        do{
            System.out.println("You can set attributes for the next values: \n" +
                    "1 to first name, " +
                    "2 to second name, " +
                    "3 to patronymic, " +
                    "4 to birth year, " +
                    "5 to card number, " +
                    "6 to bank account`s number " +
                    "and input 0 for exit.");

            userInput = scn.nextLine();

            switch (userInput) {
                case "1":
                    this.firstName = scn.nextLine();
                    break;
                case "2":
                    this.secondName = scn.nextLine();
                    break;
                case "3":
                    this.patronymic = scn.nextLine();
                    break;
                case  "4":
                    this.birthYear = Integer.parseInt(scn.nextLine());
                    break;
                case "5":
                    this.cardNumber = Integer.parseInt(scn.nextLine());
                    break;
                case "6":
                    this.bankAccount = Integer.parseInt(scn.nextLine());
                    break;
                case "0":
                    System.out.println("Finish!");
                    break;
                default:
                    System.out.println("Some error is coming, restart the program");
            }
        } while (! "0".equals(userInput));
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




