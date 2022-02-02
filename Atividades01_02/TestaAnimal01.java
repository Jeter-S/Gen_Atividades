package Atividades01_02;

public class TestaAnimal01 {

	public static void main(String[] args) throws InterruptedException {
		
		 Cachorro dog1 = new Cachorro("Bylli");
		 Cavalo cav1 = new Cavalo();
		 Preguica preg1 = new Preguica();
		 
		 dog1.somAnimal();
		 dog1.idade();
		 dog1.tamanho();
		 dog1.dormir();
		 Thread.sleep(700);
		 
		 System.out.println();
		 
		 cav1.tamanho();
		 cav1.idade();
		 cav1.somAnimal();
		 cav1.dormir();
		 Thread.sleep(700);
		 
		 System.out.println();
		 
		 preg1.tamanho();
		 preg1.idade();
		 preg1.somAnimal();
		 preg1.dormir();
		 
		 
		 
		 
		 
	}

}
