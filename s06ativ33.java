import java.util.Scanner;
public class s06ativ33 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
      int i = 0;
      int j = 0;
      int k = 0;
      int A = 0;
      int n = teclado.nextInt();
      int M[][] = new int[n][n];
      for(i=0;i<n;i++){
          for(j=0;j<n;j++){
              M[i][j]=teclado.nextInt();
          }
      }
      k = teclado.nextInt();
      for(j=0;j<n;j++){
          A = A+M[k][j];
          }
        System.out.println("Soma da linha "+k+" de M = "+A);

    }
}