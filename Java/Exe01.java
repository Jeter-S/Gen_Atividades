package br.com.Generation.aula01;

import java.util.Scanner;


public class Exe01 {

  public static void main(String[] args) {
  
  // Faça um sistema que leia a idade de uma pessoa expressa em anos, meses e dias e mostre-a expressa apenas em dias. 
   int dia , mes , ano , diasDeVida; 
    Scanner leia = new Scanner(System.in);
   
   System.out.println("Digite abaixo a quantidade de anos que você tem, junto com meses e dias: \nAnos: ");
   ano = leia.nextInt();
   
   System.out.println("Meses: ");
   mes = leia.nextInt();
  
   
   System.out.println("Dias: ");
   dia = leia.nextInt();
   
   diasDeVida = ano * 365 + mes * 30+
   dia;
   
   System.out.println("Você tem " + 
   diasDeVida + "dias de vida.");
   
  }
}
