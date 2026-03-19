package Lista1;
import java.util.Scanner;
public class Ex02 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int peso1, peso2, peso3;
		float nota1, nota2, nota3, media=0;
		
		System.out.println("nota1");
		nota1 = teclado.nextFloat();
		System.out.println("peso1");
		peso1 = teclado.nextInt();
		System.out.println("nota2");
		nota2 = teclado.nextFloat();
		System.out.println("peso2");
		peso2 = teclado.nextInt();
		System.out.println("nota3");
		nota3 = teclado.nextFloat();
		System.out.println("peso3");
		peso3 = teclado.nextInt();
		
		media = (nota1*peso1 + nota2*peso2 + nota3*peso3)/(peso1+peso2+peso3);
		System.out.printf("media ponderada = %.2f\n", media);
	}
}
