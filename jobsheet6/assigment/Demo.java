package assigment;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        // Demonstrasi penggunaan kelas Mail
        Mail mail = new Mail("apip123@gmail.com", new ArrayList<>(Arrays.asList("rika123@gmail.com", "reezjei@gmail.com")));
        mail.sendMessage("Info meeting gan tapi after meeting beel", "reezjei@gmail.com");
        mail.showAllContacts();

        System.out.println(); // Baris kosong untuk memisahkan output

        // Demonstrasi penggunaan kelas Whatsapp
        Whatsapp whatsapp = new Whatsapp("apip234", true);
        whatsapp.sendBroadcastMessage("Info meeting di cafe jam 2pm", new ArrayList<>(Arrays.asList("reji", "rikka")));
        whatsapp.createGroup("Project Team", new ArrayList<>(Arrays.asList("rikka", "reji")));
        whatsapp.myProfile();

        System.out.println(); // Baris kosong untuk memisahkan output

        // Demonstrasi penggunaan kelas Email
        Email email = new Email(new ArrayList<>(Arrays.asList("Work", "Important")), "John Doe");
        email.sendDocument("https://docs.google.com/pentingPol", "reezjei@gmail.com");
    }
}