programa
{
	inclua biblioteca Texto
	/*
	crie um programa que receba 2 números e permita
	somar, subtrair, multiplicar, dividir.
	*/
	
	
	funcao inicio()
	{
		caracter opc 
		
		escreva("[ a ] Abacate \n[ b ] Banana \n[ c ] Carambola \nOpção: ")
		leia(opc)

		//Converte o que o usuario escreve para minusculo Texto.caixa_baixa()
		//Converte o que o usuario escreve para maiusculo Texto.caixa_alta()
		
		escolha(opc)
		{
			caso 'a': //O uso do caso sempre será individual, ou letra ou número
				escreva("\nLegal, também gosto de Abacate!")
				pare
			caso 'b':
				escreva("\nLegal, eu amooo de Banana!")
				pare
			caso 'c':
				escreva("\nCarambola é top")
				pare
			caso contrario:
				escreva("Opção invalida")
				
		}

		escreva("Vamos continuar...")

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 612; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */