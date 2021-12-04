package main.java.by.itAcademy.Prakapenka.lesson11;

public class Student
{
    private String name;
    private String group;
    private int course;
    private  int[] allMarks;

    public Student(String name, String group, int course, int[] allMarks){
        this.name = name;
        this.group = group;
        this.course = course;
        this.allMarks = allMarks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int[] getAllMarks() {
        return allMarks;
    }

    public void setAllMarks(int[] allMarks) {
        this.allMarks = allMarks;
    }

    public double getAverageMark(){
        double sum = 0;

        for (int m : this.allMarks){
            sum += m;
        }
        return sum / this.allMarks.length;
    }
}
