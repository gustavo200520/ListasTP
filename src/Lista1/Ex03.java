package Lista1;
import java.util.Scanner;
public class Ex03 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		float salario, comissao, salario_total;
		
		System.out.println("salario");
		salario = teclado.nextFloat();
		System.out.println("comissao em %");
		comissao = teclado.nextFloat();
		
		salario_total = salario + salario*(comissao/100);
		System.out.printf("salario total = %.2f\n", salario_total);
		
	}
}
