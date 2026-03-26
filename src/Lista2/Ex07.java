package Lista2;
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, maior,menor,soma=0,contador=0;
		float media=0;
		numero=teclado.nextInt();
		if(numero>0) {
		maior=numero;
		menor=numero;
		
		do {
			if(numero>0) {
				soma = soma+numero;
				contador++;
				if(numero>maior) {
					maior=numero;
				}
				if(numero<menor) {
					menor=numero;
				}
			}
			numero=teclado.nextInt();
		}while(numero>0);
		media=soma*1.0f/contador;
		System.out.printf("maior=%d menor=%d soma=%d media=%.2f",maior,menor,soma,media);
		}
		else System.out.println("incie com um numero valido");
	}
}
