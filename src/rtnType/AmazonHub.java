package rtnType;

public class AmazonHub {

    public int driverCount(int division, int eachDivisionDriver) {
//        int division = 10;
//        int eachDivisionDriver = 5;
        int totalDriver = division * eachDivisionDriver;
        return totalDriver;
    }

    public static void main(String[] args) {

        AmazonHub amazonHub = new AmazonHub();

        int allDriver = amazonHub.driverCount(10,5);

        System.out.println(allDriver);

        int anotherDriverCount = amazonHub.driverCount(15, 20);

        System.out.println(anotherDriverCount);
    }
}
