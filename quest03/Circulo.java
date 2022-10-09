package quest03;

public class Circulo {
	private double raio;
	
	public  Circulo(double raio) {
		this.raio = raio;
	}
	
	public double area() {
		double pi = 3.14;
		
		double area = pi * Math.pow(this.raio,2);
		
		return area;
	}
	
	public double circunferencia() {
		double pi = 3.14;
		
		double circunferencia = 2 * pi * this.raio;
		
		return circunferencia;
	}
	
	public void aumentarCirculo(double percentual) {
		
		this.raio = this.raio + this.raio*percentual;
	
	}
	
}
