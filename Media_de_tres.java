import java.util.Scanner;//importa scanner
public class EP1_2 { 
    public static void main(String args[]) {
    Scanner teclado = new Scanner(System.in);//definindo teclado
        double a = teclado.nextDouble();//lendo entradas do usuário como floats
        double b = teclado.nextDouble();
        double c = teclado.nextDouble();
        double d = (a+b+c)/3; //cálcula média dos três valores
        System.out.println("Media = " + d); //printa média
    }
}