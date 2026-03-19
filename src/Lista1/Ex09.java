package Lista1;
import java.util.Scanner;
public class Ex09 {
	public static void main(String[] agrs) {
		Scanner teclado = new Scanner(System.in);
		int [] numero = new int[3];
		
		for(int cont=0;cont<3;cont++) {
			numero[cont] = teclado.nextInt();
		}
		
		for(int cont=3-1;cont>=0;cont--) {
			System.out.printf("%d ",numero[cont]);
		}
	}
}
