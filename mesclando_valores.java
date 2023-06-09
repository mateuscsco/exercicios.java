import java.util.Scanner;
public class EP1_3 {
    public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
        //Lê dois números inteiros
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        //Por meio de multiplicação e divisão trocamos os valores de A e B 
         A = A*B;
         B = A/B;
         A = A/B;
        System.out.println("A="+A+" e B="+B); //Exibimos a frase com valores invertidos
    }
}
