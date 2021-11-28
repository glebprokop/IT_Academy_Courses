package main.java.by.itAcademy.Prakapenka.lesson10.AddTask;

public class ClothesStudio
{
    public static void dressMan(Clothes[] clothes){
        for (Clothes elemClothes : clothes){
            if (ClothesMan.class.isAssignableFrom(elemClothes.getClass())){
                System.out.println("Man " + elemClothes.toString() +
                        ": \n size - " + elemClothes.size +
                        "\n cost - " + elemClothes.cost +
                        "\n color - " + elemClothes.color);
            }
        }
    }

    public static void dressWoman(Clothes clothes[]){
        for (Clothes elemClothes : clothes){
            if (ClothesMan.class.isAssignableFrom(elemClothes.getClass())){
                System.out.println("Woman " + elemClothes.toString() +
                        ": \n size - " + elemClothes.size +
                        "\n cost - " + elemClothes.cost +
                        "\n color - " + elemClothes.color);
            }
        }
    }
}
