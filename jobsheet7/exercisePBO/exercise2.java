package jobsheet7.exercisePBO;

public class exercise2 {
   
        void perkalian(int a, int b) {
            System.out.println(a * b);
        }
    
        void perkalian(double a, double b) {
            System.out.println(a * b);
        }
    
        public static void main(String args[]) {
            exercise2 objek = new exercise2();
    
            objek.perkalian(25, 43);
            objek.perkalian(34.56, 23.7);
        }

    
}
