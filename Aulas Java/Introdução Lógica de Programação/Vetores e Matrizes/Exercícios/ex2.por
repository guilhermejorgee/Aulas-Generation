programa
{

//2.	Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa que gere um vetor com os lançamentos,
//escreva esse vetor. A seguir determine e imprima a média aritmética dos lançamentos, contabilize e apresente também quantas
//foram as ocorrências da maior pontuação.
	
	funcao inicio()
	{

		real media = 0.0, lancamento[10], ocorrencias = 0.0, resul = 0.0, maior = 0.01

		escreva("Informe um valor: ")
		leia(lancamento[0])

		escreva("Informe um valor: ")
		leia(lancamento[1])

		escreva("Informe um valor: ")
		leia(lancamento[2])

		escreva("Informe um valor: ")
		leia(lancamento[3])

		escreva("Informe um valor: ")
		leia(lancamento[4])

		escreva("Informe um valor: ")
		leia(lancamento[5])

		escreva("Informe um valor: ")
		leia(lancamento[6])

		escreva("Informe um valor: ")
		leia(lancamento[7])

		escreva("Informe um valor: ")
		leia(lancamento[8])

		escreva("Informe um valor: ")
		leia(lancamento[9])
		
		limpa()
		
		escreva("\nValores informados são: ",lancamento[0]," - ",lancamento[1]," - ",lancamento[2]," - ",lancamento[3]," - "
		,lancamento[4]," - ",lancamento[5]," - ",lancamento[6]," - ",lancamento[7]," - ",lancamento[8]," - ",lancamento[9])

		media = ((lancamento[0] + lancamento[1] + lancamento[2] + lancamento[3] + lancamento[4] + lancamento[5] + 
		lancamento[6] + lancamento[7] + lancamento[8] + lancamento[9]) / 10)

		escreva("\nA média dos valores informados é: ",media)

		para(inteiro p=0; p<10; p++){
			para(inteiro s=9; s >= 0; s--){
				se(lancamento[p] > lancamento[s]){
					
					se(lancamento[p] > maior){
						maior = lancamento[p]
						
					}
			
				}
			}
		}

		para(inteiro p=0; p<10; p++){
			se(lancamento[p] == maior){
				resul = resul + 1
			}
		}


		
		escreva("\nO número de ocorrências da maior pontuação entre os números é: ", resul,"\nE a pontuação maior é: ",maior)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1862; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */