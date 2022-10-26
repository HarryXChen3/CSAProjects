package test;

import java.lang.reflect.Field;

public class Calculator {
    public static double mul(final double x0, final double x1) { return x0 * x1; }
    public static double div(final double x0, final double x1) { return x0 / x1; }
    public static double add(final double x0, final double x1) { return x0 + x1; }
    public static double sub(final double x0, final double x1) { return x0 - x1; }
    public static double mod(final double x0, final double x1) { return x0 % x1; }

    public String toString() {
        final StringBuilder builder = new StringBuilder("%s(");
        for (final Field field : this.getClass().getDeclaredFields()) {
            try {
                builder.append(String.format("%s = %s; ", field.getName(), field.get(this)));
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
        }

        //return String.format(builder)
        return "";
    }
}
