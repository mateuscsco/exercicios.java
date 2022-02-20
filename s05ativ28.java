import java.util.Scanner;
public class s05ativ28{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A = 0;
        int V[] = new int[50];
        int N = teclado.nextInt();
        while(N<=5 || N>50){
            System.out.println("Erro: Redigite! ");
            N = teclado.nextInt();
        }
        for(int i=0;i<N;i++){
            V[i]=teclado.nextInt();
        }
        int K = teclado.nextInt();
        for(int a=N-1;a>-1;a--){
            if(K==V[a]){
                A=A+1;
            }
        } 
       System.out.println(K+" aparece "+A+" vezes");
    }
}