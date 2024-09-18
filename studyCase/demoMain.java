package studyCase;

public class demoMain {
    public static void main(String[] args) {
        menu14 menu1 = new menu14("Nasi Goreng", 25000, "Makanan");
        pelanggan14 pelanggan1 = new pelanggan14("Budi", "P001");

        pesanan14 pesanan1 = pelanggan1.buatPesanan(menu1, 2);
        System.out.println(pesanan1.getDetailPesanan());
    }

}
