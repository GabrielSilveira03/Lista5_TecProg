package quest04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o nome do produto:");
		String nome = entrada.nextLine();
		System.out.println("Informe o preço de custo do produto:");
		double pc = entrada.nextDouble();
		System.out.println("Informe o preço de venda do produto:");
		double pv = entrada.nextDouble();
		System.out.println("Informe as despesas da empresa:");
		double d = entrada.nextDouble();
		
		Produto produto = new Produto(nome);
		produto.setPrecoCusto(pc);
		produto.setPrecoVenda(pv);
		produto.setDespesaEmpresa(d);
		
		produto.calculoMargemLucro();
		System.out.println("A margem de lucro do produto é:" + produto.getMargemLucro() + "%");

		entrada.close();
	}

}
