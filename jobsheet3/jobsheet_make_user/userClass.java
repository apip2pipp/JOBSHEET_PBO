package jobsheet3.jobsheet_make_user;
public class userClass {
    public String username;
    public String nama;
    public String email;
    public String alamat;
    public String pekerjaan;

    public userClass(String username, String nama, String email, String alamat, String pekerjaan) {
        this.username = username;
        this.nama = nama;
        this.email = email;
        this.alamat = alamat;
        this.pekerjaan = pekerjaan;
    }

    public void cetakInfo() {
        System.out.println("Username: " + username);
        System.out.println("Nama: " + nama);
        System.out.println("Email: " + email);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pekerjaan: " + pekerjaan);
        System.out.println("=====================");
    }
}
