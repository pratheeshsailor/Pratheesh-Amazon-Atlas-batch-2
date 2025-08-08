package Task02.BuilderDesignPattern;

class Laptop {
    private String name;
    private int memory;
    private int storage;

    public Laptop() {
        System.out.println("Laptop constructor called");
    }

    // Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getMemory() {
        return memory;
    }
    public void setMemory(int memory) {
        this.memory = memory;
    }

    public int getStorage() {
        return storage;
    }
    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", memory=" + memory +
                "GB, storage=" + storage +
                "GB}";
    }
}