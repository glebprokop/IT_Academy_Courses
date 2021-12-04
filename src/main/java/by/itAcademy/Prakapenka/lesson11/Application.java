package main.java.by.itAcademy.Prakapenka.lesson11;

import java.util.ArrayList;
import java.util.Iterator;

public class Application {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<Student>();

        students.add(new Student("Jason", "A", 1, new int[]{2, 0, 3, 0}));
        students.add(new Student("Hleb", "B", 3, new int[] {4, 5, 2, 3}));
        students.add(new Student("Uliana", "B", 2, new int[] {4, 4, 2, 4}));
        students.add(new Student("Daria", "C", 2, new int[] {5, 4, 5, 5}));
        students.add(new Student("Aleks", "A", 1, new int[] {4, 5, 3, 2}));
        students.add(new Student("Sergei", "B", 4, new int[] {4, 4, 3, 4}));

        students = filterStudents(students);

        printStudents(students, 2);
        printStudents(students, 3);
        printStudents(students, 5);
    }

    public static ArrayList<Student> filterStudents(ArrayList<Student> students){
        Iterator<Student> filterStudents = students.iterator();

        while(filterStudents.hasNext()) {
            Student nextStudent = filterStudents.next();
            if (nextStudent.getAverageMark() < 3){
                filterStudents.remove();
            } else{
                nextStudent.setCourse(nextStudent.getCourse() + 1);
            }
        }
        return students;
    }

    public static void printStudents(ArrayList<Student> students, int course){
        Iterator<Student> checkedStudents = students.iterator();

        while(checkedStudents.hasNext()) {
            Student nextStudent = checkedStudents.next();

            if (nextStudent.getCourse() == course){
                System.out.println("The student " + nextStudent.getName() + " study on the course number " + nextStudent.getCourse());
            }
        }
    }
}
