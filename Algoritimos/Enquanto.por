programa
{
	inclua biblioteca Matematica --> mat
	inclua biblioteca Util
	
	//Enquanto
	
	funcao inicio()
	{
		/*inteiro contador = 0

		enquanto (contador < 10) 
		{
			escreva("\nBatata " , contador)

			contador = contador + 1
		}*/

		/* inteiro contador = 10

		enquanto (contador > 0)
		{
			escreva(contador , " • ")
			contador = contador - 1

			Util.aguarde(1000)
		}
		escreva("BOOOOOOOM trudun scla pisca booom")*/

		inteiro contador = 1
		real nota = 0.0 , soma = 0.0

		enquanto(contador <= 4)
		{
			escreva(contador, "ª nota: ")
			leia(nota)

			soma = soma + nota

			contador = contador + 1
			
		}

		mat.arredondar(soma /4, 1)

		escreva("A média do aluno é de: ", mat.arredondar(soma /4, 1))	

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 717; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */