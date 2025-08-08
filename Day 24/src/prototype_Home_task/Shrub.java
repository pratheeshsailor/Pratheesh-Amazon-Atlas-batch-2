package prototype_Home_task;

public class Shrub implements Plant {
    private String growthType;

    public Shrub() {
        System.out.println("Shrub constructor is called");
    }

    public Shrub(String growthType) {
        this.growthType = growthType;
    }

    @Override
    public Plant grow() {
        System.out.println("Shrub grows as a small to medium-sized woody plant.");
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
        return new Shrub(this.growthType);
    }
}
