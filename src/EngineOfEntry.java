import calculator.CalculatorMachine;
import calculator.NewCalculator;

public class EngineOfEntry {


    public static void main(String[] args) {
        int vr = 110;
        int vr2 = 15;

        CalculatorMachine cl = new CalculatorMachine();

        cl.addition(vr, vr2);

        cl.minus(vr, vr2);

//        cl.divide(vr, vr2);
//
//        cl.multiple(vr, vr2);

        NewCalculator newC = new NewCalculator();

        int totalNumber = newC.addition(4, 9);
        System.out.println(totalNumber);


        double gpaAvg = newC.divide(20, 4);
        System.out.println(gpaAvg);

        int num = 10;
        System.out.println(num);
        int tl = ++num;
        System.out.println(tl);


//        if (num < 5) {
//            System.out.println("The statement in true");
//        } else {
//            System.out.println("The statement is false");
//        }

        String n = new String();
        n = "mae";
        System.out.println(n);

        if (num < 5 && num < 15) { // both has to be ture

            System.out.println("The statement in true with and && ");

        } else if (num < 5 || num > 15) {  // one of them has to be true

            System.out.println("The statement in true with and || ");

        } else {

            System.out.println("Non of them are correct");
        }


//        == means eaqual to (2 == 2) true
//
//        != mean notEqual to (2 != 2) false

//        % mean remainder  2 % 5 = 1

//
//
//

    }}