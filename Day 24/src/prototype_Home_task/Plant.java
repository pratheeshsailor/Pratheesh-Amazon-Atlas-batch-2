package prototype_Home_task;

public interface Plant extends Cloneable {
    Plant grow();
    String getGrowthType();
    void setGrowthType(String growthType);
    Plant clone();
}