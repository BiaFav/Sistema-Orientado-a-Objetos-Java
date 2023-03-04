public class Produto {
	//Encapsulamento 
	public string classe; //Atributos
	public string preco;  //Atributos
	public int codigo;      //Atributos
	
	public string getClasse() {
		return classe;
	}
	public void setClasse(string classe) {
		this.classe = classe;
	}
	public string getPreco() {
		return preco;
	}
	public void setPreco(string preco) {
		this.preco = preco;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	public double atualizarPreco(double preco) {
		this.preco += this.preco * 2;
		return this.preco;
	}
	
	
}
