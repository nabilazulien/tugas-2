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

<<<<<<< HEAD
    public static double kelilingsegitiga() {
=======
    public static double kelilingsegitiga(){
>>>>>>> origin/main
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan alas = ");
        double alas = scanner.nextInt();
        System.out.println("masukkan tinggi = ");
        double tinggi = scanner.nextInt();
        double sisi = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
        double keliling = alas + tinggi + sisi;
        return keliling;
    }


<<<<<<< HEAD
    public static double luaspersegi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan sisi = ");
        double sisi = scanner.nextInt();
        double luas = sisi * sisi;
        return luas;
    }

    public static double kelilingpersegi() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan sisi = ");
        double sisi = scanner.nextInt();
        double keliling = 4 * sisi;
        return keliling;
    }

    public static double luaspersegipanjang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan panjang = ");
        double panjang = scanner.nextInt();
        System.out.println("masukkan lebar = ");
        double lebar = scanner.nextInt();
        double luas = panjang * lebar;
        return luas;
    }

    public static double kelilingpersegipanjang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan panjang = ");
        double panjang = scanner.nextInt();
        System.out.println("masukkan lebar = ");
        double lebar = scanner.nextInt();
        double keliling = 2 * panjang + 2 * lebar;
        return keliling;
    }

    public static double luasjajargenjang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan alas = ");
        double alas = scanner.nextInt();
        System.out.println("masukkan tinggi = ");
        double tinggi = scanner.nextInt();
        double luas = alas * tinggi;
        return luas;
    }

    public static double kelilingjajargenjang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" masukkan sisi pertama = ");
        double a = scanner.nextInt();
        System.out.println("masukkan sisi kedua = ");
        double b = scanner.nextInt();
        double keliling = 2 * (a + b);
        return keliling;
    }

    public static double luasbelahketupat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan diagonal 1 = ");
        double d1 = scanner.nextInt();
        System.out.println("masukkan diagonal 2 = ");
        double d2 = scanner.nextInt();
        double luas = d1 * d2 / 2;
        return luas;
    }

    public static double kelilingbelahketupat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan sisi = ");
        double sisi = scanner.nextInt();
        double keliling = 4 * sisi;
        return keliling;
    }

    public static double diagonal1belahketupat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan luas = ");
        double luas = scanner.nextInt();
        System.out.println("masukkan diagonal 2 = ");
        double d2 = scanner.nextInt();
        double diagonal1 = 2 * luas / d2;
        return diagonal1;
    }

    public static double diagonal2belahketupat() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan luas = ");
        double luas = scanner.nextInt();
        System.out.println("masukkan diagonal 1 = ");
        double d1 = scanner.nextInt();
        double diagonal1 = 2 * luas / d1;
        return diagonal1;
    }

    public static double luaslayanglayang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan diagonal 1 = ");
        double d1 = scanner.nextInt();
        System.out.println("masukkan diagonal 2 = ");
        double d2 = scanner.nextInt();
        double luas = d1 * d2 / 2;
        return luas;
    }

    public static double kelilinglayanglayang() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan sisi pertama = ");
        double a = scanner.nextInt();
        System.out.println("masukkan sisi kedua = ");
        double b = scanner.nextInt();
        System.out.println("masukkan sisi ketiga = ");
        double c = scanner.nextInt();
        System.out.println("masukkan sisi keempat = ");
        double d = scanner.nextInt();
        double keliling = a + b + c + d;
        return keliling;
    }

    public static double luastrapesium() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan jumlah rusuk sejajar = ");
        double jumlahrusuksejajar = scanner.nextInt();
        System.out.println("masukkan tinggi = ");
        double tinggi = scanner.nextInt();
        double luas = jumlahrusuksejajar * tinggi / 2;
        return luas;
    }

    public static double kelilingtrapesium() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan sisi pertama = ");
        double AB = scanner.nextInt();
        System.out.println("masukkan sisi kedua = ");
        double BC = scanner.nextInt();
        System.out.println("masukkan sisi ketiga = ");
        double CD = scanner.nextInt();
        System.out.println("masukkan sisi keempat = ");
        double DA = scanner.nextInt();
        double keliling = AB + BC + CD + DA;
        return keliling;
    }

    public static double luaslingkaran() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan π = ");
        double π = scanner.nextInt();
        System.out.println("masukkan jari jari = ");
        double r = scanner.nextInt();
        double luaslingkaran = π * r * r;
        return luaslingkaran;
    }

    public static double kelilinglingkaran() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan π = ");
        double π = scanner.nextInt();
        System.out.println("masukkan jari jari = ");
        double r = scanner.nextInt();
        double kelilinglingkaran = 2 * π * r;
        return kelilinglingkaran;
    }

    public static double volumekubus() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan sisi = ");
        double sisi = scanner.nextInt();
        double volumekubus = sisi * sisi * sisi;
        return volumekubus;
    }

    public static double volumebalok() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan panjang = ");
        double panjang = scanner.nextInt();
        System.out.println("masukkan lebar = ");
        double lebar = scanner.nextInt();
        System.out.println("msukkan tinggi = ");
        double tinggi = scanner.nextInt();
        double volumebalok = panjang * lebar * tinggi;
        return volumebalok;
    }

    public static double volumetabung() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan π = ");
        double π = scanner.nextInt();
        System.out.println("masukkan r = ");
        double r = scanner.nextInt();
        System.out.println("masukkan tinggi = ");
        double tinggi = scanner.nextInt();
        double volumetabung = π * r * tinggi;
        return volumetabung;
    }

    public static double volumebola() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("masukkan π = ");
        double π = scanner.nextInt();
        System.out.println("masukkan r = ");
        double r = scanner.nextInt();
        double volumebola = (4/3) * π * r * r* r;
        return volumebola;
    }
