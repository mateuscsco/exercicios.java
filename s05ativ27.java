import java.util.Scanner;
public class s05ativ27{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int V[] = new int[50];
        int N = teclado.nextInt();
        while(N<=0 || N>50){
            System.out.println("Erro: Redigite! ");
            N = teclado.nextInt();
        }
        for(int i=0;i<N;i++){
            V[i]=teclado.nextInt();
        }
        for(int a=N-1;a>-1;a--){
            System.out.printf(V[a]+";");
        }
    }
}