package Printer1;

public class Printer {
    protected String ANSI = "\u001B[30m";
    protected String ANSI_RESET = "\u001B[0m";

    public void print (String value) {
        System.out.println(value);
    }

}

