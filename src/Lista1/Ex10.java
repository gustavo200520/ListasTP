package Lista1;
import java.util.Scanner;
public class Ex10 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, numero3, maior, menor, meio, soma_maiores=0, diferenca_menores=0;
		numero1 = teclado.nextInt();
		numero2 = teclado.nextInt();
		numero3 = teclado.nextInt();
		
		maior = numero1;
		menor = numero1;
		meio = numero1;
		if(numero2>maior) maior = numero2;
		if(numero3>maior) maior = numero3;
		
		
		if(numero2<menor) menor = numero2;
		if(numero3<menor) menor = numero3;
		
		meio = numero1+numero2+numero3-maior-menor;
		
		soma_maiores = maior + meio;
		diferenca_menores = meio - menor;
		System.out.printf("soma = %d, diferenca = %d",soma_maiores, diferenca_menores);
	}
}
