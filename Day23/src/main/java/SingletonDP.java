class SingletonDemo {
    private static SingletonDemo instance;

    // Private constructor to prevent external instantiation
    private SingletonDemo() {
        System.out.println("initiating the singleton");
    }

    // Public method to access the singleton instance
    public static SingletonDemo getInstance() {
        if (instance == null) {
            instance = new SingletonDemo();
            System.out.println("in get instance");
        }
        return instance;
    }

    public void doHere() {
        System.out.println("doing here some thing");
    }
}

public class SingletonDP {
    public static void main(String[] args) {
        SingletonDemo.getInstance().doHere();

        // Uncommenting the below lines would cause a compile-time error
        // because the constructor is private:
        // SingletonDemo obj = new SingletonDemo();
    }
}
