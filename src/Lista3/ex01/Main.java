package Lista3.ex01;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Aluno> listaAluno = new ArrayList<>();
		int quantidade, contador=0;
		
		System.out.println("Insira a quantidade de alunos: ");
		quantidade = teclado.nextInt();
		
		while(contador<quantidade) {
			Aluno novoAluno = new Aluno();
			teclado.nextLine();
			System.out.println("Insira o nome: ");
			novoAluno.setNome(teclado.nextLine());
			System.out.println("Insira a nota: ");
			novoAluno.setNota(teclado.nextDouble());
			listaAluno.add(novoAluno);
			contador++;
		}
		
		for(Aluno alunoNovo : listaAluno) {
			System.out.printf("Nome: %s\n",alunoNovo.getNome());
			System.out.printf("Nota: %.2f\n",alunoNovo.getNota());
			System.out.println("-----------------------");
		}
	}
}
