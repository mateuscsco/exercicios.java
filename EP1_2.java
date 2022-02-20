import java.util.Scanner;
public class EP1_2 {
    public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
        double a = teclado.nextDouble();
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();
        double d = (a+b+c)/3;
        System.out.println("Media = " + d);
    }
}
