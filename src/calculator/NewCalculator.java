package calculator;

public class NewCalculator {

    public int addition(int num1, int num2) {
//        int total = num1+num2;


        return num1+num2;
    }

    public void minus(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    public double divide(int num1, int num2) {
//        System.out.println(num1 / num2);
        return num1/num2;

    }

    private void multiple(int num1, int num2) {
        System.out.println(num1 * num2);
    }
}
