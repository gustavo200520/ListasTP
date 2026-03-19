package Lista1;
import java.util.Scanner;
public class Ex01 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float celsius, fahrenheit;
		
		System.out.println("insira o valor em C");
		celsius = teclado.nextFloat();
		
		fahrenheit = 32 + (1.8f * celsius); 
		System.out.printf("Em F = %.2f\n", fahrenheit);
	}
}
