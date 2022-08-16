package bad;

import java.util.Locale;

/**
 * This class violates the Single Responsibility principle.
 * It has methods that change the text and methods that print the text to user.
 * This means we can change it because we want to modify how the printing is done or
 * we can change it because we want to improve how the modifications are done to the properties.
 * The class therefore has multiple reasons to change.
 * A refactor of this class is the SingleResponsibilityText class.
 */
public class MultipleResponsibilityText {
    private String text;
    private String author;

    public String getText() { return this.text; }
    public int getLength() { return this.text.length(); }
    public void setText(String t) { this.text = t; }
    public void setAuthor(String a) { this.author = a; }

    public String getAuthor() {
        return author;
    }
    // methods that change the text
    public void allLettersToUpperCase() {
        this.text = this.text.toUpperCase(Locale.ROOT);
    }

    public void allLettersToLowerCase(){
        this.text = this.text.toLowerCase(Locale.ROOT);
    }

    // methods for formatting output
    public void printText() {
        System.out.println(this.text);
    }

    public void printFirst(int n) {
        String t = this.text.substring(0, n);
        System.out.println(t);
    }


}
