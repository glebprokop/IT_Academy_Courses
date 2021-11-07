package main.java.by.itAcademy.Prakapenka.lesson5.game;
import java.util.Arrays;

public class GameTest {
    public static void main(String[] args) {
        //drowFieldTest();
        userMakeMoveTest();
        //isGameFinishTest();
    }

    public static void drowFieldTest(){
        int[][] testField = {{1, 9, 1}, {9, 0, 9}, {9, 9, 9}};
        System.out.println("Test for drowing game field.");
        TicTacToe.drowField(testField);
    }

    public static void userMakeMoveTest(){
        int[][] testField = {{1, 9, 1}, {9, 0, 9}, {9, 9, 9}};
        int[][] testRightField = {{1, 1, 1}, {9, 0, 9}, {9, 9, 9}};

        int[][] workOut = TicTacToe.userMakeMove(1, testField);

        for (int[] x : workOut) System.out.println(Arrays.toString(x));
    }

    public static void isGameFinishTest(){
        int[][] testField = {{1, 9, 1}, {1, 9, 9}, {1, 9, 9}};
        boolean result = TicTacToe.isGameFinish(testField);
        System.out.println(result);
        TicTacToe.drowField(testField);
    }
}