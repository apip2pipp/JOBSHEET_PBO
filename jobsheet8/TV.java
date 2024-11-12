package jobsheet8;

public class TV extends AlatElektronik implements Audible {
    private String jenisLayar;
    private int volume;

    public TV(String jenisLayar, int volume, double harga, String warna, String merk) {
        super(harga, warna, merk);
        this.jenisLayar = jenisLayar;
        this.volume = volume;
    }

    public String getJenisLayar() {
        return jenisLayar;
    }

    public void setJenisLayar(String jenisLayar) {
        this.jenisLayar = jenisLayar;
    }

        
        public int getVolume() {
            return volume;
        }
    
        public void setVolume(int volume) {
            this.volume = volume;
        }

        @Override
        public void naikkanVolume(int increment) {
            volume += increment;
        }
    
        @Override
        public void turunkanVolume(int decrement) {
            volume -= decrement;
        }

        public String getInfo() {
            return "TV: Merk = " + getMerk() + ", Warna = " + getWarna() + 
                   ", Harga = " + getHarga() + ", Jenis Layar = " + jenisLayar +
                   ", Volume = " + volume;
        }
    }
    

