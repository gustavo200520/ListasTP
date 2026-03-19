package Lista1;
import java.util.Scanner;
public class Ex06 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float numero;
		int cima, baixo;
		numero = teclado.nextFloat();
		
		cima = (int) numero + 1;
		baixo = cima-1;
		System.out.printf("arredondado para baixo: %d e para cima: %d",baixo,cima);
	}
}
