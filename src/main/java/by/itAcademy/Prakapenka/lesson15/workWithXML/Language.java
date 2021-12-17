package main.java.by.itAcademy.Prakapenka.lesson15.workWithXML;

public class Language
{
    private String name;

    public Language() {
    }

    public Language(String  name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Language{" +
                "name='" + name + '\'' +
                '}';
    }
}
