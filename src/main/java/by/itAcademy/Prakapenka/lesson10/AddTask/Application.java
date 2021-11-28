package main.java.by.itAcademy.Prakapenka.lesson10.AddTask;

public class Application {
    public static void main(String[] args) {
        TShort tShortWithRedPicture = new TShort(38, 100, "Red");
        Pants pantsGreen = new Pants(40, 150, "Green");
        Pants pantsBlack = new Pants(38, 200, "Black");
        Skirt skirtGray = new Skirt(36, 500, "Gray");
        Tie tieRed = new Tie(10, 1000, "Red");

        Clothes allClothes[] = {tShortWithRedPicture, pantsBlack, pantsGreen, skirtGray, tieRed};

        System.out.println("Info about man clothes:");
        ClothesStudio.dressMan(allClothes);

        System.out.println("Info about woman clothes:");
        ClothesStudio.dressWoman(allClothes);
    }
}
