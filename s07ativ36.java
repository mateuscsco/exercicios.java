import java.util.Scanner;
import java.lang.Math;
public class s07ativ36 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
      int n = teclado.nextInt();
      double X = teclado.nextDouble();
     // double A = n-1;
      for(int i=0;i<n;i++){
      double P = Math.pow(X,5);
      double f = (4*P-5*X)-(10);
      System.out.println("f("+X+")="+f);
      X=X+0.5;
      }
    }
}