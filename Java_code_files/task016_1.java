import java.util.HashMap;
import java.util.Map;

public class task016_1 {
    public static void main(String[] args) {
        // Lookup examples
        Element e1 = Element.valueOfLabel("Helium");
        System.out.println("Found by label: " + e1);

        Element e2 = Element.valueOfAtomicNumber(10);
        System.out.println("Found by atomic number: " + e2);

        Element e3 = Element.valueOfAtomicWeight(1.008f);
        System.out.println("Found by atomic weight: " + e3);
    }
}

enum Element {
    H("Hydrogen", 1, 1.008f),
    HE("Helium", 2, 4.0026f),
    LI("Lithium", 3, 6.94f),
    BE("Beryllium", 4, 9.0122f),
    B("Boron", 5, 10.81f),
    C("Carbon", 6, 12.011f),
    N("Nitrogen", 7, 14.007f),
    O("Oxygen", 8, 15.999f),
    F("Fluorine", 9, 18.998f),
    NE("Neon", 10, 20.180f);

    public final String label;
    public final int atomicNumber;
    public final float atomicWeight;

    private static final Map<String, Element> BY_LABEL = new HashMap<>();
    private static final Map<Integer, Element> BY_ATOMIC_NUMBER = new HashMap<>();
    private static final Map<Float, Element> BY_ATOMIC_WEIGHT = new HashMap<>();

    static {
        for (Element e : values()) {
            BY_LABEL.put(e.label, e);
            BY_ATOMIC_NUMBER.put(e.atomicNumber, e);
            BY_ATOMIC_WEIGHT.put(e.atomicWeight, e);
        }
    }

    Element(String label, int atomicNumber, float atomicWeight) {
        this.label = label;
        this.atomicNumber = atomicNumber;
        this.atomicWeight = atomicWeight;
    }

    public static Element valueOfLabel(String label) {
        return BY_LABEL.get(label);
    }

    public static Element valueOfAtomicNumber(int number) {
        return BY_ATOMIC_NUMBER.get(number);
    }

    public static Element valueOfAtomicWeight(float weight) {
        return BY_ATOMIC_WEIGHT.get(weight);
    }
}
