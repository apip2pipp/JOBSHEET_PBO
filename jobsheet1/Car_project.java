public class Car_project {
    public static void main(String[] args) {
        // Deklarasi variabel
        String model1, model2, model3, model4, model5, model6, model7, model8, model9, model10;
        String color1, color2, color3, color4, color5, color6, color7, color8, color9, color10; //warna
        String p1, p2, p3, p4, p5, p6, p7, p8, p9, p10; // plat nomor
        boolean e1, e2, e3, e4, e5, e6, e7, e8, e9, e10; // Status mesin on atau tidak
        int mil1, mil2, mil3, mil4, mil5, mil6, mil7, mil8, mil9, mil10; // Jarak yang sudah ditempuh oleh mobil

        // Car 1-10
        // Car 1
        model1 = "Porsche";
        color1 = "Red";
        p1 = "B 1234 XYZ";
        e1 = true;
        mil1 = 10000;

        // Car 2
        model2 = "Ferrari";
        color2 = "Blue";
        p2 = "D 5678 ABC";
        e2 = false;
        mil2 = 15000;

        // Car 3
        model3 = "BMW F30";
        color3 = "Yellow";
        p3 = "H 9876 DEF";
        e3 = false;
        mil3 = 8000;

        // Car 4
        model4 = "Mercedes-Benz";
        color4 = "Black";
        p4 = "F 6543 GHI";
        e4 = false;
        mil4 = 12000;

        // Car 5
        model5 = "Audi A4";
        color5 = "White";
        p5 = "A 3210 JKL";
        e5 = false;
        mil5 = 9000;

        // Car 6
        model6 = "Lamborghini Aventador";
        color6 = "Green";
        p6 = "Z 5678 MNO";
        e6 = false;
        mil6 = 7000;

        // Car 7
        model7 = "Toyota Supra";
        color7 = "Orange";
        p7 = "B 4321 PQR";
        e7 = false;
        mil7 = 5000;

        // Car 8
        model8 = "Nissan GT-R";
        color8 = "Silver";
        p8 = "C 8765 STU";
        e8 = false;
        mil8 = 11000;

        // Car 9
        model9 = "Ford Mustang";
        color9 = "Blue";
        p9 = "D 3456 VWX";
        e9 = true;
        mil9 = 9500;

        // Car 10
        model10 = "Chevrolet Camaro";
        color10 = "Red";
        p10 = "E 9876 YZA";
        e10 = true;
        mil10 = 6000;

        // =update Jarak tempuh mobil
        mil1 = updateMil(mil1, 200);
        mil2 = updateMil(mil2, 150);
        mil3 = updateMil(mil3, 100);
        mil4 = updateMil(mil4, 300);
        mil5 = updateMil(mil5, 50);

        // Mencetak detail dari semua Car
        printCarDetails("Car 1", model1, color1, p1, e1, mil1);
        printCarDetails("Car 2", model2, color2, p2, e2, mil2);
        printCarDetails("Car 3", model3, color3, p3, e3, mil3);
        printCarDetails("Car 4", model4, color4, p4, e4, mil4);
        printCarDetails("Car 5", model5, color5, p5, e5, mil5);
        printCarDetails("Car 6", model6, color6, p6, e6, mil6);
        printCarDetails("Car 7", model7, color7, p7, e7, mil7);
        printCarDetails("Car 8", model8, color8, p8, e8, mil8);
        printCarDetails("Car 9", model9, color9, p9, e9, mil9);
        printCarDetails("Car 10", model10, color10, p10, e10, mil10);
    }


    
    public static int updateMil(int mil, int distance) {
        mil += distance;
        return mil;
    }

    // Menggunakan method function untuk mencetak detail Car
    public static void printCarDetails(String carNumber, String model, String color, String plat, boolean engineOn, int mileage) {
        System.out.println("===============================");
        System.out.println(carNumber);
        System.out.println("Model = " + model);
        System.out.println("Color = " + color);
        System.out.println("Plat = " + plat);
        System.out.println("Engine On = " + engineOn);
        System.out.println("Mileage = " + mileage + " km");
        System.out.println("===============================");
    }
}
