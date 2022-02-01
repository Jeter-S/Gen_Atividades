package Atividades31_01;

public class TestaAviao {

	public static void main(String[] args) {

		Aviao avi = new Aviao ();
		
		avi.companhia = "GOL";
		avi.numeroDoVoo = 2435;
		avi.horaDovoo = 10.45 ; 
		
		avi.olharPainel(avi.companhia);
		avi.conferirNumero(avi.numeroDoVoo);
		avi.irParaPortao(avi.horaDovoo);
		
	}

}
