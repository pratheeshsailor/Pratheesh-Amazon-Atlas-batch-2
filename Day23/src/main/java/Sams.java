public class Sams {
    public static void main(String[] args) {
        PizzaFactory pfobj = new PepperoniPizzaFactory();
        Pizza pobj = pfobj.createPizza();

        pobj.preparation();
        pobj.baking();
        pobj.cutting();
        pobj.boxing();
    }
}
