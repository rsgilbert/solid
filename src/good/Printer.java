package good;

/**
 * This printer class is responsibility for printing and formatting of the text
 * provided by SingleResponsibilityText class.
 */
public class Printer {
    private SingleResponsibilityText t;

    public Printer(SingleResponsibilityText t) {
        this.t = t;
    }

    // methods for formatting output
    public void printText() {
        System.out.println(this.t.getText());
    }

    public void printFirst(int n) {
        String t = this.t.getText().substring(0, n);
        System.out.println(t);
    }
}
