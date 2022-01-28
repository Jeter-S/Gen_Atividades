package br.com.Generation.atividades;

import java.util.Scanner;

public class Exe04 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		int num;
		double raiz , potencia;
		
		System.out.println("Digite um número inteiro: ");
		num = leia.nextInt();
		
		if (num % 2 == 0) {
			System.out.println("Par...");
			raiz = Math.sqrt(num);
			System.out.println("Raiz quadrada: " + raiz);	
		}
		else {
			System.out.println("Impar...");
			potencia = Math.pow(num , 2);
			System.out.println("potencia: " + potencia);
		}
		leia.close();
		
	}

}
