package br.com.Generation.aula01;

import java.util.Scanner;
import java.lang.Math;


public class Exe04 {

  public static void main(String[] args) {
  
  int a , b , c;
  double d , r , s;
  Scanner leia = new Scanner(System.in);
  
  System.out.println("De um valor para A: ");
  a = leia.nextInt();
  
  System.out.println("De um valo para B: ");
  b = leia.nextInt();
  
  System.out.println("De um valor para C: ");
  c = leia.nextInt();
  
  r = Math.pow(a + b , 2);
  
  s = Math.pow(b + c , 2);
  
  d = (r + s) / 2;
  
  System.out.println("Dado os valores de R= " + r + "\nS= " + s + "\nEntao o valor de (D) é D= " + d );
  
  

  }

}
