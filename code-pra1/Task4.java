import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Angka Pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan Angka Kedua: ");
        int angka2 = scanner.nextInt();

        scanner.close();

        int jumlah = angka1 + angka2;
        System.out.print("Hasil Penjumlahan dari " + angka1 + " dan " + angka2 + " adalah: " + jumlah);
    }
}