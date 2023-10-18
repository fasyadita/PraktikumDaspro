import java.util.Scanner;
public class DoWhileCuti12 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int jatahCuti, jumlahHari;
    String konfrimasi;

    System.out.print("Jatah cuti : ");
    jatahCuti = sc.nextInt();

    do {
        System.out.print("apakah anda ingin mengajukan cuti (y/t) : ");
        konfrimasi = sc.next();

        if (konfrimasi.equalsIgnoreCase("y")) {
            System.out.print("jumlah hari : ");
            jumlahHari = sc.nextInt();

            if (jumlahHari <= jatahCuti) {
                jatahCuti -= jumlahHari;
                System.out.println("sisa jatah cuti : "+jatahCuti);
            } else {
                System.out.println("sisa jatah cuti anda tidak mencukupi");
                continue;
            }
        } else if (konfrimasi.equalsIgnoreCase("t")){
        break; }

    } while (jatahCuti > 0);
    }
}
