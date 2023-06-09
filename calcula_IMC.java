import java.util.Scanner;
public class EP3_2 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite sua altura em cm");
        Double altura= teclado.nextDouble();
        System.out.println("Digite seu peso em kg");
        double massa = teclado.nextDouble();
        altura = altura/100;
        double IMC = massa/(altura * altura);
        if(IMC <= 18.5){
            System.out.println("Magro");
        }
        if(IMC > 18.5 && IMC <= 25.0){
            System.out.println("Saudavel");
        }
        if(IMC>25.0 && IMC <= 30.0){
            System.out.println("Acima do peso");
        }
        if(IMC>30.0 && IMC <= 35.0){
            System.out.println("Obeso");
        }
        if(IMC > 35.0){
            System.out.println("Morbidez");
        }
    }
}
