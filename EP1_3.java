import java.util.Scanner;
public class EP1_3 {
    public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
         A = A*B;
         B = A/B;
         A = A/B;
        System.out.println("A="+A+" e B="+B);
    }
}
