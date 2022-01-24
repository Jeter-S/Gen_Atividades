programa
{
	//Matriz
	inclua biblioteca Util
	funcao inicio()
	{
		inteiro matriz[3][3], linha, coluna , soma = 0 , soma1 = 0

		para (linha=0; linha<3; linha++)
		{
			para (coluna=0; coluna<3; coluna++)
			{
				//escreva("posição [ ", linha," ][ ",coluna," ]: ")
				matriz[linha][coluna] = Util.sorteia(0, 9) //adiciona numeros aleatórios
				
				se (linha == coluna)
				{
					soma1 = soma + matriz[linha][coluna]
				}
				
				
			}
		}
		
		limpa()
		
		para (linha=0; linha<3; linha++)
		{
			para(coluna=0; coluna<3; coluna++)
			{
				soma = soma + matriz[linha][coluna]
				escreva("{ ",matriz[linha][coluna]," }")
				Util.aguarde(200)
			}
			escreva("\n")
		}
		escreva(" A soma de todos os valores é: ",soma)
		escreva("\nA soma da diagonal é de: ", soma1)
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 125; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */