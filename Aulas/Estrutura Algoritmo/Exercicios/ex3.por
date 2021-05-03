programa
{
	inclua biblioteca Matematica --> mat

/*3. Faça um sistema que leia o tempo de duração de um evento em uma fábrica
expressa em segundos e mostre-o expresso em horas, minutos e segundos. */
	
	funcao inicio()
	{
		inteiro segundos, horas, minutos, horasm, segundosr

		
		
		escreva("Informe quantos segundos a maquina Xrax11 levou\npara cortar os tecidos do setor de esportes: ")
		leia(segundos)
		horas = (segundos / 3600)	
		minutos = ((segundos % 3600) / 60)
		segundosr = ((segundos % 3600) % 60)

		escreva("Esse processo levará ",horas," horas, ", minutos, " minutos ", "e ",segundosr, " segundos.") 
		
		
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 280; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */