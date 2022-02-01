package Atividades31_01;

public class TestaCliente {

	public static void main(String[] args) {

		Cliente cli = new Cliente();
		
		cli.nome = "Jéter";
		cli.valorCompra = 450.00;
		cli.parcelas = 10;
		
		cli.caixa(cli.nome);
		cli.pagamento(cli.valorCompra);
		cli.escolherParcelas(cli.parcelas);
		
		
	}

}
