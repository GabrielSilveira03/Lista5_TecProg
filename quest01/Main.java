package quest01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		Controle controle = new Controle();
		String op = "";
		do {
			System.out.println("Para aumentar o volume digte '1'");
			System.out.println("Para diminuir o volume digite '2'");
			System.out.println("Para aumentar o número do canal digite '3'");
			System.out.println("Para diminuir o número do canal digite '4'");
			System.out.println("Para consultar o volume digite '5'");
			System.out.println("Para consultar o número do canal digite '6'");
			System.out.println("Para sair ddigite 'Sair'");
			System.out.println("Escolha a função que deseja realizar no controle:");
			op = entrada.nextLine();
			
			switch(op) {
				case "1":
					controle.aumentarVolume();
				break;
				case "2":
					controle.diminuirVolume();
				break;
				case "3":
					controle.aumentarCanal();
				break;
				case "4":
					controle.diminuirCanal();
				break;
				case "5":
					System.out.println("O volume é:" + controle.getVolume());
				break;
				case "6":
					System.out.println("O número do canal é:" + controle.getCanal()); 
				break;
				case "Sair":
					System.out.println("Saindo do programa");
				break;
				default:
					System.out.println("Nenhuma opção válida foi selecionada");
			}
		}while(!op.equals("Sair"));
		
		
		entrada.close();
	}

}
