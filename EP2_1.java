import java.util.Scanner;
public class EP2_1 {
    public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        int delta = b*b-4*a*c;
        System.out.println("O delta de ax*x + bx + c é " + delta);
    }
}
