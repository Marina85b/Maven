package org.example;

public class main {

    public static void main (String [] args) {
        BonusService service = new BonusService();
        long amount = 1000;
        boolean registered = true;
        long expected = 30;
        long actual = service.calculate(amount, registered);
        boolean passed = expected == actual;
        System.out.println(passed);
    }
}
