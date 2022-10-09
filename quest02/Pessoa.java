package quest02;

public class Pessoa {

	private String nome;
	private int idade;
	private int dianascimento;
	private int mesnascimento;
	private int anonascimento;
	
	public Pessoa(String nome) {
		this.nome = nome;
	}
	
	public void calculaIdade(int dia,int mes,int ano) {
		if(mes>this.mesnascimento || (mes==this.mesnascimento && dia>this.dianascimento)) {
			this.idade = ano - this.anonascimento;
		} else {
			this.idade = ano - this.anonascimento - 1;
		}
		
	}
	
	public int informaIdade() {
		return this.idade;
	}
	
	public String informaNome() {
		return this.nome;
	}
	
	public void ajustaDataDeNascimento(int dia,int mes,int ano) {
		this.dianascimento = dia;
		this.mesnascimento = mes;
		this.anonascimento = ano;
	}
	
}
