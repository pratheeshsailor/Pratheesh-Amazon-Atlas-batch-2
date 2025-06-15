class OuterClasses {
    int x = 10;
    static class InnerClass {
        int y = 5;
    }
}

public class task013 {
    public static void main(String[] args) {
        OuterClasses myOuter = new OuterClasses();
        OuterClasses.InnerClass myInner = new OuterClasses.InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}
