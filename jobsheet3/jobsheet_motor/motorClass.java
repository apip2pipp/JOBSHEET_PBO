package jobsheet3.jobsheet_motor;

public class motorClass {

    private String platNomor;
    private boolean isMesinOn;
    private int kecepatan;

    private final int MAX_KECEPATAN = 100; 
    
    public void displayStatus() {
        System.out.println("Plat Nomor: " + this.platNomor);

        if (isMesinOn) {
            System.out.println("Mesin On");
        } else {
            System.out.println("Mesin Off");
        }

        System.out.println("Kecepatan: " + this.kecepatan);
        System.out.println("===============================");
    }

    public String getPlatNomor() {
        return platNomor;
    }
    
    public void setPlatNomor(String platNomor) {
        this.platNomor = platNomor;
    }
    
    public boolean isMesinOn() {
        return isMesinOn;
    }
    
    public void setMesinOn(boolean isMesinOn) {
        this.isMesinOn = isMesinOn;
    }
    
    public int getKecepatan() {
        return kecepatan;
    }
    
    public void setKecepatan(int kecepatan) {
        if (kecepatan > MAX_KECEPATAN) {
            System.out.println("Kecepatan melebihi batas maksimal! Mengatur kecepatan ke 100.");
            this.kecepatan = MAX_KECEPATAN; 
        } else if (kecepatan < 0) {
            System.out.println("Kecepatan tidak bisa negatif! Mengatur kecepatan ke 0.");
            this.kecepatan = 0; 
        } else {
            this.kecepatan = kecepatan;
        }
    }
}
