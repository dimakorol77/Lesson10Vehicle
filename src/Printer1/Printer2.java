package Printer1;

public class Printer2 extends Printer {
    protected String ANSI = "\u001B[33m";

    public void print(String value) {
        System.out.println(ANSI + value + ANSI_RESET);

    }
}
