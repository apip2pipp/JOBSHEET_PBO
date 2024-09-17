package jobsheet2;
public class mobil14 {
    
        // Atribut
        private String merk;
        private String model;
        private int kecepatan;
    
        // Konstruktor
        public mobil14(String merk, String model) {
            this.merk = merk;
            this.model = model;
            this.kecepatan = 0; // Kecepatan awal 0
        }
    
        // Method untuk menampilkan informasi mobil
        public void tampilkanInfo() {
            System.out.println("Merk   : " + merk);
            System.out.println("Model  : " + model);
            System.out.println("Kecepatan: " + kecepatan + " km/jam");
        }
    
        // Method untuk menambah kecepatan
        public void tambahKecepatan(int peningkatan) {
            kecepatan += peningkatan;
            System.out.println("Kecepatan bertambah " + peningkatan + " km/jam.");
        }
    
        // Method untuk mengurangi kecepatan (rem)
        public void kurangiKecepatan(int pengurangan) {
            kecepatan -= pengurangan;
            if (kecepatan < 0) {
                kecepatan = 0; // Kecepatan tidak bisa kurang dari 0
            }
            System.out.println("Kecepatan berkurang " + pengurangan + " km/jam.");
        }
    }
    

