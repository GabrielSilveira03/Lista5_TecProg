package quest03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o valor do raio do círculo:");
		double raio = entrada.nextDouble();
		
		Circulo c = new Circulo(raio);
		
		System.out.println("A área do círculo é:" + c.area() + "\nA circunferência do círculo é:" + c.circunferencia());
		
		System.out.println("Informe um número correspondente ao aumento percentual do raio do círculo(EXEMPLO: Caso queira aumentar 50%, digite 0,5):");
		double percentual = entrada.nextDouble();
		
		c.aumentarCirculo(percentual);
		System.out.println("A nova área do círculo é:" + c.area() + "\nA nova circunferência do círculo é:" + c.circunferencia());

		entrada.close();
	}

}
