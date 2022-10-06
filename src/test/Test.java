package test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.*;

public class Test {
    public static void main(final String[] args) throws InvocationTargetException, IllegalAccessException {
        final Class<Calculator> calculatorClass = Calculator.class;
        final Method[] methods = calculatorClass.getDeclaredMethods();

        final HashMap<String, Method> methodMap = new HashMap<>(methods.length);
        for (final Method method : methods) {
            methodMap.put(method.getName(), method);
        }

        System.out.println("Supported Ops:");
        for (final Map.Entry<String, Method> methodEntry : methodMap.entrySet()) {
            System.out.printf("%s | ", methodEntry.getKey());
        }

        while (true) {
            final Scanner inputScanner = new Scanner(System.in);
            System.out.println("Select operation (or quit):");

            final String opSelect = inputScanner.nextLine();
            if (opSelect.equalsIgnoreCase("quit"))
                break;

            final Method opMethod = methodMap.get(opSelect);
            if (opMethod == null) {
                System.out.printf("\"%s\" is not a valid operation!%n", opSelect);
            } else {
                System.out.println("Enter x0:");
                final double x0 = inputScanner.nextDouble();

                System.out.println("Enter x1:");
                final double x1 = inputScanner.nextDouble();

                System.out.printf("Out: %s%n", opMethod.invoke(Calculator.class, x0, x1));
            }
        }
    }
}