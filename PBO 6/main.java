
import Shape.*;
import Geometri.*;

public class main {
    public static void main(String[] args) {

        // Membuat objek-objek untuk bangun datar
        Persegi persegi = new Persegi(5);
        persegipanjang persegipanjang = new persegipanjang(4, 6);
        Lingkaran lingkaran = new lingkaran

        // Memanggil metode untuk menghitung luas dan keliling
        System.out.println("Luas persegi: " + persegi.Luas());
        System.out.println("Keliling persegi: " + persegi.Keliling());

        System.out.println("Luas persegi panjang: " + persegipanjang.Luas());
        System.out.println("Keliling persegi panjang: " + persegipanjang.Keliling());

        System.out.println("Luas lingkaran: " + lingkaran.Luas());
        System.out.println("Keliling lingkaran: " + lingkaran.Keliling());


        // Membuat objek-objek untuk bangun ruang
        kubus kubus = new kubus(5, 8);
        balok balok = new balok (4, 6, 10);
        bola bola = new bola(7);
        tabung tabung = new tabung(8, 10);

        // Memanggil metode untuk menghitung volume dan luas permukaan
        System.out.println("Volume kubus: " + kubus.calculateVolume());
        System.out.println("Luas permukaan kubus: " + kubus.calculatePermukaan());

        System.out.println("Volume balok: " + balok.calculateVolume());
        System.out.println("Luas permukaan balok: " + balok.calculatePermukaan());

        System.out.println("Volume bola: " + bola.calculateVolume());
        System.out.println("Luas permukaan bola: " + bola.calculatePermukaan());

        System.out.println("Volume tabung: " + tabung.calculateVolume());
        System.out.println("Luas permukaan tabung: " + tabung.calculatePermukaan());
    }
}

