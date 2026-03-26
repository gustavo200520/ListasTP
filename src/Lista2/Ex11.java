package Lista2;
import java.util.Scanner;
public class Ex11 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n=teclado.nextInt(),contador=0;
		
		for(int cont=1;cont<=n;cont++) {
			for(int cont2=1;cont2<=cont;cont2++) {
				if(cont%cont2==0) {
					contador++;
				}
			}
			if(contador==2) System.out.printf("%d ",cont);
			contador=0;
		}
	}
}
