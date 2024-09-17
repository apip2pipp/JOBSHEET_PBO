package jobsheet3;

public class motorDemo14 {
    public static void main(String[] args) {
        motor14 motor1 = new motor14();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.displayStatus();

       
        int kecepatanBaru = 50;
        if (!motor1.isMesinOn() && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor1.setKecepatan(kecepatanBaru);
        }
        motor1.displayStatus();

       
        motor14 motor2 = new motor14();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setMesinOn(true);
        motor2.setKecepatan(150); 
        motor2.displayStatus();

        motor14 motor3 = new motor14();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(-10);  
        motor3.displayStatus();
    }
}
