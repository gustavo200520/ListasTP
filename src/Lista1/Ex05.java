package Lista1;
import java.util.Scanner;
public class Ex05 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numero,unidade, dezena,centena, resultado=0;
		numero = teclado.nextInt();
		
		if(numero>=100 && numero<=999) {
			centena = numero/100;//3
			dezena = (numero - centena*100);//358 - 300 = 58
			unidade = numero - (numero/10)*10;//358 - 350 = 8
			dezena = (dezena - unidade)/10;// (58 - 8)/10 = 5
			resultado = centena+dezena+unidade;
			System.out.printf("%d + %d + %d = %d",centena,dezena,unidade,resultado);
		}
	}
}
