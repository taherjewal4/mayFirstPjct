package calculator;

public class CalculatorMachine {

//    int num1 = 10; //global variables
//    int num2 = 5;

    public void addition(int num1, int num2) {//local variables
        System.out.println(num1 + num2);
    }

    public void minus(int num1, int num2) {
        System.out.println(num1 - num2);
    }

    private void divide(int num1, int num2) {
        System.out.println(num1 / num2);
    }

    private void multiple(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    // public, private, protected, default

}
