
public class Carro4x4 extends Produto {
	
	@Override
	public double atualizarPreco(double preco) {
		// TODO Auto-generated method stub
		return super.atualizarPreco(preco * 4);
	}
	public int nome;
	public string ano;
	public string codigo;
	
	public int getNome() {
		return nome;
	}
	public void setNome(int nome) {
		this.nome = nome;
	}
	public string getAno() {
		return ano;
	}
	public void setAno(string ano) {
		this.ano = ano;
	}
	public string getCodigo() {
		return codigo;
	}
	public void setCodigo(string codigo) {
		this.codigo = codigo;
	}
	
	
}
