programa
{
	inclua biblioteca Matematica --> mat
	inclua biblioteca Texto
	
	funcao inicio()
	{
		inteiro num , raizQ , conv

		escreva("Digite um nùmero: ")
		leia(num)

		raizQ = mat.raiz(num, 2)
		
		conv = mat.arredondar(raizQ, 0)

		escreva("Raiz Q² de " ,num, " é: " ,conv)
		escreva("\nRaiz Q² de " ,num, " é: ", conv)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 283; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */