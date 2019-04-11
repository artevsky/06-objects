package objects;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Arguments {

    public Arguments(int a, int b) {
        print(add(a, b));
    }

    public Arguments(double a, double b) {
        print(add(a, b));
        BigDecimal ad = new BigDecimal(a);
        BigDecimal bd = new BigDecimal(b);
        System.out.println(ad.add(bd).setScale(3, RoundingMode.DOWN));
    }

    private int add(int a, int b) {
        return a + b;
    }

    private double add(double a, double b) {
        return a + b;
    }

    private void print(int c) {
        System.out.println(c);
    }

    private void print(double c) {
        System.out.println(c);
    }
}
