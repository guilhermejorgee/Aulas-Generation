programa
{
	inclua biblioteca Objetos

//1.	Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma atividade e o escreva em seguida.
//Encontre após a maior pontuação e a apresente. 
	
	funcao inicio()
	{
		inteiro nota[5]

		escreva("Digite o primeiro valor: ")
		leia(nota[0])

		escreva("Digite o segundo valor: ")
		leia(nota[1])

		escreva("Digite o terceiro valor: ")
		leia(nota[2])

		escreva("Digite o quarto valor: ")
		leia(nota[3])

		escreva("Digite o quinto valor: ")
		leia(nota[4])

		//

		escreva("\nO primeiro valor é: ",nota[0])

		escreva("\nO segundo valor é: ",nota[1])

		escreva("\nO terceiro valor é: ",nota[2])

		escreva("\nO quarto valor é: ",nota[3])

		escreva("\nO quinto valor é: ",nota[4])


		

		se(nota[0] >= nota[1] e nota[0] >= nota[2] e nota[0] >= nota[3] e nota[0] >= nota[4] ){
			escreva("\nO maior pontuação é: ", nota[0])
		}
		senao se(nota[1] >= nota[0] e nota[1] >= nota[2] e nota[1] >= nota[3] e nota[1] >= nota[4] ){
			escreva("\nO maior pontuação é: ", nota[1])
		}
		senao se(nota[2] >= nota[0] e nota[2] >= nota[1] e nota[2] >= nota[3] e nota[1] >= nota[4] ){
			escreva("\nO maior pontuação é: ", nota[2])
		}
		senao se(nota[3] >= nota[0] e nota[3] >= nota[1] e nota[3] >= nota[2] e nota[3] >= nota[4] ){
			escreva("\nO maior pontuação é: ", nota[3])
		}
		senao se(nota[4] >= nota[0] e nota[4] >= nota[1] e nota[4] >= nota[2] e nota[4] >= nota[3] ){
			escreva("\nO maior pontuação é: ", nota[4])
		}
		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 834; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */