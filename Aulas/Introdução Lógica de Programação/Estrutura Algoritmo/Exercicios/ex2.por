programa
{

	/*2. Faça um sistema que leia a idade de uma pessoa expressa em dias
	e mostre-a expressa em anos, meses e dias.*/ 
	
	funcao inicio()
	{
		inteiro anos, meses, dias, calculo
		inteiro diascompletos, mesescompletos, anoscompletos, diasrestantes
		
		escreva("Digite quantos anos tem ")
		leia(anos)
		escreva("Digite quantos meses completos ja se passou desde seu aniversário\n(Contando a partir do dia do seu aniversário) ")
		leia(meses)
		escreva("Caso tenha sobrado alguns dias posterior ao ultimo mês completo,\ninforme a quantidade de dias aqui: ")
		leia(dias)

		calculo = (anos*365) + (meses*30) + dias

		escreva("Você tem ", calculo, " dias de vida")
		
		escreva("\nAgora que você já sabe quantos dias de vida você tem, vamos tirar a prova real.\nInforme quantos dias de vida você possui no total: ")
		leia(diascompletos)

		anoscompletos = diascompletos / 365

		
		mesescompletos = ((diascompletos % 365) / 30)

		diasrestantes = ((diascompletos % 365) % 30)

		

		escreva("Isso representa\n",anoscompletos," ano(s)\n",mesescompletos," mês(es)\n",diasrestantes," dia(s)")
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 848; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */