package Task03;

public class Main {
    public static void main(String[] args) {
        Colors blackPrototypeObj = new BlackConcretePrototype("Black Color");
        Colors whitePrototypeObj = new WhiteConcretePrototype("White Color");

        Colors clonedBlackObj = blackPrototypeObj.clone();
        Colors clonedWhiteObj = whitePrototypeObj.clone();

        clonedBlackObj.setName("Dark Color");
        clonedWhiteObj.setName("Light Color");

        System.out.println("Black color is: " + clonedBlackObj.getName());
        System.out.println("White color is: " + clonedWhiteObj.getName());
    }
}