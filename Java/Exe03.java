package br.com.Generation.aula01;
import java.util.Scanner;

public class Exe03 {

  public static void main(String[] args) {
  Scanner leia = new Scanner(System.in);
  
		int numSeg, horas, minutos, segundos;
		
		numSeg = leia.nextInt();

		horas = numSeg / 3600;
		minutos = (numSeg % 3600) / 60;
		segundos = (numSeg % 3600) % 60;
		System.out.println(horas + ":" + minutos + ":" + segundos);

		

  


  }

}
