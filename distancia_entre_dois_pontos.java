import java.util.Scanner;
public class EP2_2 {
    public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);
        //inserimos quatro valores decimais, correspondentes aos valores dos eixos x e y de dois pontos
        double X1 = teclado.nextDouble();
        double Y1 = teclado.nextDouble();
        double X2 = teclado.nextDouble();
        double Y2 = teclado.nextDouble();
        //calculamos o valor decimal correspondente à distância entre dois pontos, ou seja a raiz da soma das variações quadradas em cada eixo
        double d = Math.sqrt(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2));
        //exibimos o resultado
        System.out.println("distancia entre os pontos="+d);
    }
}
