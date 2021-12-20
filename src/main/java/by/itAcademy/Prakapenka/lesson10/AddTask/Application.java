package main.java.by.itAcademy.Prakapenka.lesson10.AddTask;

public class Application {
    public static void main(String[] args) {
        TShort tShortWithRedPicture = new TShort(Size.XS, 100, "Red");
        Pants pantsGreen = new Pants(Size.L, 150, "Green");
        Pants pantsBlack = new Pants(Size.L, 200, "Black");
        Skirt skirtGray = new Skirt(Size.S, 500, "Gray");
        Tie tieRed = new Tie(Size.M, 1000, "Red");

        Clothes allClothes[] = {tShortWithRedPicture, pantsBlack, pantsGreen, skirtGray, tieRed};

        System.out.println("Info about man clothes:");
        ClothesStudio.dressMan(allClothes);

        System.out.println("Info about woman clothes:");
        ClothesStudio.dressWoman(allClothes);
    }
}
