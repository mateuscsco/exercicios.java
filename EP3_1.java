import java.util.Scanner;
public class EP3_1 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite 3 números inteiros quaisquer");
        int a = teclado.nextInt();
        int b = teclado.nextInt();
        int c = teclado.nextInt();
        if(a>b && b>c){
           System.out.println(+c+","+b+","+a);
        }
        if(a>c && c>b){
           System.out.println(+b+","+c+","+a);
        }
        if(b>a && a>c){
           System.out.println(+c+","+a+","+b);
        }
        if(b>c && c>a){
            System.out.println(+a+","+c+","+b);
        }
        if(c>a && a>b){
            System.out.println(+b+","+a+","+c);
        }
        if(c>b && b>a){
            System.out.println(+a+","+b+","+c);
        }
    }
}
