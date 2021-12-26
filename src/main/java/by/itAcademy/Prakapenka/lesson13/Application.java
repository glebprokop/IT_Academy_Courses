package main.java.by.itAcademy.Prakapenka.lesson13;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        HashMap<String, String> passwordDataBase = new HashMap<>();
        passwordDataBase.put("Daria", "Drutsko123");
        passwordDataBase.put("Hleb", "TheBest123");
        passwordDataBase.put("Uliana", "GoodGirl1");

        registrationMethod(userInputLogPass(), passwordDataBase);
    }

    public static void registrationMethod(String[] user, HashMap dataBase){

        try{
            if(checkUserDate(user, dataBase)){
                System.out.println("User " + user[0] + " is successfully authorised");
            } else{
                if(!PasswordCheckerUtil.checkCorrPassword(user[1])){
                    System.out.println("This user is not in database!");
                }
            }

        } catch (PasswordException e) {
            System.out.println(e);
        }
    }

    public static boolean checkUserDate(String[] user, HashMap dataBase){
        Iterator<Map.Entry<String, String>> dataBaseIterator = dataBase.entrySet().iterator();

        while (dataBaseIterator.hasNext()) {
            Map.Entry<String, String> nextUser = dataBaseIterator.next();
            if ((nextUser.getKey().equals(user[0]))&&(nextUser.getValue().equals(user[1]))){
                return true;
            }
        }

        return false;
    }

    public static String[] userInputLogPass (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input login and press Ent...");
        String userLogin = sc.nextLine();
        System.out.println("Input password and press Ent...");
        String userPassword = sc.nextLine();

        return new String[] {userLogin, userPassword};
    }
}
