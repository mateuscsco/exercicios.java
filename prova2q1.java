import java.util.Scanner;

public class prova2q1.java {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String args[]) {
int DM=0;
int m=0;
int a=0;
int M1[] = new int[70];
int M2[] = new int[70];
int w = teclado.nextInt();
for(int i=0;i<w;i++){
 M1[i]=teclado.nextInt();
M2[i]=teclado.nextInt();
while(M2[i]<4 || M2[i]>8){
System.out.println("Erro! Valor deve estar entre 4 e 8. Redigite:");
}
}
while(DM!=-300){
//System.out.println( "Digite a duração máxima das musicas a pesquisar ou digite -300 para encerrar");
DM = teclado.nextInt();
System.out.println("Duracao maxima:"+DM);
if(DM == -300){
            break;
        }
    for(int i=0;i<=w-1;i++){
        if(M1[i]<=DM){
        System.out.println("Musica: "+i+" Categoria: "+M2[i]+" Tempo: "+M1[i]);
        a = a+1;
        m = (m+M1[i]);
        }
        if(a==0){
        System.out.println("Sem musicas com tempo menor ou igual ao pesquisado!");
    }
}
m=m/a;
System.out.println( "Media Tempo:"+m);
}
	}
}