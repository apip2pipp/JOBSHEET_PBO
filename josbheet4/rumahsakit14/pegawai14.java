package josbheet4.rumahsakit14;


public class pegawai14 {
    private String nip14;
    private String nama14;

    public pegawai14(String nip14, String nama14){
        this.nip14 = nip14;
        this.nama14 = nama14;
    }

    public String getNip() {
        return nip14;
    }
    
    public void setNip(String nip) {
        this.nip14 = nip14;
    }
    
    public String getNama() {
        return nama14;
    }
    
    public void setNama(String nama) {
        this.nama14 = nama14;
    }
    
    public String getInfo(){
        return nama14 + "("+ nip14 +")";
    }
}