import com.sun.security.jgss.GSSUtil;

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
                //  System.out.println("1. luas segitiga = alas * tinggi /2\n2. keliling segitiga = alas + tinggi + sisi");
                System.out.println("list rumus segitiga = \n1. luas \n2. keliling\n 3. tinggi\n 4. alas");
            }
            if (command.equals("luas segitiga")) {
                System.out.println("luas = alas * tinggi /2");
            }
            if (command.equals("keliling segitiga")) {
                System.out.println("keliling = alas + tingi + sisi");
            }
            if (command.equals("segitiga luas input")) {
                double luasSegitiga = RumusBangunDatarRuang.luasSegitiga();
                System.out.println("luas segitiga adalah = " + luasSegitiga);
            }
            if (command.equals("segitiga keliling input")) {
                double kelilingsegitiga = RumusBangunDatarRuang.kelilingsegitiga();
                System.out.println("keliling segitiga adalah = " + kelilingsegitiga);
            }


            if (command.equals("Persegi help")) {
                //System.out.println("1. Luas persegi = s * s\n2. Keliling persegi = 4 * s");
                System.out.println("list rumus persegi = \n1. luas \n 2. keliling\n 3. sisi\n 4. diagonal");
            }
            if (command.equals("luas persegi")) {
                System.out.println("luas = sisi * sisi");
            }
            if (command.equals("keliling persegi")) {
                System.out.println("keliling persegi = 4 * sisi");
            }
            if (command.equals("luas psegi input")) {
                double luaspersegi = RumusBangunDatarRuang.luaspersegi();
                System.out.println("luas persegi adalah = " + luaspersegi);
            }
            if (command.equals("keliling persegi input")) {
                double kelilingpersegi = RumusBangunDatarRuang.kelilingpersegi();
                System.out.println("keliling persegi adalah = " + kelilingpersegi);
            }


            if (command.equals("Persegi panjang help")) {
                System.out.println("1. luas peregi panjang = panjang * lebar\n" +
                        "2. keliling persegi panjang = 2 * panjang + 2 * lebar");
                System.out.println("list rumus persegi panjang = \n1. luas\n2. keliling\n 3. panjang\n 4. lebar\n 5. diagonal");
            }
            if (command.equals("luas persegi panjang")) {
                System.out.println("luas = panjang * lebar");
            }
            if (command.equals("keliling persegi panjang = ")) {
                System.out.println("2 * panjang + 2 * lebar");
            }
            if (command.equals("luas persegi panjang input")) {
                double luaspersegipanjang = RumusBangunDatarRuang.luaspersegipanjang();
                System.out.println("luas persegi panjang adalah = " + luaspersegipanjang);
            }
            if (command.equals("keliling prsegi panjang input")) {
                double kelilingpersegipanjang = RumusBangunDatarRuang.kelilingpersegipanjang();
                System.out.println("keiling persegi panjang adalah = " + kelilingpersegipanjang);
            }


            if (command.equals("jajar genjang help")) {
                System.out.println("list rumus jajar genjang = \n1. luas\n 2. keliling\n 3. sii alas\n 4. sisi miring");
            }
            if (command.equals("luas jajar genjang")) {
                System.out.println("luas = alas * tinggi");
            }
            if (command.equals("keliling jajar genjang"))
                System.out.println("keliling = 2 * (a + b)");
            if (command.equals("luas jajar genjang input")) {
                double luasjajargenjang = RumusBangunDatarRuang.luasjajargenjang();
                System.out.println("luas jajar genjang adalah =" + luasjajargenjang);
            }
            if (command.equals("keliling jajar genjang input")) {
                double kelilingjajargenjang = RumusBangunDatarRuang.kelilingjajargenjang();
                System.out.println("keliling jajar genjang adalah = " + kelilingjajargenjang);
            }


            if (command.equals("Belah ketupat help")) {
                System.out.println("1. luas \n2. keliling \n3. sisi\n4. diagonal 1\n5. diagonal 2");
            }
            if (command.equals("luas belah ketupat")) {
                System.out.println("luas = di * d2 / 2");
            }
            if (command.equals("keliling belah ketupat")) {
                System.out.println("keliling = 4 * sisi");
            }
            if (command.equals("luas belah ketupat input")) {
                double luasbelahketupat = RumusBangunDatarRuang.luasbelahketupat();
                System.out.println("luas belah ketupat = " + luasbelahketupat);
            }
            if (command.equals("keliling belah ketupat input")) {
                double kelilingbelahketupat = RumusBangunDatarRuang.kelilingbelahketupat();
                System.out.println("keliling belah ketupat adalah = " + kelilingbelahketupat);
            }
            if (command.equals("diagonal 1 belah ketupat input")) {
                double diagonal1belahketupat = RumusBangunDatarRuang.diagonal1belahketupat();
                System.out.println("diagonal 1 blah ketupat adalah = " + diagonal1belahketupat);
            }
            if (command.equals("diagonal 2 belah ketupat input")) {
                double diagonal2belahketupat = RumusBangunDatarRuang.diagonal2belahketupat();
                System.out.println("diagonal 2 belah ketupat adalah = " + diagonal2belahketupat);
            }


            if (command.equals("Layang-layang help")) {
                System.out.println("1. luas\n2. keliling\n3. diagonal 1\n4. diagonal 2");
            }
            if (command.equals("luas layang-layang")) {
                System.out.println("luas = di * d2 /2");
            }
            if (command.equals("keliling layang-layang")) {
                System.out.println("keliling = a + b + c + d");
            }
            if (command.equals("luas layang-layang input")) {
                double luaslayanglayang = RumusBangunDatarRuang.luaslayanglayang();
                System.out.println("luas layang-layang adalah = " + luaslayanglayang);
            }
            if (command.equals("keliling layang-layang input")) {
                double kelilinglayanglayang = RumusBangunDatarRuang.kelilinglayanglayang();
                System.out.println("keliling layang-layang adalah = " + kelilinglayanglayang);
            }


            if (command.equals("Trapesium help")) {
                System.out.println("1. luas\n2. keliling\n3. tinggi");
            }
            if (command.equals("luas trapesium")) {
                System.out.println("luas = jumlah rusuk sejajar * tinggi");
            }
            if (command.equals("keliling trapesium")) {
                System.out.println("keliling = AB + BC + CD +DA");
            }
            if (command.equals("luas trapesium input")) {
                double luastrapesium = RumusBangunDatarRuang.luastrapesium();
                System.out.println("luas trapesium aalah = " + luastrapesium);
            }
            if (command.equals("keliling trapesium input")) {
                double kelilingtrapesium = RumusBangunDatarRuang.kelilingtrapesium();
                System.out.println("keliling tapesium aalah" + kelilingtrapesium);
            }


            if (command.equals("Lingkaran help")) {
                System.out.println("1. luas\n2. keliling\n3. diameter\n4. jari-jari");
            }
            if (command.equals("luas lingkaran")) {
                System.out.println("luas = π * r * r");
            }
            if (command.equals("keliling ligkaran")) {
                System.out.println("keliling = 2 * π * r");
            }
            if (command.equals("luas lingkaran input")) {
                double luaslingkaran = RumusBangunDatarRuang.luaslingkaran();
                System.out.println("luas lingkaran adalah = " + luaslingkaran);
            }
            if (command.equals("keliling lingkaran input")) {
                double kelilinglingkaran = RumusBangunDatarRuang.kelilinglingkaran();
                System.out.println("kelililng lingkaran aalah = " + kelilinglingkaran);
            }


            if (command.equals("Kubus help")) {
                System.out.println("1. volume\n2. luas permukaan\n3. sisi rusuk\n" +
                        "4. diagonal sisi\n5. diagonal ruang\n6. luas bidang diagonal");
            }
            if (command.equals("volume kubus")) {
                System.out.println("volume = sisi * sisi * sisi");
            }
            if (command.equals("volume kubus input")) {
                double volumekubus = RumusBangunDatarRuang.volumekubus();
                System.out.println("volume kubus adalah = " + volumekubus);
            }


            if (command.equals("Balok help")) {
                System.out.println("1. volume\n2. luas permukaan\n3. panjang\n4. lebar\n" +
                        "5. tinggi\n6. diagonal bidang\n7. diagonal  ruang\n8. luas bidang diagonal");
            }
            if (command.equals("volume balok")) {
                System.out.println("volume = p * l * t");
            }
            if (command.equals("volume balok input")) {
                double volumebalok = RumusBangunDatarRuang.volumebalok();
                System.out.println("volume balok adalah = " + volumebalok);
            }


            if (command.equals("Tabung help")) {
                System.out.println("V tabung = π * r * tinggi");
            }
            if (command.equals("volume tabung")) {
                System.out.println("volume = π * r * tinggi");
            }
            if (command.equals("volume tabung input")) {
                double volumetabung = RumusBangunDatarRuang.volumetabung();
                System.out.println("volume tabung adalah = " + volumetabung);
            }

            if (command.equals("Bola help")) {
                System.out.println("1. volume\n2. luas permukaan\n3. jari-jari");
            }
            if (command.equals("volume bola")) {
                System.out.println("volume = (4/3) * π * r * r* r");
            }
            if (command.equals("volume bola input")) {
                double volumebola = RumusBangunDatarRuang.volumebola();
                System.out.println("volume bola adalah = " + volumebola);
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
