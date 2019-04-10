package objects;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Objects {
    public static void main(String[] args) {

        int ai = 2;
        int bi = 3;
        double ad = 3.01;
        double bd = 3.02;
        System.out.println(add(ai, bi));
        System.out.println(add(ad, bd));

        BigDecimal bd1 = new BigDecimal(ai);
        BigDecimal bd11 = new BigDecimal(bi);
        BigDecimal bd2 = new BigDecimal(ad);
        BigDecimal bd22 = new BigDecimal(bd);

//        System.out.println(ai + bi);
//        System.out.println(ad + bd);
        System.out.println(bd2.add(bd22).setScale(2, RoundingMode.DOWN));
    }

    public static int add(int ai, int bi) {
        return ai + bi;
    }

    public static double add(double ad, double bd) {
        return ad + bd;
    }
//    public static add(double ad, double bd) {
//        return ad + bd;
//    }
}
