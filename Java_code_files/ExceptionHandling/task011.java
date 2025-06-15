class OuterM {
    int x = 10;
    class InnerClass {
        int y = 5;
    }
}

public class task011 {
    public static void main(String[] args) {
        OuterM myOuter = new OuterM();
        OuterM.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myInner.y + myOuter.x);
    }
}