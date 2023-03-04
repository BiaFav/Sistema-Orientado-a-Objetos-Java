
public class Main {

	public static void main(String[] args) {
		Produto HB20 = new Produto();
		HB20.setPreco(1000);
		HB20.atualizarPreco(200);
		System.out.println("Carro: " + HB20.getPreco());
		
		SUV Spin = new SUV();
		Spin.setPreco(1000);
		Spin.atualizarPreco(200);
		System.out.println("Carro: " + Spin.getPreco());
	}

}
