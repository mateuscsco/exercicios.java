import java.util.Scanner;
public class EP4_3 {
    public static double M;
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
         System.out.println("digite seu investimento inicial");
           double I = teclado.nextDouble();
         System.out.println("digite a taxa de juros(mes)");
           double J = teclado.nextDouble();
         System.out.println("digite numero de meses");
           double N = teclado.nextDouble();
           double JC=J/100;
       M = (I*Math.pow((1+J), N));
       for ( int i=0; i<N; i++){
           double a = (1+JC);
           double b = Math.pow(a,i);
           double c = I*b;
           double JT = c-I;
           double JI = Math.floor(JT);
           double JF = J*i;
           
        System.out.print(i);
        System.out.printf("\t%1.2f",J);
        System.out.printf("   \t\t\t%2.2f",JF);
        System.out.printf("\t\t\t%3.2f\n",c);
       }
    } 
}