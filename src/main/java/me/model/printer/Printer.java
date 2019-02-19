package main.java.me.model.printer;

public class Printer {
    public void print() {
        System.out.println("I can print the documents!");
    }

    public static void main(String[] args) {
        ColorPrinter colorPrinter = new ColorPrinter();
        BlackAndWhitePrinter blackAndWhitePrinter = new BlackAndWhitePrinter();
        colorPrinter.print();
        blackAndWhitePrinter.print();
    }
}
