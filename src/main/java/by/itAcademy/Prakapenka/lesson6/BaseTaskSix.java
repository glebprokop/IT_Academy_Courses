package main.java.by.itAcademy.Prakapenka.lesson6c;

import java.util.ArrayList;
import java.util.List;

public class BaseTaskSix {
    public static void main(String[] args) {
        //for the first method (look more in tests class)
        int[] testArray = {3, 2, 1};
        System.out.println(checkNumbersMoreIndex(testArray));

        //for the sec method
        int[][] testArray2 = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        String[] outArray = matrixRowAndColumn(testArray2, 2, 3);
        for (String pr : outArray){
            System.out.println(pr);
        }

        //work with method for array of customers
        Customer Bob = new Customer("Bob", "Murray", "Alexis", 1987, 1111, 12);
        Customer Jason = new Customer("Jason", "Statham", "unknown", 1968, 1234, 11);
        Customer Darya = new Customer("Darya", "Drutsko", "unknown", 1996, 1551, 10);

        Customer[] customersArray = {Bob, Jason, Darya};
        List<Customer> checkedUsers = workWithCustomerArray(customersArray);

        System.out.println("The next users have card number finished in 1 (one):");
        for (Customer user : checkedUsers){
            System.out.println(user.getFirstName() + " " + user.getSecondName());
        }
    }

    public static String checkNumbersMoreIndex (int[] array){
        String sortedNumbers = "";

        for (int i = 0; i < array.length; i++){
            if (array[i] > i){
                sortedNumbers += array[i] + " ";
            }
        }
        return sortedNumbers;
    }

    public static String[] matrixRowAndColumn(int[][] matrix, int row, int column){
        String returnedRow = "";
        String returnedColumn = "";

        //rows
        for (int r : matrix[row - 1]){
            returnedRow += r + " ";
        }

        //columns
        for (int[] c : matrix){
            returnedColumn += c[column - 1] + " ";
        }

        return new String[] {returnedRow, returnedColumn};
    }

    //i used collections for the best returned result (i want to use dynamic array)
    public static List<Customer> workWithCustomerArray(Customer[] customersArray){
        List<Customer> checkedUsers = new ArrayList<Customer>();

        for (Customer user : customersArray){
            int userCard = user.getCardNumber();
            if (userCard % 10 == 1) {
                checkedUsers.add(user);
            }
        }
        return checkedUsers;
    }
}
