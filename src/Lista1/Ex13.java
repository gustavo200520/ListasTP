package Lista1;
import java.util.Scanner;
public class Ex13 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float horas, valor_hora, salario_semanal;
		horas = teclado.nextFloat();
		valor_hora = teclado.nextFloat();
		salario_semanal = horas * valor_hora;
		
		if(horas<=40) {
			System.out.printf("salario_semanal = %.2f\n",salario_semanal);
		}
		else if(horas>40 && horas<=50) {
			salario_semanal = 40 * valor_hora + (horas - 40) * (valor_hora + valor_hora * 20/100);
			System.out.printf("salario_semanal = %.2f\n",salario_semanal);
		}
		else if(horas>50) {
			salario_semanal = 50 * valor_hora + (horas - 50) * valor_hora;
			System.out.printf("salario_semanal = %.2f\n",salario_semanal);
		}
	}
}
