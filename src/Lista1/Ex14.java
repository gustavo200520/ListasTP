package Lista1;
import java.util.Scanner;
public class Ex14 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in); 
		int x, y, z;
		boolean triangulo = false;
		x = teclado.nextInt();
		y = teclado.nextInt();
		z = teclado.nextInt();
		
		if(x+y>z && x+z>y && z+y>x) {
			triangulo = true;
		}
		else System.out.println("nao e um triangulo");
		
		if(triangulo) {
			if(x==z && x==y) System.out.println("equilatero");
			else if (x==z && x!=y || x==y && x!=z || y==z && y!=x) System.out.println("isosceles");
			else System.out.println("escaleno");
		}
	}
}
