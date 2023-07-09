package finalFinally;

public class Materials {

    final static String str = "Hello world";

    public static void main(String[] args) {

//      Final is a keyword in java, when you say final with any method, variables, class. you cannot change the value of it!
//      str = "hello Java";
        System.out.println(str);

//      Finally is block of code that always used with the try catch block
        try {
            System.out.println("Hello ooooo ");

            int num = 2 / 2;

            System.out.println("num : " + num);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("This sentence must be executed");
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
    }
}
