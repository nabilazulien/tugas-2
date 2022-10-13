import java.util.Scanner;

public class RumusBangunDatarRuang {
    public static double luasSegitiga() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan alas = ");
        double alas = scanner.nextInt();
        System.out.println("masukkan tinggi = ");
        double tinggi = scanner.nextInt();
        double luas = alas * tinggi / 2;
        return luas;

        //        if (angka == 2){
//            System.out.println("masukan alas = ");
//            double alas = scanner.nextInt();
//            System.out.println("masukkan tinggi = ");
//            double tinggi = scanner.nextInt();
//            double sisi = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
//            System.out.println("keliling segitiga =" +alas + tinggi + sisi);
//        }
    }

    public static double kelilingsegitiga(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan alas = ");
        double alas = scanner.nextInt();
        System.out.println("masukkan tinggi = ");
        double tinggi = scanner.nextInt();
        double sisi = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        double keliling = alas + tinggi + sisi;
        return keliling;
    }


}
