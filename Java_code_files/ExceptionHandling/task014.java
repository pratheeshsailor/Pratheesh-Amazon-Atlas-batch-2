// OuterClass.java
class OuterClas {
    int x = 50;               // instance field

    // Non‑static inner class
    class InnerClas {
        public int innerMethod() {
            return x;         // can directly access OuterClass.this.x
        }
    }
}

// DriverClass.java
public class task014 {
    public static void main(String[] args) {
        OuterClas myOuter = new OuterClas();
        // Instantiate inner class via the outer instance:
        OuterClas.InnerClas myInner = myOuter.new InnerClas();

        // This will print 50
        System.out.println(myInner.innerMethod());
    }
}

