package Lista1;
import java.util.Scanner;
public class Ex04 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		final float PI = 3.14f;
		float raio, altura, volume=0;
		
		System.out.println("raio");
		raio = teclado.nextFloat();
		System.out.println("altura");
		altura = teclado.nextFloat();
		
		volume = raio*raio*PI*altura;
		System.out.printf("volume = %.2f\n",volume);
	}
}
