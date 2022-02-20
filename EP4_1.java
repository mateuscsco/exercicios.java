import java.util.Scanner;
public class EP4_1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        int m = 1;
        for(int i = 1; n >= i; i++){
            m = (3*i);
        System.out.print(m+ " ");
        }
 
    }
}