programa
{
/*1. Faça um sistema que leia a idade de uma pessoa expressa
em anos, meses e dias e mostre-a expressa apenas em dias. */ 
	
	funcao inicio()
	{
		inteiro anos, meses, dias, calculo, anoBissexto
		
		escreva("Digite quantos anos tem ")
		leia(anos)
		escreva("Digite quantos meses completos ja se passou desde seu aniversário\n(Contando a partir do dia do seu aniversário) ")
		leia(meses)
		escreva("Caso tenha sobrado alguns dias posterior ao ultimo mês completo,\ninforme a quantidade de dias aqui: ")
		leia(dias)

		anoBissexto = (anos/4)

		calculo = (anos*365) + (meses*30) + dias + anoBissexto

		escreva("Você tem ", calculo, " dias de vida")
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