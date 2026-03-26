package Lista2;
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n=teclado.nextInt(),contador=0;
		for(int cont=1;cont<=n;cont++) {
			if(n%cont==0) {
				contador++;
			}
		}
		
		if(contador<=2) System.out.println("E primo");
		else System.out.println("nao e primo");
	}
}
