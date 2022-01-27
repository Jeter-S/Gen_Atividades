package br.com.Generation.aula01;

import java.util.Scanner;


public class Exe02 {

  public static void main(String[] args) {
  
  int diasDeVida , anos , mes , dias;
  
  Scanner leia = new Scanner(System.in);
  
  System.out.println("Descreva sua idade em Dias de vida: ");
  diasDeVida = leia.nextInt();
  
  anos = diasDeVida / 365;
  
  mes = (diasDeVida % 365 ) / 30;
  
  dias = (diasDeVida % 365 ) % 30  ; 
  
  System.out.println("A sua idade de dias para anos, mêses e dias ficou. Anos: " + anos + "\nmêses: " + mes + "\nE dias: " + dias);
  
  leia.close();
  

  }

}
