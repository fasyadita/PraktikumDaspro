import java.util.Scanner;
public class Bilangann12{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bil1, bil2, bil3;
        String bilanganTerbesar, bilanganTerkecil, bilanganTengah;

        System.out.print("masukkan bilangan ke1 : ");
        bil1 = sc.nextInt();
        System.out.print("masukkan bilangan ke2 : ");
        bil2 = sc.nextInt();
        System.out.print("masukkan bilangan ke3 : ");
        bil3 = sc.nextInt();
        

        if (?){
            if (bil2 > bil1) {
                if (bil2 >= bil3){
                    bilanganTerbesar = "bil2";
                }else{
                    bilanganTerbesar ="bil3";
                }  
            } else {
                if (bil1 > bil3) {
                    bilanganTerbesar = "bil1";
                } else {
                    bilanganTerbesar = "bil3";
                } 
            } 
            System.out.println("bilangan Terbesar adalah : " + bilanganTerbesar);
        }
        
        else if ( jenisBuku.equals("novel") ){
            if (bil2 < bil1) {
                if (bil2 <= bil3){
                    bilanganTerbesar = "bil2";
                }else{
                    bilanganTerbesar ="bil3";
                }  
            } else {
                if (bil1 < bil3) {
                    bilanganTerbesar = "bil1";
                } else {
                    bilanganTerbesar = "bil3";
                } 
            } 
            System.out.println("bilangan Terbesar adalah : " + bilanganTerkecil);

        else {
            if (jumlahBuku > 3){
                totalDiskon = 0.05;
                System.out.println("Total diskon : " + totalDiskon);
            }
            else {
                System.out.println("tidak dapat diskon");
            }
            
        }
 
    }
}