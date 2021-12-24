package main.java.by.itAcademy.Prakapenka.lesson12.AddMethods;

import main.java.by.itAcademy.Prakapenka.lesson12.Pet;

import java.util.*;
//import java.util.Iterator;


public class AdditionalMethods
{
    public static void main(String[] args) {
        //тесты на проверку уникальных значений в мапах
        Map<String, String> falseMap = new HashMap<>();
        falseMap.put("Anastasia", "Suvorova");
        falseMap.put("Hleb", "Prakapenka");
        falseMap.put("Daria", "Drutsko");
        falseMap.put("Viktoria", "Suvorova"); // повторяющийся элемент для false

        Map<String, String> emptyMap = new HashMap<>();

        Map<String, String> trueMap = new HashMap<>();
        trueMap.put("Anastasia", "Suvorova");
        trueMap.put("Jason", "Stathem");

        System.out.println("For falseMap result is " + isUnique(falseMap));
        System.out.println("For emptyMap result is " + isUnique(emptyMap));
        System.out.println("For trueMap result is " + isUnique(trueMap));

        //тесты на проверку совпадающих чисел
        Set<Integer> list1 = new HashSet<>();
        list1.add(1);
        list1.add(2);
        list1.add(14);
        list1.add(24);
        list1.add(13);
        list1.add(14);

        Set<Integer> list2 = new HashSet<>();
        list2.add(1);
        list2.add(4);
        list2.add(14);
        list2.add(12);

        System.out.println("Number of common is " + countCommon(list1, list2));

        //тесты для метода на удаление четных строк
        Set<String> list3 = new HashSet<>();
        list3.add("Kol");
        list3.add("Lopa");
        list3.add("Emp");
        list3.add("String");
        list3.add("Food");

        System.out.println(removeEvenLength(list3));
    }

    public static boolean isUnique(Map<String, String> map){
        HashSet<String> set = new HashSet<>();

        for (String key : map.keySet()) {
            String value = map.get(key);

            if (set.contains(value))
                return false;

            set.add(value);
        }
        return true;
    }

    public static int countCommon(Set<Integer> list1, Set<Integer> list2){
        list1.retainAll(list2);
        return list1.size();
    }

    public static Set<String> removeEvenLength(Set<String> set){
        Iterator<String> iterSet = set.iterator();

        while(iterSet.hasNext()) {
            if (iterSet.next().length() % 2 == 0){
                iterSet.remove();
            }
        }
        return set;
    }
}

