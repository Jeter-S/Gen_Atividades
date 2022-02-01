package Atividades31_01;

public class Cliente {
	
	public String nome;
	public double valorCompra;
	public int parcelas;
	
	void caixa (String nome1) {
		System.out.println("bom dia: " + nome1);
		this.nome = nome1;
	}
	
	void pagamento (double pag) {
		System.out.println("O valor da sua compra é de: " + pag);
		this.valorCompra = pag;
	}
	
	void escolherParcelas (int parc) {
		System.out.printf("Pagamento parcelado em: " + parc + "X" );
		this.parcelas = parc;
	}
	

}
