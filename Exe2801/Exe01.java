package ProjetoJava;

import java.util.Scanner;

public class Exe01 {

	public static void main(String[] args) {

		double[] vetor;
		double maior;
		
		while (true) {
			vetor = new double[5];
			maior = 0;
			
			for(int i = 0; i < vetor.length; i++) {
				System.out.println("Digite o " + (i +1) + "º valor: ");
				vetor[i] = new Scanner(System.in) .nextDouble();
				
				if (vetor[i] > maior) {
					maior = vetor[i];
				}
			}
			System.out.println("O maior valor é: " + maior);
		}
		
	}

}
