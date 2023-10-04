import java.util.Scanner;
public class Haraa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    String pacar;

    System.out.println("kenapa kamu marah?");
    pacar = sc.nextLine();

    switch (pacar){
        case "mboh":
        System.out.println("aku gak peka ta?");
        break;

        case "gtw":
        System.out.println("uttutt tak beliin eskrim ta?");
        break;
        
        case "mls":
        System.out.println("jgn ngambek dong yang");
        break;

        default: 
        System.out.print("maafin akuuuu:( ");
        break;}

        
}
}
