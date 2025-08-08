package Task02.BuilderDesignPattern;

class LaptopConcreteBuilder implements LaptopBuilder {
    private Laptop laptop;

    public LaptopConcreteBuilder() {
        this.laptop = new Laptop();
    }

    @Override
    public LaptopBuilder buildName(String name) {
        laptop.setName(name);
        return this;
    }

    @Override
    public LaptopBuilder buildMemory(int memory) {
        laptop.setMemory(memory);
        return this;
    }

    @Override
    public LaptopBuilder buildStorage(int storage) {
        laptop.setStorage(storage);
        return this;
    }

    @Override
    public Laptop build() {
        return laptop;
    }
}
