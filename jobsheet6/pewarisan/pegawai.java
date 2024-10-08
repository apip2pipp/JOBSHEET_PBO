package pewarisan;

public class pegawai {
    public String nip;
    public String nama;
    public double gaji;

    public pegawai() {
        System.out.println("Objek dari class Pegawai dibuat");
    }

    public String getInfo() {
        String info = "";
        info += "NIP   : " + nip + "\n";
        info += "Nama  : " + nama + "\n";
        info += "Gaji  : " + gaji + "\n";
        return info;
    }
}
