programa
{
	//Laço Condicional
	funcao inicio()
	{

	real nota1, nota2, media

	escreva("Digite a nota 1: ")
	leia(nota1)

	escreva("Digite a nota 1: ")
	leia(nota2)

	media = (nota1 + nota2) / 2

	se(media >= 9.0){
		escreva("Aprovado com mérito")
	}
	
	senao se(media >= 6.0 e media < 9.0){
		escreva("Aprovado")
	}

	senao se(media >= 3.0 e media < 6.0){
		escreva("Recuperação")
	}
	senao{
		escreva("Reprovado")
	}
	escreva("\nSua média: ",media)

	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 258; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */