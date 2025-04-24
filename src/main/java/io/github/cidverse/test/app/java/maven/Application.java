package io.github.cidverse.test.app.java.maven;

public class Application {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int sum = calc.add(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        System.out.println("Sum: " + sum);
    }

}
