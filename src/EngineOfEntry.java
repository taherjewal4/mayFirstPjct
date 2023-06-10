import calculator.CalculatorMachine;

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

    }

}
