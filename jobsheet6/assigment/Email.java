package assigment;
import java.util.ArrayList;

public class Email {
    private ArrayList<String> label;
    private String name;

    public Email(ArrayList<String> label, String name) {
        this.label = label;
        this.name = name;
    }

    public void sendDocument(String urlDoc, String recipient) {
        System.out.println("Sending document from URL: " + urlDoc + " to: " + recipient);
    }
}