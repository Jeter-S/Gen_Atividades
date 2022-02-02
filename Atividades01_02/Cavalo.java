package Atividades01_02;

public class Cavalo implements Animal01{

	@Override
	public void somAnimal() {
		System.out.println("Som do cavalo: IIiiiih");
	}

	@Override
	public void dormir() {
		System.out.println("cavalo dormindo...ZzzZzz");
		
	}

	@Override
	public void tamanho() {
		System.out.println("Tamanho do cavalo: 1.80m");
	}

	@Override
	public void idade() {
		System.out.println("Idade do cavalo: 4 anos.");
		
	}

}
