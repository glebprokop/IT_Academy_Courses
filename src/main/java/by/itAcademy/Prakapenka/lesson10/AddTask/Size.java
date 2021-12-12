package main.java.by.itAcademy.Prakapenka.lesson10.AddTask;

public enum Size
{
    XXS (32), XS (34), S (36), M (38), L (40);

    private int euroSize;

    Size(int euroSize) {
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    public void setEuroSize(int euroSize) {
        this.euroSize = euroSize;
    }
}
