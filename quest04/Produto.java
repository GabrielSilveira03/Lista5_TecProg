package quest04;

public class Produto {

	private String nome;
	private double precocusto;
	private double precovenda;
	private double despesaempresa;
	private double margemlucro;
	
	public Produto(String nome) {
		this.nome = nome;
	}
	
	public void calculoMargemLucro() {
		margemlucro = ((precovenda - (precocusto + despesaempresa))/precovenda)*100;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public double getPrecoCusto() {
		return this.precocusto;
	}
	
	public void setPrecoCusto(double pc) {
		this.precocusto = pc;
	}
	
	public double getPrecoVenda() {
		return this.precovenda;
	}
	
	public void setPrecoVenda(double pv) {
		this.precovenda = pv;
	}
	
	public double getDespesaEmpresa() {
		return this.despesaempresa;
	}
	
	public void setDespesaEmpresa(double d) {
		this.despesaempresa = d;
	}
	
	public double getMargemLucro() {
		return this.margemlucro;
	}
	
}
