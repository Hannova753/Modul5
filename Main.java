import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan panjang balok: ");
        double panjang = scanner.nextDouble();

        System.out.print("Masukkan lebar balok: ");
        double lebar = scanner.nextDouble();

        System.out.print("Masukkan tinggi balok: ");
        double tinggi = scanner.nextDouble();

        // Menghitung volume balok
        double volume = panjang * lebar * tinggi;

        // Menghitung luas permukaan balok
        double luasPermukaan = 2 * (panjang * lebar + panjang * tinggi + lebar * tinggi);

        // Menampilkan hasil
        System.out.println("Volume Balok: " + volume);
        System.out.println("Luas Permukaan Balok: " + luasPermukaan);

        scanner.close();
    }
}

