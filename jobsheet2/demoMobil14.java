package jobsheet2;
public class demoMobil14 {
    public static void main(String[] args) {
        // Instansiasi dua objek dari class Mobil
        mobil14 mobil1 = new mobil14("Toyota", "Avanza");
        mobil14 mobil2 = new mobil14("Honda", "Civic");

        // Menampilkan informasi awal dari kedua mobil
        System.out.println("Informasi awal mobil1:");
        mobil1.tampilkanInfo();
        System.out.println("\nInformasi awal mobil2:");
        mobil2.tampilkanInfo();

        System.out.println();

        // Menambah kecepatan mobil1 dan mobil2
        System.out.println("mobil1");
        mobil1.tambahKecepatan(20);
        System.out.println("mobil2");
        mobil2.tambahKecepatan(40);

        // Mengurangi kecepatan mobil1 dan mobil2
        System.out.println("mobil1");
        mobil1.kurangiKecepatan(10);
        System.out.println("mobil2");
        mobil2.kurangiKecepatan(30);

        // Menampilkan informasi setelah perubahan kecepatan
        System.out.println("\nInformasi setelah perubahan kecepatan mobil1:");
        mobil1.tampilkanInfo();
        System.out.println("\nInformasi setelah perubahan kecepatan mobil2:");
        mobil2.tampilkanInfo();
    }
}
