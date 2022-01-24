programa
{
	inclua biblioteca Util
	funcao inicio()
	{
		cadeia nomes[ 3 ]
		inteiro cont = 0
		
		para (cont=0; cont<3; cont++) 
		{
			escreva(cont+1, "º nome: ")
			leia(nomes[cont])
			
		}
		
		para (cont=0; cont<3; cont++)
		{
			escreva(nomes[cont],". ")
			Util.aguarde(500)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 201; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */