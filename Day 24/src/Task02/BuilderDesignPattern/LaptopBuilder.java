package Task02.BuilderDesignPattern;

interface LaptopBuilder {
    LaptopBuilder buildName(String name);
    LaptopBuilder buildMemory(int memory);
    LaptopBuilder buildStorage(int storage);
    Laptop build();
}