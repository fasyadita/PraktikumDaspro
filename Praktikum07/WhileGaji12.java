import java.util.Scanner;
public class WhileGaji12 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    int jumlahKaryawan, jumlahJamLembur;
    double gajiLembur, totalGajiLembur;
    String jabatan;

    gajiLembur = 0;
    totalGajiLembur = 0;

    System.out.print("Masukkan jumlah karyawan: ");
    jumlahKaryawan = scan.nextInt();

    int i = 0;

    while (i < jumlahKaryawan) {
        System.out.println("Pilihan jabatan - Direktur, Manajer, karyawan");
        System.out.print("Masukkan jabatan karyawan ke-" +(i+1)+ ": ");
        jabatan = scan.next();
        System.out.print("Masukkan jumlah jam lembur: ");
        jumlahJamLembur = scan.nextInt();
        i++;

        if (jabatan.equalsIgnoreCase("Direktur")) {
            continue;
        } else if (jabatan.equalsIgnoreCase("manajer")){
            gajiLembur = jumlahJamLembur * 100000;
        } else if (jabatan.equalsIgnoreCase("karyawan")){
            gajiLembur = jumlahJamLembur * 75000;
        } else {
            System.out.println("Jabatan Invalid");
            i--;
            continue;

        } 

        totalGajiLembur += gajiLembur;
    }
    System.out.println("Total gaji lembur : "+totalGajiLembur);


    }
}
