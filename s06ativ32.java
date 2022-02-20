import java.util.Scanner;
public class s06ativ32 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
      int i = 0;
      int j = 0;
      int A = 0;
      int M[][] = new int[4][4];
      for(i=0;i<4;i++){
          for(j=0;j<4;j++){
              A = teclado.nextInt();
              if(A%2==0){
                  A=2*A;
              }
              else{
                  A=4*A;
              }
              M[i][j]=A;
          }
      }
      for(i=0;i<4;i++){
          for(j=0;j<4;j++){
              System.out.print(M[i][j]+" ");
          }
        System.out.println();
      }

    }
}