import java.util.Scanner;
public class EP4_2 {
    public static int m;
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        int n = teclado.nextInt();
        for(int i = 2 ;i <= n-1; i++){
          if(n%i==0){
              m=m+1;
          }
        }
        if(m == 0 ){
            System.out.println("numero primo!");
        }
        else{
        System.out.println("nao e primo!");
        }
    } 
}