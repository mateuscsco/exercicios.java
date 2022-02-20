import java.util.Scanner;
public class EP3_3 {
    public static void main(String args[]) {
        Scanner teclado = new Scanner(System.in);
       
        System.out.println("Digite seu salario atual");
        double salario = teclado.nextDouble();
        System.out.println("Digite seu tempo de serviço em anos");
        int tempoS = teclado.nextInt();
        double salarioFinal = 0;
        double bonus = 0, reajuste = 0;
        if(salario < 500.00){
            reajuste = 0.25;
            salarioFinal = salario+(reajuste * salario);
        }
        if(salario >=500.00 && salario < 1000.00){
            reajuste = 0.20;
            salarioFinal = salario + (reajuste * salario);
        }
        if(salario >= 1000.00 && salario < 1500.00){
            reajuste = 0.15;
            salarioFinal = salario+(reajuste * salario);
        }
        if(salario >= 1500.00 && salario < 2000.00){
            reajuste = 0.10;
            salarioFinal = salario + (reajuste * salario);
        }
        if(salario >= 2000.00){
            reajuste = 0;
            salarioFinal = salario+ (reajuste * salario);
        }
        System.out.printf("valor do salario final = %.2f\n" , salarioFinal );
        if(tempoS < 1){
            bonus = 0;
        }
        if (tempoS >= 1 && tempoS <= 3){
            bonus = 100.00;
        }
        if (tempoS >= 4 && tempoS <= 6){
            bonus = 200.00;
        }
        if (tempoS >= 7 && tempoS < 10){
            bonus = 300.00;
        }
        if (tempoS >= 10){
            bonus = 500.00;
        }
        System.out.printf("bonus = %.2f" , bonus);
        
    }
}
