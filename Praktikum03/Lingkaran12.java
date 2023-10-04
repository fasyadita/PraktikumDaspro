import java.util.Scanner;
public class Lingkaran12 {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);

    int r;
    double π, keliling, luas;
    π = 3.14;

    System.out.println("Masukan jari-jari lingkaran: ");
    r=input.nextInt();

    keliling= 2*π*r;
    luas= π*r*r;

    System.out.println(keliling);
    System.out.println(luas);


    }
}
