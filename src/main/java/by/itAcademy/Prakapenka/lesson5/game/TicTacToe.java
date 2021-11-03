/*in array: 0 - zero 1 - cross 9 - empty field */
package main.java.by.itAcademy.Prakapenka.lesson5.game;

import java.util.Scanner;

public class TicTacToe {
    public static void main(String[] args) {
        gameTicTacToe();
    }

    public static void drowField(int[][] gameField) {
        for (int[] x : gameField) {
            System.out.println();
            for (int y : x) {
                if (y == 9) {
                    System.out.print("-");
                } else if (y == 0) {
                    System.out.print("o");
                } else {
                    System.out.print("x");
                }
            }
        }
        System.out.println("");
    }

    public static void gameTicTacToe(){
        System.out.println("Let`s start the game. \nEnter the number from 1 to 9, to make a move, in the next matrix:\n 1 2 3 \n 4 5 6 \n 7 8 9");
        int[][] gameField = {{9, 9, 9}, {9, 9, 9}, {9, 9, 9}};
        int userType = 1;

        while (isGameFinish(gameField) != true){
            if (userType % 2 != 0){
                gameField = userMakeMove(1, gameField);
            } else{
                gameField = userMakeMove(0, gameField);
            }
            userType += 1;
            drowField(gameField);
        }

        if (userType % 2 == 0){
            System.out.println("User 'Cross' win!");
        }
        else{
            System.out.println("User 'Zero' win!");
        }

    }

    public static int[][] userMakeMove(int typeUser, int[][] gameField) {
        int[][] newGameField = gameField;
        String user;

        if (typeUser == 0) {
            System.out.println("User`s 'Zero' move");
            user = "Zero";
        } else {
            System.out.println("User`s 'Cross' move");
            user = "Cross";
        }

        int userMove = takeNumberFromScanner();

        if (checkUserMove(userMove, gameField) == false) {
            System.out.println("Incorrect input, try again!");
            return userMakeMove(typeUser, gameField);
        } else {
            System.out.println("User " + user + " make a move!");
            int stringNumber = (userMove - 1) / 3;
            int columnNumber = userMove - (stringNumber * 3) - 1;
            newGameField[stringNumber][columnNumber] = typeUser;
            return newGameField;
        }
    }

    public static boolean checkUserMove(int userMove, int[][] gameField) {
        int stringNumber = (userMove - 1) / 3;
        int columnNumber = userMove - (stringNumber * 3) - 1;

        if ((userMove < 1) || (userMove > 9) || (gameField[stringNumber][columnNumber] != 9)) {
            return false;
        } else {
            return true;
        }
    }

    public static boolean isGameFinish(int[][] gameField) {
        int[] crossRowWin = {1, 1, 1};
        int[] zeroRowWin = {0, 0, 0};

        //checking for rows
        for (int[] row : gameField) {
            if ((row.equals(crossRowWin)) || (row.equals(zeroRowWin))) {
                return true;
            }
        }

        int[] checkingArray = new int[3];
        //checking for columns
        for (int i = 0; i < 3; i++) {
            //columns
            if ((gameField[0][i] == gameField[1][i]) && (gameField[1][i] == gameField[2][i]) && (gameField[0][i] != 9)) {
                return true;
            }
            //rows
            else if ((gameField[i][0] == gameField[i][1]) && (gameField[i][1] == gameField[i][2]) && (gameField[i][0] != 9)){
                return true;
            }
            //diagonals
            else if (((gameField[0][0] == gameField[1][1]) && (gameField[1][1] == gameField[2][2]) && (gameField[1][1] != 9)) ||
                    ((gameField[2][0] == gameField[1][1]) && (gameField[1][1] == gameField[0][2]) && (gameField[1][1] != 9))){
                return true;
            }
        }
        return false;
    }

    public static int takeNumberFromScanner() {
        Scanner gameScn = new Scanner(System.in);
        return gameScn.nextInt();
    }
}
