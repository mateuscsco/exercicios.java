import java.util.Scanner;

public class s08ativ40 {
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
		int A[][] = new int[3][3];
		int B[][] = new int[4][4];
		int k1=0,k2=0,soma1=0,soma2=0;
		LeMatriz( A, 3);
		LeMatriz( B, 4);
		ImprimeMatriz( A, 3);
		ImprimeMatriz( B, 4);
		soma1 = SomaElementosColuna( A,3, k1);
		soma2 = SomaElementosColuna( B,4, k2);
		System.out.print( "\n");
		System.out.print( "\nSoma da coluna " + k1 + " de A = "+ soma1);
		System.out.print( "\nSoma da coluna " + k2 + " de B = "+ soma2);
	}
	public static void LeMatriz(int M[ ][ ], int n) {
		int i,j;
		for (i=0;i<n;i++)
		for (j=0;j<n;j++){
			M[i][j] = teclado1.nextInt();
		}
	}
	public static void ImprimeMatriz(int M[ ][ ], int n) {
		int i,j;
		for (i=0;i<n;i++){
			System.out.print( "\n");
			for (j=0;j<n;j++)
			System.out.print( M[i][j]+";");
		}
	}
	public static int SomaElementosColuna(int M[ ][ ], int n, int k) {
		int soma=0,i,j;
		k = teclado1.nextInt();
		for (i=0;i<n;i++){
			for (j=0;j<n;j++)
			if ((k-1)==j){
				soma = soma + M[i][j];
			}
		}
		return soma;
	}
}