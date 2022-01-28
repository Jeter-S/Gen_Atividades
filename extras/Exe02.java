package br.com.Generation.extras;

import java.util.Scanner;

public class Exe02 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int num;
		
		for (num = 0; num <=9; num++) {
			System.out.println(num);
			if (num % 2 == 0)
			System.out.println("Par...");
			
			else 
			System.out.println("Impar...");
		}
		input.close();
	}
	
	

}
