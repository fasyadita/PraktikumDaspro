public class NilaiArray {
    public static void main(String[] args) {

        int a[] = { 3, 5, 6, 7 };
        int b[] = new int[4];
        int j = 0;

        for (j = 0; j < b.length; j++) {
            b[j] = a[j];
        }
        for (int c : b) {
            System.out.println(c);
        }

    }
}
