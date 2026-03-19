package Lista1;
import java.util.Scanner;
public class Ex08 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero1, numero2, numero3, maior, menor;
		float media=0;
		numero1 = teclado.nextInt();
		numero2 = teclado.nextInt();
		numero3 = teclado.nextInt();
		maior = numero1;
		menor = numero1;
		
		if(numero2>maior) maior = numero2;
		if(numero3>maior) maior = numero3;
		
		
		if(numero2<menor) menor = numero2;
		if(numero3<menor) menor = numero3;
		
		System.out.printf("maior=%d e menor=%d\n",maior, menor);
		
		media = (numero1+numero2+numero3)/3f;
		System.out.printf("media=%.1f\n",media);
	}
}
