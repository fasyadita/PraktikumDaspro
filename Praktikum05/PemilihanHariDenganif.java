import java.util.Scanner;
public class PemilihanHariDenganif {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String hasil;
int angka;

System.out.println("masukkan bilangan bulat: ");
angka = sc.nextInt();

if ( angka >= 1 && angka <= 5 ) {
hasil = "weekday";
System.out.println(angka+ " adalah " +hasil);
     
} else if (angka == 6 || angka == 7) {
hasil = "weekend";
System.out.println(angka+ " adalah " +hasil);   

} else {
System.out.println("invalid number");
}

}

}
