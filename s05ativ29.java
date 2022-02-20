import java.util.Scanner;
public class s05ativ29{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int A=0;
        int V[] = new int[50];
        int N = teclado.nextInt();
        while(N<=5 || N>50){
            System.out.println("Erro: Redigite! ");
            N = teclado.nextInt();
        }
        for(int i=0;i<N;i++){
            V[i]=teclado.nextInt();
        }
        if(N%2==0){
            int K = (N/2)-1;
        for(int a=0;a<N;a++){
            if(V[K]<V[a]){
                A=A+V[a];
        }
        }
        System.out.println(" Soma dos elementos acima de "+V[K]+" = "+A);
        }
        else{
        int K = (N/2);
        for(int a=0;a<N;a++){
            if(V[K]<V[a]){
                A=A+V[a];
        }
        }
        System.out.println(" Soma dos elementos acima de "+V[K]+" = "+A);
        }
    }
}