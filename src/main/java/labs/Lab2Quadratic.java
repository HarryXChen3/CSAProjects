package labs;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Lab2Quadratic {
    public static double distance(final int x0, final int y0, final int x1, final int y1) {
        final int dx, dy;
        return Math.sqrt((dx = x1 - x0) * dx + (dy = y1 - y0) * dy);
    }

    private static double discrim(final double a, final double b, final double c) {
        return (b * b) - 4 * a * c;
    }

    private static double round2(final double x0) {
        final BigDecimal bd = BigDecimal.valueOf(x0);
        return bd.setScale(2, RoundingMode.HALF_UP).doubleValue();
    }

    public static void quadratic(final double a, final double b, final double c) {
        final double sqrtDisc, a2;
        final double x0 = (-b + (sqrtDisc = Math.sqrt(discrim(a, b, c))))/(a2 = 2 * a);
        final double x1 = (-b - sqrtDisc)/a2;
        System.out.printf("x1 = %.2f, x2 = %.2f%n", round2(x0), round2(x1));
    }

    public static void main(final String[] args) {
        assert distance(0, 0, 3, 4) == 5;
        quadratic(1, 7.5, 12);
        quadratic(1, -3, 2);
    }
}