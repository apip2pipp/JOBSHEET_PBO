package josbheet4.rumahsakit14;

import java.time.LocalDate;
import java.util.ArrayList;

public class pasien {
    private String noRekamMedis;
    private String nama;
    private ArrayList<konsultasi>riwayatKonsultasi;

    

    public String getNoRekamMedis() {
        return noRekamMedis;
    }
    
    public void setNoRekamMedis(String noRekamMedis) {
        this.noRekamMedis = noRekamMedis;
    }
    
    public String getNama() {
        return nama;
    }
    
    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getInfo(){
        String info = "";
        info += "No Rekam Medis     : " + this.noRekamMedis + "\n";
        info += "Nama               : " + this.nama + "\n";
        info += "\n";
        if (!riwayatKonsultasi.isEmpty()) {
            info += "Riwayat konsultasi : \n";

            for(konsultasi konsultasi :riwayatKonsultasi){
                info += konsultasi.getInfo();
            }
        } else {
            info += "Belum ada riwayat konsultasi";
        }

        info += "\n";

        return info;
    }
    
    public pasien(String noRekamMedis, String nama){
        this.noRekamMedis = noRekamMedis;
        this.nama =  nama;
        this.riwayatKonsultasi = new ArrayList<konsultasi>();
        
    }

    public void tambahKonsultasi(LocalDate tanggal, pegawai dokter,pegawai perawat) {
        konsultasi konsultasi = new konsultasi();
        konsultasi.setTanggal(tanggal);
        konsultasi.setDokter(dokter);
        konsultasi.setPerawat(perawat);
        riwayatKonsultasi.add(konsultasi);
    }
}
