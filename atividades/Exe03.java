package br.com.Generation.atividades;

import java.util.Scanner;

public class Exe03 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int idade;
		
		System.out.println("Qual sua idade? ");
		idade = input.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			System.out.println("Infantil...");
		}
		if (idade >= 15 && idade <=  17) {
			System.out.println("Juvenil...");
		
		} 
		if (idade >= 18 && idade <= 25) {
			System.out.println("Adulto...");
		}
		else {
			System.out.println("Sua idade n�o se encontra em nossas categorias.");
		}
		input.close();
	}

}
