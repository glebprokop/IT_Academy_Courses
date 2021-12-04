package main.java.by.itAcademy.Prakapenka.lesson14;

import java.io.*;

public class Application
{
    public static void main(String[] args) {
        String fileName = "../fil.txt";
        copyFile(fileName);

        String printedWay = "."; // путь для примера работы
        printDirectories(printedWay);
    }

    //additional task
    public static void printDirectories(String printedWay) {
        File file = new File(printedWay);

        if (file.isDirectory()){
            System.out.println("DIRECTORY: " + file);
            for (String f : file.list()) {
                printDirectories(printedWay + "/" + f);
            }
        }else{
            System.out.println("File: " + file.getName());
        }
    }

    //main task
    public static void copyFile(String file){
        try (Reader myReader = new FileReader(file);
             BufferedReader myBufReader = new BufferedReader(myReader)) {
             String nextStr;

             BufferedWriter myBufWriter = new BufferedWriter(new FileWriter("copiedFile.txt"));

             while ((nextStr = myBufReader.readLine()) != null) {
                 System.out.println(nextStr);
                 myBufWriter.write(nextStr + "\n");
                 myBufWriter.flush();
             }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
