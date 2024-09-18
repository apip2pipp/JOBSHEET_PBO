package studyCase;

import java.util.ArrayList;

public class pelanggan14 {
    private String nama;
    private String idPelanggan;
    private ArrayList<pesanan14> daftarPesanan;

    public pelanggan14(String nama, String idPelanggan) {
        this.nama = nama;
        this.idPelanggan = idPelanggan;
        this.daftarPesanan = new ArrayList<>();
    }

    public pesanan14 buatPesanan(menu14 menu, int jumlah) {
        pesanan14 pesanan = new pesanan14(menu, this, jumlah);
        daftarPesanan.add(pesanan);
        menu.tambahPesanan(pesanan);
        return pesanan;
    }

    public String getInfo() {
        return "Pelanggan: " + nama + ", ID: " + idPelanggan;
    }
}
