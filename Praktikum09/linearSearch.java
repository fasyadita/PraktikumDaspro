import java.util.Scanner;

public class linearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int key;
        int hasil = -1, n, k = 0;

        System.out.print("masukkan jumlah elemen array : ");
        n = sc.nextInt();
        int arrayInt[] = new int[n];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.print("masukkan elemen array ke- " + (i) + " : ");
            arrayInt[i] = sc.nextInt();
        }

        System.out.print("masukkan key yang ingin dicari : ");
        key = sc.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i] == key) {
                hasil = i;
                System.out.println("key ada dalam array pada indeks ke- " + i);
                i++;
            }

        }
        if (hasil == -1) {
            System.out.println("key tidak ditemukan ");
        }
    }
}