import java.util.Scanner;
public class NestedLoop12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;

        System.out.print("masukkan jumlah kota : ");
        n = sc.nextInt();
        double suhu [][] = new double[n][4];


        for (int i = 0; i < suhu.length;i++){
            System.out.println("KOTA KE-" + (i+1));

            for (int j = 0 ; j < suhu[i].length; j++){
                System.out.print("Suhu ke-"+ (j+1) + ": ");
                suhu[i][j]= sc.nextDouble();
            }
        }

        for (int i = 0 ; i < suhu.length; i++){
            System.out.print("KOTA KE-" + (i+1) + ": ");
            double jumlah = 0;

            for ( double tempt : suhu [i]){
                System.out.print(tempt + " ");
                jumlah += tempt;
            }
            System.out.println();
            double rataSuhu = jumlah/ 4;
            System.out.println("rata suhu :" + rataSuhu );
        }
       
        
    }

}

