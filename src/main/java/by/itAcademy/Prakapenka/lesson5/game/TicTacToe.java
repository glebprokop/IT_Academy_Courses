/*in array:
    0 - zero
    1 - cross
    9 - empty field
 */


package main.java.by.itAcademy.Prakapenka.lesson5.game;




public class TicTacToe {
    public static void main(String[] args) {
        int[][] testArr = {{1, 9, 1}, {9, 0, 9}, {9, 9, 9}};
        drowField(testArr);
    }

    public static void drowField(int[][] arrayField){
        for (int[] x : arrayField){
            System.out.println();
            for (int y : x){
                if (y == 9){
                    System.out.print("-");
                }
                else if (y == 0){
                    System.out.print("o");
                }
                else{
                    System.out.print("x");
                }
            }
        }
    }

    public static void moveGamer(int gamerType){
        if (gamerType % 2 == 1)


    }



}
