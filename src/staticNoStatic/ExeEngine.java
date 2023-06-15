package staticNoStatic;

public class ExeEngine {
    public static void main(String[] args) {
        Implementations im = new Implementations();

        im.bike();
//        im.drive();
        im.ride();


        System.out.println(Implementations.name);

        Implementations.drive();



    }
}
