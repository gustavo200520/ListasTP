package Lista2;
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero,contador=0;
		numero=teclado.nextInt();
		
		if(numero<0) {
			numero = -numero;
		}
		do {
			numero = numero/10;
			contador++;
		}while(numero>0);
		System.out.println("o numero tem "+contador+" digitos ");
	}
}
