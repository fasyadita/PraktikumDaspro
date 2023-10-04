import java.util.Scanner;
public class PemilihanBilangan12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int angka;
    String hasil;

    System.out.print("masukkan sebuah angka : ");
    angka = sc.nextInt();
    
    hasil = (angka % 2 == 0) ? "Bilangan Genap" : "Bilangan Ganjil";
    System.out.println(angka + " adalah " + hasil);
    } 
}