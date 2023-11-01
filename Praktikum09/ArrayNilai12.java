import java.util.Scanner;

public class ArrayNilai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiAkhir = new int[10];
        int total = 0, max = 0, min = 100, jumlahLulus=0, jumlahTdkLulus=0;
        double ratarata;

        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print("Masukkan Nilai akhir ke- " + (i + 1) + " : ");
            nilaiAkhir[i] = sc.nextInt();
            total += nilaiAkhir[i];

            if (max < nilaiAkhir[i]) {
                max = nilaiAkhir[i];
            }
            if (min > nilaiAkhir[i]) {
                min = nilaiAkhir[i];
            }
        }

         for (int i = 0; i < 10; i++) {
            // System.out.println("Nilai akhir mahasiswa ke- " + (i+1) + " adalah " +
            // nilaiAkhir[i]);
            if (nilaiAkhir[i] > 70) {
                jumlahLulus++ ;
                //System.out.println("mahasiswa ke- " + (i + 1) + " lulus!");
            } else {
                jumlahTdkLulus++;
                //System.out.println("mahasiswa ke- " + (i + 1) + " tidak lulus!");
            }

        }

        System.out.println("Nilai tertinggi adalah " + max);
        System.out.println("Nilai terendah adalah " + min);

        ratarata = total / 10;
        System.out.println("rata - rata nilai = " + ratarata);

        for (int i = 0; i < 10; i++) {
            // System.out.println("Nilai akhir mahasiswa ke- " + (i+1) + " adalah " +
            // nilaiAkhir[i]);
            if (nilaiAkhir[i] > 70) {
                System.out.println("mahasiswa ke- " + (i + 1) + " lulus!");
            } else {
                System.out.println("mahasiswa ke- " + (i + 1) + " tidak lulus!");
            }

        }
        System.out.println("jumlah mahasiswa lulus adalah : "+jumlahLulus);
        System.out.println("jumlah mahasiswa tidak lulus adalah : "+jumlahTdkLulus);
    }
}
