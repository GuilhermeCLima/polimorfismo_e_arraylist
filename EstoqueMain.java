package POO_LOJA;

import java.util.ArrayList;
import java.util.Scanner;

public class EstoqueMain {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		ArrayList<String> itens = new ArrayList<String>();
		ArrayList<String> itens2 = new ArrayList<String>();
		String teste = null;

		System.out.println("Digite os itens do estoque 1:");
		// adiciona produtos a lista
		for (int cont = 0; cont < 3; cont++) {
			System.out.println("Digite um produto");
			teste = dados.next();
			itens.add(teste);
		}
		
		System.out.println("Digite itens dos estoque 2:");
		for (int cont = 0; cont < 2; cont++) {
			System.out.println("Digite um produto");
			teste = dados.next();
			itens2.add(teste);
		}
		
		// adiciona um dado do itens2 ao itens
		itens.addAll(itens2);
		System.out.println("A lista é:" + itens);
		// remove produtos da lista
		for (int cont = 0; cont < 3; cont++) {
			itens.remove(0);
		}
		System.out.println("A lista de produtos é:" + itens);
	}

}
