import java.util.Scanner;
public class PemilihanBilangan12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int angka;
    
    System.out.print("masukkan sebuah angka : ");
    angka = sc.nextInt();

    if (angka %2 == 0) {
        System.out.println("Angka " +angka+ " termasuk bilangan genap");

    } else {
        System.out.println("Angka " +angka+ " termasuk bilangan ganjil");
    }
    } 
}