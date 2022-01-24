programa
{
	/*
	 Ter mais de 18 anos
	 Saber ler e escrever
	 CPF
	 */
	
	funcao inicio()
	{
		cadeia nome
		inteiro idade
		real CPF
		caracter resposta
		
		escreva("Nome: ")
		leia(nome)
		escreva("idade: ")
		leia(idade)
		escreva("CPF [Apenas números]: ")
		leia(CPF)

/*
		// se|if 

		se (idade >= 18) {			//CONDIÇÃO SIMPLES12
			
			escreva("\nLegal, vamos continura...")
			
		} // senao|else 
		senao {
			
			escreva("\nVocê não tem idade para seguir em frente.") 

		se (idade >= 18) {			//CONDIÇÃO COMPOSTA
			escreva("\nLegal, vamos continuar...")
			escreva("CPF: ")
			leia(CPF)*/
			
		se (idade >= 18) {		//CONDIÇÃO ALINHADA
			escreva("\nVamos continuar...")
			
		} // senao se|else if
		senao se (idade >=16) {
			escreva("\nVocê tem altorização? \n[ S | N ]: ")
			leia(resposta)
			
			se (resposta == 's' ou resposta == 'S' ) {
				escreva("\nLegal, seguimos daqui...") 
			}
			
				senao {
				escreva("\nNão podemos continuar sem a autorização.")
			}
		} 
		senao se (idade >= 14) {
			escreva("\nFaltam só mais um pouco.")
		}
		senao {
			escreva("\nNão podemos continuar.")
			
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 913; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz;
 */