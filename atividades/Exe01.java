package br.com.Generation.atividades;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num1 , num2 , num3 , maior , menor;
		
		System.out.println("Informe o 1� n�mero: ");
		num1 = input.nextInt();
		System.out.println("Informe o 2� n�mero: ");
		num2 = input.nextInt();
		System.out.println("Informe o 3� n�mero: ");
		num3 = input.nextInt();
		
		if (num1 < num2) {
			if (num1 < num3) 
				menor = num1;
			
			else 
				menor = num3;
			
		}
		else {
			if(num2 < num3)
				menor = num2;
			else
				menor = num3;				
		}
		if(num1 > num2) {
			if (num1 > num3)
				maior = num1;
			else
				maior = num3;			
		}
		else {
			if(num2 > num3)
				maior = num2;
			else
				maior = num3;
			
		}
		System.out.println("\nO menor n�mero foi: " + menor+ " | E o maior n�mero foi: " + maior);
		input.close();
	}

}
