package jobsheet3.jobsheet_motor;

public class motorMain {
    public static void main(String[] args) {
        motorClass motor1 = new motorClass();
        motor1.setPlatNomor("B 0838 XZ");
        motor1.displayStatus();

       
        int kecepatanBaru = 50;
        if (!motor1.isMesinOn() && kecepatanBaru > 0) {
            System.out.println("Kecepatan tidak boleh lebih dari 0 jika mesin off");
        } else {
            motor1.setKecepatan(kecepatanBaru);
        }
        motor1.displayStatus();

       
        motorClass motor2 = new motorClass();
        motor2.setPlatNomor("N 9840 AB");
        motor2.setMesinOn(true);
        motor2.setKecepatan(150); 
        motor2.displayStatus();

        motorClass motor3 = new motorClass();
        motor3.setPlatNomor("D 8343 CV");
        motor3.setKecepatan(-10);  
        motor3.displayStatus();
    }
}
