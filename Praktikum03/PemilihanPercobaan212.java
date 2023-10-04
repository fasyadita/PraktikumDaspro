import java.util.Scanner;
public class PemilihanPercobaan212 {

public static void main(String[] args) {
Scanner input12 = new Scanner (System.in);

float uas, uts, kuis, tugas, total;
String message;

    System.out.print("Nilai uts : ");
    uts = input12.nextFloat();
    System.out.print("Nilai uas : ");
    uas = input12.nextFloat();
    System.out.print("Nilai kuis : ");
    kuis = input12.nextFloat();
    System.out.print("Nilai Tugas : ");
    tugas = input12.nextFloat();

    total = (uas*0.4f) + (uts*0.3f) + (kuis*0.2f);

     message = total < 65 ? "Remidi" : "Tidak Remidi";
    System.out.println("Nilai akhir = " +total+ " sehingga " + message);

    if (total >=80f) {
    System.out.println("predikat A yaitu sangat baik ");
    } 
    else if (total >= 73.0f) {
    System.out.println("predikat B+ yaitu lebih dari baik");
    }
    else if (total >= 65.0f) {
    System.out.println("predikat B yaitu baik");
    }
    else if (total >= 60.0f) {
    System.out.println("predikat C+ yaitu lebih dari cukup");
    }
    else if (total >= 50.0f) {
    System.out.println("predikat C yaitu cukup");
    }
    else if (total >= 39.0f){
    System.out.println("predikat D yaitu kurang");
    }
    if (total <= 39.0f){
    System.out.println("predikat E yaitu gagal");
    }

   
}
}
