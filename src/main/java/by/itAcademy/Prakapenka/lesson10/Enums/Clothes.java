package main.java.by.itAcademy.Prakapenka.lesson10.Enums;

public enum Clothes {
    XXS (32) {
        @Override
        String getDescription() {
            return "Детский размер";
        }
    },
    XS (34), S (36), M (38), L (40);

    int euroSize;

    Clothes(int euroSize){
        this.euroSize = euroSize;
    }

    public int getEuroSize() {
        return euroSize;
    }

    String getDescription(){
        return ("Взрослый размер");
    }
}
