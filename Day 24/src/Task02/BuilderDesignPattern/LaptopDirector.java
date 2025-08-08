package Task02.BuilderDesignPattern;

class LaptopDirector {
    private LaptopBuilder laptopBuilder;

    public LaptopDirector(LaptopBuilder laptopBuilder) {
        this.laptopBuilder = laptopBuilder;
    }

    public Laptop constructLaptop() {
        return laptopBuilder
                .buildName("Acer i3 Gen9")
                .buildMemory(32)
                .buildStorage(1024)
                .build();
    }
}
