package Lista1;
import java.util.Scanner;
public class Ex12 {
	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		float horas, valor_hora, salario_bruto, salario_liquido;
		horas = teclado.nextFloat();
		valor_hora = teclado.nextFloat();
		salario_bruto = horas * valor_hora;
		
		if(salario_bruto<=1200) {
			salario_liquido = salario_bruto;
			System.out.printf("salario_bruto = %.2f\nsalario_liquido = %.2f \n",salario_bruto,salario_liquido);
		}
		else if(salario_bruto>1200 && salario_bruto<=1800) {
			salario_liquido = salario_bruto - salario_bruto*10/100;
			System.out.printf("salario_bruto = %.2f\nsalario_liquido = %.2f \n",salario_bruto,salario_liquido);
		}
		else if(salario_bruto>1800 && salario_bruto<=2200) {
			salario_liquido = salario_bruto - salario_bruto*15/100;
			System.out.printf("salario_bruto = %.2f\nsalario_liquido = %.2f \n",salario_bruto,salario_liquido);
		}
		else {
			salario_liquido = salario_bruto - salario_bruto*27.5f/100;
			System.out.printf("salario_bruto = %.2f\nsalario_liquido = %.2f \n",salario_bruto,salario_liquido);
		}
	}
}
