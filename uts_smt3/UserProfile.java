package uts_smt3;

public class UserProfile {
    private int userId;
    private String password;
    private String name;
    private int age;
    private String emailId;
    private String doc;
    private boolean isAdmin; // Tambahan untuk membedakan Admin

    public UserProfile(int userId, String password, String name, int age, String emailId, String doc, boolean isAdmin) {
        this.userId = userId;
        this.password = password;
        this.name = name;
        this.age = age;
        this.emailId = emailId;
        this.doc = doc;
        this.isAdmin = isAdmin; // Inisialisasi status Admin
    }

    public int getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmailId() {
        return emailId;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public void editProfile(String name, int age, String emailId) {
        this.name = name;
        this.age = age;
        this.emailId = emailId;
    }

    public String showDocuments() {
        return "Documents: " + doc;
    }
}
