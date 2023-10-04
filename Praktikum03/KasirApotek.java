import java.util.Scanner;
public class KasirApotek {
    
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int kuantitas;
    String namaObat;
    double harga, totalHarga, jumlahBayar, kembalian;

    System.out.println("nama obat: ");
    namaObat = sc.nextLine();
    System.out.println("Kuantitas yang dibeli: ");
    kuantitas= sc.nextInt();
    System.out.println("Harga obat: ");
    harga = sc.nextDouble();

    totalHarga = kuantitas*harga;
    System.out.println("Total Harga: " + totalHarga);

    System.out.println("masukkan jumlah uang yang dibayarkan: ");
    jumlahBayar = sc.nextDouble();

    kembalian = jumlahBayar - totalHarga;
    System.out.println("kembalian : " + kembalian);


    }
}
