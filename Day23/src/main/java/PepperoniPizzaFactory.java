public class PepperoniPizzaFactory extends PizzaFactory {
    @Override
    public Pizza createPizza() {
        System.out.println("Creating a PepperoniPizza via factory...");
        return new PepperoniPizza();
    }
}
