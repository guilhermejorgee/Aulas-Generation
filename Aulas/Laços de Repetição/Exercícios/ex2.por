programa
{

//Desenvolver um sistema que efetue a soma de todos os números ímpares que são  múltiplos de três e que se encontram
//no conjunto dos números de 1 até 500.
	
	funcao inicio()
	{

		inteiro numero = 0, soma = 0, contador
		
		
		
		para(contador=1;contador<=500;contador++){

		numero = numero + 1

		se (numero % 2 != 0){
			se(numero % 3 == 0){
				soma = soma + numero
			}
		}
		
		}	
		
		escreva("A soma dos números impares multiplos 3 é: ", soma)

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 470; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */