package assigment;
import java.util.ArrayList;

public class Whatsapp {
    private String username;
    private boolean isBusinessAccount;

    public Whatsapp(String username, boolean isBusinessAccount) {
        this.username = username;
        this.isBusinessAccount = isBusinessAccount;
    }

    public void sendBroadcastMessage(String msg, ArrayList<String> recipients) {
        System.out.println("Broadcasting message: " + msg + " to: " + recipients);
    }

    public void createGroup(String name, ArrayList<String> members) {
        System.out.println("Creating group: " + name + " with members: " + members);
    }

    public void myProfile() {
        System.out.println("Username: " + username);
        System.out.println("Business Account: " + isBusinessAccount);
    }
}