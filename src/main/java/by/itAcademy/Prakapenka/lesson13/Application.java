package main.java.by.itAcademy.Prakapenka.lesson13;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        ArrayList<User> dataBase = new ArrayList<>();
        dataBase.add(new User("Daria", "Drutsko123"));
        dataBase.add(new User("Hleb", "TheBest123"));
        dataBase.add(new User("Uliana", "GoodGirl1"));

        registrationMethod(userInputLogPass(), dataBase);
    }

    public static void registrationMethod(User user, ArrayList<User> dataBase){
        try{
            if(checkUserDate(user, dataBase)){
                System.out.println("User " + user.getUserName() + " is successfully authorised");
            } else{
                if(!PasswordCheckerUtil.checkCorrPassword(user.getPassword())){
                    System.out.println("This user is not in database!");
                }
            }

        } catch (PasswordException e) {
            System.out.println(e);
        }
    }

    public static boolean checkUserDate(User user, ArrayList<User> dataBase){
        for (User userDB : dataBase){
            if ((userDB.getUserName().equals(user.getUserName()))&&(userDB.getPassword().equals(user.getPassword()))){
                return true;
            }
        }

        return false;
    }

    public static User userInputLogPass (){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input login and press Ent...");
        String userLogin = sc.nextLine();
        System.out.println("Input password and press Ent...");
        String userPassword = sc.nextLine();

        return new User(userLogin, userPassword);
    }
}
