package Atividades31_01;

public class Aviao {
	
	public String companhia;
	public int numeroDoVoo;
	public double horaDovoo;
	
	void olharPainel (String olhar) {
		
		System.out.println("Proucure sua companhia: " + olhar);
		this.companhia = olhar;
	}
	
	void conferirNumero (int numVoo) {
		
		System.out.println("Confira o n�mero do seu voo: " + numVoo);
		this.numeroDoVoo = numVoo;
	}
	
	void irParaPortao (double horario) {
		
		System.out.println("Seu voo saira �s " + horario + ", v� at� o port�o indicado.");
		this.horaDovoo = horario;
	}

}
