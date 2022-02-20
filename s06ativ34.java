import java.util.Scanner;
public class s06ativ34 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
      int i = 0;
      int j = 0;
      int k = 0;
      int A[][] = new int[30][30];
      int n = teclado.nextInt();
      int m = teclado.nextInt();
      for(i=0;i<n;i++){
          for(j=0;j<m;j++){
              A[i][j]=teclado.nextInt();
          }
      }
      for(j=0;j<m;j++){
          k = k+A[0][j];
      }
      for(j=0;j<m;j++){
          k = k+A[n-1][j];
      }
      for(i=1;i<n-1;i++){
          k = k+A[i][0];
      }
      for(i=1;i<n-1;i++){
          k = k+A[i][m-1];
      }
        System.out.println("Soma da borda de A = "+k);

    }
}