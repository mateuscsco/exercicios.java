import java.util.Scanner;
public class EP2_3 {
    public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
        int base = teclado.nextInt();
        int altura = teclado.nextInt();
        int area = base*altura;
        System.out.println("area="+area);
        System.out.println("base="+base);
        System.out.println("altura="+altura);
    }
}
