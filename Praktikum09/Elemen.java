import java.util.Scanner;
public class Elemen {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int a [] = new int [10];
    int i = 0;

    for (i = 0; i < a.length ; i++) {
        System.out.print("masukkan element ke-" +i+ " :");
        a[i] = sc.nextInt();
    }
    for (int j = a.length - 1 ; j >= 0 ; j--){
        System.out.println("element ke-" +(j)+ " adalah " +a[j]);
    }

    }
    
}
