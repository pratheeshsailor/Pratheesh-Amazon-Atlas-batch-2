package prototype_Home_task;

public class Main {
    public static void main(String[] args) {
        // Original prototypes
        Plant creeperPrototype = new Creeper("Climbing Plant");
        Plant shrubPrototype = new Shrub("Bushy Plant");

        // Cloning from prototypes
        Plant clonedCreeper = creeperPrototype.clone();
        Plant clonedShrub = shrubPrototype.clone();

        // Changing clone names to prove independence
        clonedCreeper.setGrowthType("Ground Spreader");
        clonedShrub.setGrowthType("Flowering Shrub");

        // Showing original and clone info
        System.out.println("\nOriginal Creeper: " + creeperPrototype.getGrowthType());
        System.out.println("Cloned Creeper: " + clonedCreeper.getGrowthType());

        System.out.println("\nOriginal Shrub: " + shrubPrototype.getGrowthType());
        System.out.println("Cloned Shrub: " + clonedShrub.getGrowthType());

        // Growth actions
        clonedCreeper.grow();
        clonedShrub.grow();
    }
}
