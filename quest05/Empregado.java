package quest05;

public class Empregado {

	private int id;
	private String primeironome;
	private String sobrenome;
	private double salariomensal;
	private double salariobase;
	private boolean diasdetrabalho[];
	
	public Empregado(String nome,String sobrenome) {
		this.primeironome = nome;
		this.sobrenome = sobrenome;
	}
	
	public Empregado(String nome,String sobrenome,int id) {
		this.primeironome = nome;
		this.sobrenome = sobrenome;
		this.id = id;
	}
	
	public void setDiasTrabalho(int d,boolean b) {
		this.diasdetrabalho[d] = b;
	}
	
	public double getSalario() {
		return this.salariobase;
	}
	
	public void setSalario(double salariobase) {
		this.salariobase = salariobase;
	}
	
	public void calculoSalario() {
		int diastrabalhados=0,dnaotrabalhados=0;
		for (int contador = 0; contador < diasdetrabalho.length; contador++) {
			if(diasdetrabalho[contador] == true) {
				diastrabalhados++;
			} else {
				dnaotrabalhados++;
			}
		}
		
		if(diastrabalhados == 30) {
			salariomensal = salariobase + (0.01*salariobase);
		} else if(diastrabalhados > 25 && diastrabalhados < 27) {
			salariomensal = salariobase - (dnaotrabalhados*(0.02*salariobase));
		} else if(diastrabalhados > 20 && diastrabalhados < 24) {
			salariomensal = salariobase - (dnaotrabalhados*(0.03*salariobase));
		} else if(diastrabalhados < 20) {
			salariomensal = 0.2 * salariobase;
		}
		
	}
}
