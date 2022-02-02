package Atividades01_02;

public class Cachorro implements Animal01 {
	
    public String nomeCachorro;
	
	public Cachorro(String nome) {
		nomeCachorro = nome;
		System.out.println(nomeCachorro);
	}

	@Override  //Sobrescrita do metodo.
	public void somAnimal() {
		System.out.println("Som do chachorro: auuauu...");
	}

	@Override
	public void dormir() {
		System.out.println("Chachorro dormindo...ZzzZzz");
	}

	@Override
	public void tamanho() {
		System.out.println("Tamanho do cachorro: 65cm");
	}

	@Override
	public void idade() {
		System.out.println("Idade do cachorro: 7 anos.");
		
	}

}
