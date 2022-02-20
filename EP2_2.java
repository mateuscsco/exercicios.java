import java.util.Scanner;
public class EP2_2 {
    public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
        double X1 = teclado.nextDouble();
        double Y1 = teclado.nextDouble();
        double X2 = teclado.nextDouble();
        double Y2 = teclado.nextDouble();
        double d = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));

        System.out.println("distancia entre os pontos="+d);
    }
}
