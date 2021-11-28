package main.java.by.itAcademy.Prakapenka.lesson12;

public abstract class Pet
{
    public String name;
    public int ages;

    public Pet(String name, int ages){
        this.name = name;
        this.ages = ages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAges() {
        return this.ages;
    }

    public void setAges(int ages) {
        this.ages = ages;
    }

    public abstract void speak();
}
