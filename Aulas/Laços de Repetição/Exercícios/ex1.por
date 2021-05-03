programa
{
	inclua biblioteca Matematica

//1- A prefeitura de uma cidade fez uma pesquisa entre 20 de seus habitantes, coletando dados sobre o salário e número de filhos.
//A prefeitura deseja saber:
   
//a) média do salário da população; 
//b) média do número de filhos; 
//c) maior salário; 
//d) percentual de pessoas com salário até R$100,00.  

	

	
	funcao inicio()
	{
		real salario, maiorSalario = 0, percentual = 0, mediaSalario = 0, somaSalario = 0, mediaFilhos = 0, pC = 0, somaFilhos = 0
		inteiro qtFilhos, contador

		para(contador=1;contador<=20;contador++){

		escreva("Informe seu salário: ")
		leia(salario)
		escreva("Informe quantos filhos possui: ")
		leia(qtFilhos)

		somaSalario = somaSalario + salario
		somaFilhos = somaFilhos + qtFilhos

			se(salario > maiorSalario){
				maiorSalario = salario
			}
			se(salario <=100){
				pC = pC + 1
				//percentual = (pC / 20) * 100 
			}
	
				
		}
		mediaSalario = somaSalario / 20
		mediaFilhos = somaFilhos / 20
		percentual = ((pC / 20) * 100) 

		escreva("\nA Média dos Salário é: ",mediaSalario)
		escreva("\nA Média de Filhos é: ",Matematica.arredondar(mediaFilhos, 1))
		escreva("\nA O maior salario é: ",maiorSalario)
		escreva("\nA O percentual de salário de até R$100,00: ",percentual)
	
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 562; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */