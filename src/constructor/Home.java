package constructor;

public class Home {

    private String name;


    public Home() {
    }

    public Home(String name) {
        this.name = name;
    }

    public void testHome() {
        System.out.println("home -> " + name);
    }
}
