package main.java.by.itAcademy.Prakapenka.lesson7;
 
import java.util.Locale;

public class BaseTaskSeven {
    public static void main(String[] args) {
        String userTestStr = "Like Java Core";


        System.out.println(calculateCommas(userTestStr));
        workWithString(userTestStr);
        getStringWithLastLetter(userTestStr);

    }

    public static void workWithString(String userString) {
        System.out.println(userString.charAt(userString.length() - 1));
        System.out.println("Is user`s string end in '!!!'? - " + userString.endsWith("!!!"));
        System.out.println("Is user`s string start with 'I like'? - " + userString.startsWith("I like"));
        System.out.println("Is user`s string contain substring 'Java'? - " + userString.contains("Java"));
        System.out.println("String with 'a' replaced by 'o' - " + userString.replace("a", "o"));
        System.out.println("String in upper case - " + userString.toUpperCase(Locale.ROOT));
        System.out.println("String in lower case - " + userString.toLowerCase(Locale.ROOT));

        if (userString.contains("Java")) {
            int javaPos = userString.indexOf("Java");

            System.out.println("The position (index) of substring 'Java' is " + javaPos);
            System.out.println("String without 'Java' is - " + userString.substring(0, javaPos) + userString.substring(javaPos + 4));
        }
    }

    public static int calculateCommas(String userString){
        int numberCommas = 0;
        char elem;

        for(int i = 0; i < userString.length(); i++){
            elem = userString.charAt(i);
            if(elem == ',') {
                numberCommas++;
            }
        }
        return numberCommas;
    }

    public static String getStringWithLastLetter(String userString){
        String[] splitString = userString.split( " ");
        String stringLastLetter = "";

        for(String str : splitString){
            stringLastLetter += str.charAt(str.length() - 1);
        }
        return stringLastLetter;
    }
}
