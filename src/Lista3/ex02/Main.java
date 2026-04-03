package Lista3.ex02;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Produto> listaProduto = new ArrayList<>();
		int continuar;
		double valorTotal;
		System.out.println("Digite 1 para adicionar um produto\nDigite 2 para ver lista de produtos"
				+ "\nDigite 3 para sair");
		continuar =teclado.nextInt();
		while(continuar!=3){
			if(continuar==1) {
				Produto novoProduto = new Produto();
				System.out.println("Insira o nome do produto: ");
				teclado.nextLine();
				novoProduto.setNome(teclado.nextLine());
				System.out.println("Insira a quantidade: ");
				novoProduto.setQuantidade(teclado.nextInt());
				System.out.println("Insira o preco: ");
				novoProduto.setPreco(teclado.nextDouble());
				listaProduto.add(novoProduto);
			}
			
			if(continuar==2) {
				for(Produto produtoNovo : listaProduto) {
					System.out.printf("Nome: %s\n",produtoNovo.getNome());
					System.out.printf("quantidade: %d\n",produtoNovo.getQuantidade());
					System.out.printf("Preco: %.2f\n",produtoNovo.getPreco());
					valorTotal = produtoNovo.getQuantidade() * produtoNovo.getPreco();
					System.out.printf("Valor total em estoque: %.2f\n",valorTotal);
					System.out.println("-----------------------");
				}
			}
			
			System.out.println("Digite 1 para adicionar um produto\nDigite 2 para ver lista de produtos"
					+ "\nDigite 3 para sair");
			continuar =teclado.nextInt();
		}
	}
}
