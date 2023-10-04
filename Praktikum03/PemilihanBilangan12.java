import java.util.Scanner;
public class PemilihanBilangan12 {
    public static void main(String[] args) {
    Scanner input12 = new Scanner(System.in);

    int angka;
    String hasil;
    
    System.out.println("masukkan angka");
    angka = input12.nextInt();
    
    hasil = (angka > 0.0) ? "Bilangan Positif" : "Bilangan Negatif";
    System.out.println(angka + " adalah " + hasil);

    } 
}