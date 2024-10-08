package jobsheet7.tasks.overloading;

public class Main {
    public static void main(String[] args) {
        
        Manusia manusia;
        manusia = new Dosen();
        manusia.bernafas();  
        manusia.makan();    
        
        manusia = new Mahasiswa();
        manusia.bernafas(); 
        manusia.makan();    
    }
}
