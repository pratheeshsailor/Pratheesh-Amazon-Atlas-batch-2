public class person {

    public String name;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;

    }
    public static void main(String[] args) {
        person s = new person();

        s.setName("Siri");

        System.out.println("Name: " + s.getName());
    }
}