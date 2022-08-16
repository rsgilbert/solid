package good;

import java.util.Locale;

/**
 * This class is a refactor of MultipleResponsibilityText.
 * We use two classes, one class is concerned with modifying the text, another
 * class is concerned with printing the text. The second class is the Printer class.
  */
public class SingleResponsibilityText {
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



}
