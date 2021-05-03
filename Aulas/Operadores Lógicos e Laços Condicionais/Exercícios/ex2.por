programa
{

//2) Elabore um sistema que leia as variáveis C e N, respectivamente código e número de horas trabalhadas
//de um operário. E calcule o salário sabendo-se que ele ganha R$ 10,00 por hora. Quando o número de horas exceder
//a 50 calcule o excesso de pagamento armazenando-o na variável E, caso contrário zerar tal variável. A hora excedente
//de trabalho vale R$ 20,00. No final do processamento imprimir o salário total e o salário excedente.
	
	funcao inicio()
	{
		inteiro C, N
		real E = 0, H, T, G


		escreva("Digite seu código de funcionário: ")
		leia(C)
		escreva("Informe seu horas trabalhadas: ")
		leia(N)
		
		se(N>50){
			H = (N - (N-50)) * 10.00
			E = (N - 50) * 20.00
			T = E + H
			
			escreva("\nSalário Base: ", H)
			escreva("\nSalário Excedente: ",E)
			escreva("\nSalário Total: ",T)
		}
		senao{
			H = N * 10.00
			escreva("Salário Total: ",H)
			escreva("\nExcedente: ",E)
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 895; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */