package constructor;

public class EntryExecutions {
    public static void main(String[] args) {

        Home home = new Home();
        home.testHome();

        Home hm = new Home("villa");
        hm.testHome();
    }
}
