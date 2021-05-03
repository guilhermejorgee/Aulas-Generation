programa
{
	//Utilizando a matematíca
	inclua biblioteca Matematica --> mat

	
	
	funcao inicio()
	{
		//inicio da declaração de variáveis
		real a, b, c
		real d

		//Inicio da interação com o usuário
		// Entrada e saída de dados

		escreva("Entre com o valor de A: ")
		leia(a)

		escreva("Entre com o valor de B: ")
		leia(b)

		escreva("Entre com o valor de C: ")
		leia(c)
		
		//Calculo de potenciação
		d = (mat.potencia((a+b), 2.0) + mat.potencia((b+c), 2.0)) / 2

		//Arrendodamento para duas casa após a virgula
		escreva("O valor de D foi: ", mat.arredondar(d, 2))
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 272; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */