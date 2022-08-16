import bad.MultipleResponsibilityText;
import good.Printer;
import good.SingleResponsibilityText;

public class Main {
    public static void main(String[] args) {
        runSingleResponsibility();
    }

    static void runMultipleResponsibility() {
        MultipleResponsibilityText multipleResponsibilityText = new MultipleResponsibilityText();
        multipleResponsibilityText.setText("Jabulani jabulani Africa");
        multipleResponsibilityText.setAuthor("Gil");

        multipleResponsibilityText.printText();
        multipleResponsibilityText.printFirst(5);

        // modify
        multipleResponsibilityText.allLettersToUpperCase();
        multipleResponsibilityText.printText();
        multipleResponsibilityText.allLettersToLowerCase();
        multipleResponsibilityText.printFirst(10);
    }

    static void runSingleResponsibility() {
        SingleResponsibilityText singleResponsibilityText = new SingleResponsibilityText();
        singleResponsibilityText.setText("Bwendowoza jenvude mukwano oyinza okunumya");
        singleResponsibilityText.setAuthor("Rob");

        Printer printer = new Printer(singleResponsibilityText);

        printer.printText();
        printer.printFirst(7);

        // modify
        singleResponsibilityText.allLettersToUpperCase();
        printer.printText();
        singleResponsibilityText.allLettersToLowerCase();
        printer.printFirst(20);
    }
}
