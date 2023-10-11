import java.util.Scanner;
public class Bilangan12 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3;
        int max, min, middle;

        System.out.print("masukkan bilangan ke1 : ");
        bil1 = sc.nextInt();
        System.out.print("masukkan bilangan ke2 : ");
        bil2 = sc.nextInt();
        System.out.print("masukkan bilangan ke3 : ");
        bil3 = sc.nextInt();

        if (bil2 > bil1) {
            if (bil2 > bil3){
                max = bil2;

                if (bil3 > bil1) {
                    middle = bil3;
                    min = bil1;
                } else {
                    middle = bil1;
                    min = bil3;
                }
            }else {
                max = bil3;

                if (bil1 > bil2) {
                    middle = bil1;
                    min = bil2;
                    
                } else {
                    middle = bil2;
                    min = bil1;
                }
            }    

        } else {
            if (bil1 > bil3) {
                max = bil1;

                if (bil3>bil2) {
                    middle = bil3;
                    min = bil2;

                } else {
                    middle = bil2;
                    min = bil3;
                }
            } else {
                max = bil3;

                if (bil2 > bil1) {
                    middle = bil2;
                    min =bil1;
                    
                } else {
                    middle = bil1;
                    min = bil2;
                }
            }
        }

        System.out.println("bilangan Terbesar adalah : " + max);
        System.out.println("bilangan Tengah tengah adalah : " + middle);
        System.out.println("bilangan terkecil adalah : " + min);
    

     
    }

    }

