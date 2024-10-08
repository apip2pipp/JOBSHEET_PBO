package jobsheet7.exercisePBO;

public class exercise {
    
        void perkalian(int a, int b) {
            System.out.println(a * b);
        }
    
        void perkalian(int a, int b, int c) {
            System.out.println(a * b * c);
        }
    
        public static void main(String args[]) {
            exercise objek = new exercise   ();
    
            objek.perkalian(25, 43);
            objek.perkalian(34, 23, 56);
        }
  
    
}
