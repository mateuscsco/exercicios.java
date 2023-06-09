import java.util.Scanner;
public class EP4_1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);

        //declara duas variáveis em int, uma inserida pelo usuário e outra com valor 1 atribuido na declaração
        int n = teclado.nextInt();
        int m = 1;

        //estrutura de repetição for, 'para um inteiro"i" correspondente a 1, tal que "n" é maior ou igual a "i", "i"+1'
        //ou seja, um contador de 1 a n(valor inserido pelo usuário) que calcula os múltiplos de 3 de 1 a n
        for(int i = 1; n >= i; i++){
            m = (3*i);
        System.out.print(m+ " ");
        }
 
    }
}