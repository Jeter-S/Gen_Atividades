programa
{
	inclua biblioteca Matematica --> mat
	funcao inicio()
	{
		cadeia nome
		real n1 , n2 ,n3 , media

		escreva("Entre com seu nome: ")
		leia(nome)
		escreva("Entre com n1: ")
		leia(n1)
		escreva("Entre com n2: ")
		leia(n2)
		escreva("Entre com n3: ")
		leia(n3)

		media = (n1 + n2 + n3) / 3
		limpa()
		se (media >= 7.0)
		{ 
			escreva("Aluno(a): " , nome, ", parabéns você foi aprovado(a), com a nota: " , mat.arredondar(media, 2))
		}
		senao se (media >= 4 ou media < 7)
		{
			escreva("Aluno(a): " ,nome, ", você ficou de exame com a nota: " , mat.arredondar(media, 2))
		}
		senao 
		{
			escreva("Aluno(a): " ,nome, ", você foi reprovado(a), com a nota: " , mat.arredondar(media, 2))
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 365; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */