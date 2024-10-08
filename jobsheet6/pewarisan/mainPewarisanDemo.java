package pewarisan;

public class mainPewarisanDemo {
    public static void main(String[] args) {
        dosen dosen1 = new dosen();
        dosen1.nama = "Yansy Ayuningtyas";
        dosen1.nip = "34329837";
        dosen1.gaji = 3000000;
        dosen1.nidn = "1989432439";
        System.out.println(dosen1.getInfo());
    }
}