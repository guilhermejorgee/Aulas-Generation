programa
{
	
//1- Elaborar um programa que efetue a leitura sucessiva de valores numéricos e apresente no final o total do somatório,
//a média e o total de valores lidos. O programa deve fazer as leituras dos valores enquanto o usuário estiver fornecendo
//valores positivos. Ou seja, o programa deve parar quando o usuário fornecer um valor negativo.


	
	funcao inicio()
	{
		real valor, somatorio = 0, media = 0

		inteiro lidos = 0, contador = 0


		escreva("Informe um valor: ")
		leia(valor)

		
		enquanto(valor >= 0){

			contador = contador + 1

			somatorio = somatorio + valor

			

			escreva("\nInforme um valor: ")
			leia(valor)		

		}
		media = (somatorio / contador)
		escreva("\nO somatório foi de: ",somatorio)
		escreva("\nA média foi de: ",media)
		escreva("\nA quantidade de números lidos foi: ",contador++)
	

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 522; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */