package Lista1;
import java.util.Scanner;
public class Ex07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int h1, m1, s1, h2, m2, s2, hora1, hora2, diferenca, novo_h=0, novo_m=0, novo_s=0;
		h1 = teclado.nextInt();
		m1 = teclado.nextInt();
		s1 = teclado.nextInt();
		h2 = teclado.nextInt();
		m2 = teclado.nextInt();
		s2 = teclado.nextInt();
		
		hora1 = h1*3600 + m1*60 + s1;
		hora2 = h2*3600 + m2*60 + s2;
		
		if(hora1>hora2) diferenca = hora1-hora2;
		else diferenca = hora2 - hora1;
		while(diferenca>=3600){
            diferenca = diferenca-3600;
            novo_h++;
        }
        while(diferenca>=60){
            diferenca = diferenca-60;
            novo_m++;
        }
        novo_s = diferenca;
      
        System.out.printf("diferenca = %d:%d:%d\n",novo_h,novo_m,novo_s);
	}
}
