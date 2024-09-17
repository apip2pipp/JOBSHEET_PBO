package jobsheet2;

public class MahasiswaDemo {
    public static void main(String[] args) {
        // First student object
        mahasiswa14 m14_1 = new mahasiswa14();
        m14_1.nim = "022342";
        m14_1.nama = "Afif Khosyid";
        m14_1.alamat = "JALAN PISANG KIPAS";
        m14_1.kelas = "2G_SIB";
        m14_1.displayBiodata();

        System.out.println();
        // Second student object
        mahasiswa14 m14_2 = new mahasiswa14();
        m14_2.nim = "022343";
        m14_2.nama = "Budi Santoso";
        m14_2.alamat = "JALAN MANGGA BESAR";
        m14_2.kelas = "3H_SIB";
        m14_2.displayBiodata();
    }
}
