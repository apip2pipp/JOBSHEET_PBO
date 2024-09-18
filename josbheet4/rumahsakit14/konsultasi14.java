package josbheet4.rumahsakit14;
import java.time.LocalDate;


public class konsultasi14 {
    private LocalDate tanggal;
    private pegawai14 dokter;
    private pegawai14 perawat;

    public LocalDate getTanggal() {
        return tanggal;
    }
    
    public void setTanggal(LocalDate tanggal) {
        this.tanggal = tanggal;
    }
    
    public pegawai14 getDokter() {
        return dokter;
    }
    
    public void setDokter(pegawai14 dokter) {
        this.dokter = dokter;
    }
    
    public pegawai14 getPerawat() {
        return perawat;
    }
    
    public void setPerawat(pegawai14 perawat) {
        this.perawat = perawat;
    }
    
    public String getInfo() {
    String info = "";
    info += "\tTanggal: " + tanggal;
    info += ", Dokter: " + dokter.getInfo();
    info += ", Perawat: " + perawat.getInfo();
    info += "\n";
    return info;
}

}
