package studyCase;

import java.util.ArrayList;

public class menu14 {
    private String namaMakanan;
    private double harga;
    private String kategori;
    private ArrayList<pesanan14> daftarPesanan;

    public menu14(String namaMakanan, double harga, String kategori) {
        this.namaMakanan = namaMakanan;
        this.setHarga(harga);
        this.kategori = kategori;
        this.daftarPesanan = new ArrayList<>();
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void tambahPesanan(pesanan14 pesanan) {
        daftarPesanan.add(pesanan);
    }

    public String getInfo() {
        return "" + namaMakanan + "\n" 
        + "Harga: " + getHarga() + "\n" 
        + "Kategori: " + kategori + "\n" ;
        
    }
}
