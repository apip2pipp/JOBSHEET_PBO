package studyCase;

public class pesanan14 {
    private menu14 menu;
    private pelanggan14 pelanggan;
    private int jumlah;
    private double totalHarga;

    public pesanan14(menu14 menu, pelanggan14 pelanggan, int jumlah) {
        this.menu = menu;
        this.pelanggan = pelanggan;
        this.jumlah = jumlah;
        this.totalHarga = hitungTotal();
    }

    public double hitungTotal() {
        return menu.getHarga() * jumlah;
    }

    public String getDetailPesanan() {
        return "Detail Pesanan:\n" +
               "Menu: " + menu.getInfo() + "\n" +
               "Jumlah: " + jumlah + "\n" +
               "Total Harga: " + totalHarga;
    }
    
}
