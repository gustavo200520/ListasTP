package Lista1;
import java.util.Scanner;
public class Ex15 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero, primeira_parte, segunda_parte, novo_numero;
		numero = teclado.nextInt();
		
		if(numero<1000 || numero>9999) System.out.println("numero invalido");
		else {
			primeira_parte = numero/100;
			segunda_parte = numero - primeira_parte*100;
			novo_numero = (primeira_parte + segunda_parte) * (primeira_parte + segunda_parte);
			System.out.println(primeira_parte + " " + segunda_parte + " = " + novo_numero);
			if(novo_numero == numero) System.out.println("possui a propriedade");
			else System.out.println("nao possui a propriedade");
		}
	}
}
