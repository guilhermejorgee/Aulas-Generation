programa
{
	
	funcao inicio()
	{

		real distribuidora = 0.28
		real imposto = 0.45
		real pcusto, custo, total
		
		escreva("Digite o custo de fábrica do veiculo ")
		leia(custo)

		

		pcusto = ((custo * distribuidora) + custo)

		total = ((pcusto * imposto) + pcusto)

		escreva("O custo total do veiculo é: ",total)
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 276; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */