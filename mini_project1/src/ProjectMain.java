import java.util.Scanner;

public class ProjectMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = "";
        while (!command.equals("exit")) {
            System.out.println("");
            System.out.println("Silahkan masukkan command");
            command = scanner.nextLine();
            String check = command;
            if (command.equals("help")) {
                System.out.println(BangunDatar.listBangunDatar());
            }
            if (command.equals("Segitiga")) {
                System.out.println(DeskripsiBangunDatarRuang.segitiga());
            }
            if (command.equals("Persegi")) {
                System.out.println(DeskripsiBangunDatarRuang.persegi());
            }

            if (command.equalsIgnoreCase("Persegi Panjang")) {
                System.out.println(DeskripsiBangunDatarRuang.persegiPanjang());
            }
            if (command.equals("Jajar Genjang")) {
                System.out.println(DeskripsiBangunDatarRuang.jajarGenjang());
            }
            if (command.equals("Belah Ketupat")) {
                System.out.println(DeskripsiBangunDatarRuang.bola());
            }
            if (command.equals("Layang-layang")) {
                System.out.println(DeskripsiBangunDatarRuang.layangLayang());
            }
            if (command.equals("Trapesium")) {
                System.out.println(DeskripsiBangunDatarRuang.trapesium());
            }
            if (command.equals("Lingkaran")) {
                System.out.println(DeskripsiBangunDatarRuang.lingkaran());
            }
            if (command.equals("Kubus")) {
                System.out.println(DeskripsiBangunDatarRuang.kubus());
            }
            if (command.equals("Balok")) {
                System.out.println(DeskripsiBangunDatarRuang.balok());
            }
            if (command.equals("Tabung")) {
                System.out.println(DeskripsiBangunDatarRuang.tabung());
            }
            if (command.equals("Bola")) {
                System.out.println(DeskripsiBangunDatarRuang.bola());
            }
            if (command.equals("Segitiga help")) {
                System.out.println("1. luas segitiga = alas * tinggi /2\n2. keliling segitiga = alas + tinggi + sisi");
                System.out.println("silahkan pilih angka 1 atau 2");
                int angka = scanner.nextInt();
                if (angka == 1) {
                    double luas = RumusBangunDatarRuang.luasSegitiga();
                    System.out.println("luas segitiga adaalah = " + luas);
                } else if (angka == 2) {
                    double keliling = RumusBangunDatarRuang.kelilingsegitiga();
                    System.out.println("keliling segitiga adalah = " + keliling);
                }else{
                    System.out.println("angka yang anda masukkan salah");
                }


            }
            if (command.equals("Persegi help")) {
                System.out.println("Keliling persegi = 4 * s. Luas persegi = s * s");
                System.out.println("masukkan ");
            }
            if (command.equals("Persegi panjang help")) {
                System.out.println("panjang * lebar");
            }
            if (command.equals("Jajar genjang help")) {
                System.out.println("Keliling = 2 x (a+b). Luas = a x t");
            }
            if (command.equals("Belah ketupat help")) {
                System.out.println("L = ½ × d1 × d2.");
            }
            if (command.equals("Layang-layang help")) {
                System.out.println("L = ½ x d1 x d2");
            }
            if (command.equals("Trapesium help")) {
                System.out.println("L = ½ (b1 + b2) t");
            }
            if (command.equals("Lingkaran help")) {
                System.out.println("Luas Lingkaran ( L ) = π × r²");
            }
            if (command.equals("Kubus help")) {
                System.out.println("V = s x s x s atau V = s3");
            }
            if (command.equals("Balok help")) {
                System.out.println("V balok = p × l × t");
            }
            if (command.equals("Tabung help")) {
                System.out.println("");
            }

        }


//        System.out.println("rumus segitiga");
//        double alas = 7;
//        double tinggi = 12;
//        double luas = alas * tinggi / 2;
//        double sisi = Math.sqrt(Math.pow(alas, 2) + Math.pow(tinggi, 2));
//        double keliling = alas+tinggi+sisi;
//        System.out.println("luas nya adalah " + luas);
//        System.out.println("keliling segitiga adalah "+ keliling);
//
//        System.out.println("rumus persegi");
//        double sisiPersegi = 5;
//        double luasPersegi = sisiPersegi*sisiPersegi;
//        double kelilingPersegi = 4*sisiPersegi;
//        System.out.println("luas persegi adalah "+ luasPersegi);
//        System.out.println("keliling persegi adalah "+kelilingPersegi);
    }
}
