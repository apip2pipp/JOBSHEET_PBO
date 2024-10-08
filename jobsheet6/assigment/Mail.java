package assigment;

import java.util.ArrayList;

public class Mail {
    private String from;
    private ArrayList<String> contacts;

    public Mail(String from, ArrayList<String> contacts) {
        this.from = from;
        this.contacts = contacts;
    }

    public void sendMessage(String message, String to) {
        System.out.println("Sending message: " + message + " to: " + to);
    }

    public void showAllContacts() {
        System.out.println("Contacts: " + contacts);
    }
}