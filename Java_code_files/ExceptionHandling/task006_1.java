public class task006_1 {
    public static void main(String args[]) {
        try {
            int a[] = new int[2];
            System.out.println("Access element three :" + a[1]); // try with a[0] or a[1]  ===> and check if control goes to inner try block..
            try {
                int b = 0;
                int c = 1/b;
            }catch(Exception e) {
                System.out.println("Exception thrown: " + e);
            }
            System.out.println("Access element three :" + a[3]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception thrown: " + e);
        }
        System.out.println("Out of the block");
    }

}
