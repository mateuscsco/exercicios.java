public class s07ativ37 {
	static Scanner teclado1 = new Scanner(System.in);
	public static void main(String[] args) {
	java.util.Locale.setDefault(new java.util.Locale("en","US"));
	int x1=0,x2=0,x3=0,soma,limite;
	char valida;
	limite  = 10;
	valida = 'S';
	while (valida=='S'){
		x1 = teclado1.nextInt();
		valida = FValidaInt( x1, limite);
	}
	limite  = 30;
	valida = 'S';
	while (valida=='S'){
		x2 = teclado1.nextInt();
		valida = FValidaInt( x2, limite);
	}
	limite  = 0;
	valida = 'S';
	while (valida=='S'){
		x3 = teclado1.nextInt();
		valida = FValidaInt( x3, limite);
	}
	soma = x1+x2+x3;
	System.out.print( "Soma = "+soma);
}
public static char FValidaInt(int valor, int superior) {
	char erro;
	if (valor>superior){
		System.out.print( "\nDigitou: "+ valor+". Digite um numero <="+ superior+ ": ");
		erro = 'S';
	}
	else {
		erro = 'N';
	}
	return erro;
}
}