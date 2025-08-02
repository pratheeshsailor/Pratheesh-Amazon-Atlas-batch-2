public class PepperoniPizza extends Pizza {
    @Override
    public void preparation() {
        System.out.println("Preparing pepperoni toppings and dough.");
    }

    @Override
    public void baking() {
        System.out.println("Baking pepperoni pizza at 350 degrees.");
    }

    @Override
    public void cutting() {
        System.out.println("Cutting pepperoni pizza into slices.");
    }

    @Override
    public void boxing() {
        System.out.println("Boxing pepperoni pizza in official box.");
    }
}
