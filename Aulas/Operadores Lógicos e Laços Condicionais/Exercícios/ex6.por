programa
{

//6) Elabore um sistema que dada a idade de um nadador classifique-o em uma das seguintes categorias:
//Infantil A = 5 a 7 anos
//Infantil B = 8 a 11 anos
//Juvenil A = 12 a 13 anos
//Juvenil B = 14 a 17 anos
//Adultos = Maiores de 18 anos

	
	funcao inicio()
	{
		inteiro I
		escreva("\nCategorias de nadadores disponiveis a partir dos 5 anos")
		escreva("\nDigite a idade do nadador: ")
		leia(I)		
		limpa()

		se(I >= 5 e I <= 11){
			
			escreva("Infantil A")
		}
		senao se(I >= 8 e I <= 11){
			escreva("Infantil B")
		}
		senao se(I >= 12 e I <= 13){
			escreva("Juvenil A")
		}
		senao se(I >= 14 e I <= 17){
			escreva("Juvenil B")
		}
		senao se(I >= 18){
			escreva("Adultos")
		}
		senao{
			escreva("\nNão há categoria disponivel para essa idade")
		}
		





		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 376; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */