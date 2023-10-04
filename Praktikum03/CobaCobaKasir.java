import java.util.Scanner;
public class CobaCobaKasir {
    public static void main(String[] args) {
    Scanner sc = new Scanner (System.in);

    String namaObat;
    int kuantitas;
    double harga, totalHarga, kembalian, uangBayar;

        System.out.print("masukkan nama obat : ");
        namaObat = sc.nextLine();
        
        switch (namaObat) {

            case "paracetamol":
            System.out.println("nama obat : paracetamol");
            System.out.println("harga : 5000");
            System.out.println("stok : tersedia");
            break;

            case "ultraflu":
            System.out.println("nama obat : ultraflu");
            System.out.println("harga : 4500");
            System.out.println("stok : tersedia");
            break;

            case "paramex":
            System.out.println("nama obat : paramex");
            System.out.println("harga : 6000");
            System.out.println("stok : tersedia");
            break;

            default:
            System.out.println("maaf obat belum tersedia");
            break;}

        System.out.println("berapa kuantitas yang akan dibeli");
        kuantitas = sc.nextInt();
        System.out.println("masukkan harga");
        harga = sc.nextDouble();

        totalHarga = kuantitas*harga;
        System.out.println("total harga : " +totalHarga);

        System.out.println("masukkan uang yang dibayar");
        uangBayar = sc.nextDouble();

        kembalian = uangBayar-totalHarga;
        System.out.println("kembalian : " +kembalian);

    }
}
