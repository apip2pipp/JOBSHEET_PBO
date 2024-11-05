package uts_smt3;

public class Main {
    public static void main(String[] args) {
        // Membuat UserProfile untuk User biasa
        UserProfile userProfile = new UserProfile(1, "1234", "ApipJAKI", 25, "Jakiapip123@gmail.com", "pdf", false);
        
        // Membuat UserProfile untuk Admin
        UserProfile adminProfile = new UserProfile(2, "admin123", "adminGemink", 30, "adminGemink@gmail.com", "pdf", true);

        // Login sebagai User
        User user = new User(userProfile);
        System.out.println(user.logIn(1, "1234"));  // Login User

        // Login sebagai Customer dan verifikasi dokumen
        Customer customer = new Customer(userProfile);
        System.out.println(customer.applyVerification("pdf"));  // Verifikasi Customer

        // Login sebagai Admin
        Admin admin = new Admin(adminProfile);
        System.out.println(admin.adminLogin(2, "admin123"));  // Login Admin

        // Verifikasi Customer oleh Admin
        System.out.println(admin.verifyUser(customer));
    }
}
