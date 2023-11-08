import java.util.Scanner;

public class BioskopWithScanner12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baris, kolom;
        String nama, next, menu;
        String[][] penonton = new String[4][2];

        boolean selesai = true;
        while (true) {
            System.out.println("MENU");
            System.out.println("MENU 1 : Input data penonton");
            System.out.println("MENU 2 : Tampilkan daftar penonton");
            System.out.println("MENU 3 : Exit");
            System.out.print("pilih menu (1/2/3): ");
            menu = sc.nextLine();

            if (menu.equals("1")) {
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print("masukkan nama: ");
                    nama = sc.nextLine();
                    System.out.print("masukkan baris: ");
                    baris = sc.nextInt();
                    System.out.print("masukkan kolom: ");
                    kolom = sc.nextInt();
                    sc.nextLine();

                    if (penonton[baris - 1][kolom - 1] == null) {
                        penonton[baris - 1][kolom - 1] = nama;
                    } else {
                        System.out.println("kursi tidak tersedia");
                    }

                    System.out.print("input penonton lainnya? (y/n) : ");
                    next = sc.nextLine();

                    if (next.equalsIgnoreCase("n")) {
                        break;
                    }
                }
            } else if (menu.equals("2")) {
                for (int i = 0; i < penonton.length; i++) {
                    System.out.println("penonton pada baris ke-" + (i + 1) + ": " + String.join(",", penonton[i]));
                }

            } else {
                System.out.println("terima kasih");
                break;
            }

            System.out.print("kembali ke menu? : ");
            menu = sc.nextLine();
            if (menu.equals("n")) {
                selesai = false;
                break;
            }
        }

    }
}