package jobsheet8;

public class AlatElektronik {
    private double harga;
    private String warna;
    private String merk;

    public AlatElektronik(double harga, String warna, String merk) {
        this.harga = harga;
        this.warna = warna;
        this.merk = merk;
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public String getWarna() {
        return warna;
    }

    public String getMerk() {
        return merk;
    }

    public String getInfo() {
        return "AlatElektronik: Merk = " + merk + ", Warna = " + warna + ", Harga = " + harga;
    }
}

