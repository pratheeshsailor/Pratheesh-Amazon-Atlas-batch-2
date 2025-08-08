package prototype_Home_task;

public class Creeper implements Plant {
    private String growthType;

    public Creeper() {
        System.out.println("Creeper constructor is called");
    }

    public Creeper(String growthType) {
        this.growthType = growthType;
    }

    @Override
    public Plant grow() {
        System.out.println("Creeper grows by spreading on the ground or climbing.");
        return this;
    }

    @Override
    public String getGrowthType() {
        return growthType;
    }

    @Override
    public void setGrowthType(String growthType) {
        this.growthType = growthType;
    }

    @Override
    public Plant clone() {
        return new Creeper(this.growthType);
    }
}