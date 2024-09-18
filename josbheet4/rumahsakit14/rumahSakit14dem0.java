package josbheet4.rumahsakit14;
import java.time.LocalDate;

public class rumahSakit14dem0 {
    public static void main(String[] args) {
        pegawai14 ani = new pegawai14("1234", "dr. Ani");
        pegawai14 bagus = new pegawai14("4567", "dr. Bagus");
        
        pegawai14 desi = new pegawai14("1234", "Ns. Desi");
        pegawai14 eka = new pegawai14("4567", "Ns. Eka");

        pasien14 pasien1 = new pasien14("343298", "Puspa Widya");
        pasien1.tambahKonsultasi(LocalDate.of(2021, 8, 11), ani, desi);
        pasien1.tambahKonsultasi(LocalDate.of(2021, 9, 11), bagus, eka);

        System.out.println(pasien1.getInfo());

        pasien14 pasien2 = new pasien14("997744", "Yenny Anggraeni");
        System.out.println(pasien2.getInfo());
    }


}
