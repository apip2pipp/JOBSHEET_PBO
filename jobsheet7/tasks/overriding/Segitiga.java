package jobsheet7.tasks.overriding;

public class Segitiga {
    private int sudut;


    public int totalSudut(int sudutA) {
        return 180 - sudutA;
    }

    public int totalSudut(int sudutA, int sudutB) {
        return 180 - (sudutA + sudutB);
    }

   
    public int keliling(int sisiA, int sisiB, int sisiC) {
        return sisiA + sisiB + sisiC;
    }

    public double keliling(int sisiA, int sisiB) {
        
        return Math.sqrt((sisiA * sisiA) + (sisiB * sisiB));
    }

    public static void main(String[] args) {
        Segitiga segitiga = new Segitiga();

        
        System.out.println("Total Sudut (1 sudut): " + segitiga.totalSudut(90));
        System.out.println("Total Sudut (2 sudut): " + segitiga.totalSudut(60, 30));

      
        System.out.println("Keliling (3 sisi): " + segitiga.keliling(3, 4, 5));
        System.out.println("Keliling (2 sisi untuk segitiga siku-siku): " + segitiga.keliling(3, 4));
    }
}

