package Lista1;
import java.util.Scanner;
public class Ex11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float temperatura, nova_temperatura;
		char escala;
		temperatura = teclado.nextFloat();
		teclado.nextLine();
		escala = teclado.nextLine().charAt(0);
		if(escala =='C') {
			nova_temperatura = 32 + (1.8f * temperatura);
			System.out.printf("Em F = %.2f\n",nova_temperatura);
		}
		else if(escala =='F') {
			nova_temperatura = (temperatura - 32)*100/180;
			System.out.printf("Em C = %.2f\n",nova_temperatura);

		}
		
	}
}
