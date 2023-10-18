import java.util.Scanner ;
public class WhileKelipatan12 {

    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int bilangan, counter, total;
    double ratarata;
    total = 0;
    counter = 0;

    System.out.print("Masukkan bilangan (1-9) : ");
    bilangan = sc.nextInt();

    int i = 0;
    while (i < 50) {
         if (i % bilangan == 0) {
            total += i;
            counter++;
        }
        ++i;
    }
    
    System.out.printf("pada rentang 1-50 terdapat %d bilangan kelipatan %d dengan total %d", counter, bilangan, total);
    ratarata = total / counter;
    System.out.println("rata rata " +ratarata);
    }
}

    
    

