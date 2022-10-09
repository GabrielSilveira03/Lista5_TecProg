package quest02;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Pessoa a = new Pessoa("Albert Einstein");
		Pessoa i = new Pessoa("Isaac Newton");
		
		a.ajustaDataDeNascimento(14, 03, 1879);
		i.ajustaDataDeNascimento(04, 01, 1643);

		System.out.println("Informe a data atual(dia,mês e ano, a cada dado inserido pressione enter):");
		int diaatual = entrada.nextInt();
		int mesatual = entrada.nextInt();
		int anoatual = entrada.nextInt();
		
		a.calculaIdade(diaatual, mesatual, anoatual);
		i.calculaIdade(diaatual, mesatual, anoatual);
		
		System.out.println("A idade de Albert Einstein caso estivesse vivo seria:" + a.informaIdade());
		System.out.println("A idade de Isaac Newton caso estivesse vivo seria:" + i.informaIdade());
		
		entrada.close();
	}

}
