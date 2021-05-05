programa
{
	inclua biblioteca Matematica --> mat

//Construa um programa em c que, tendo como dados de entrada dois pontos quaisquer no plano, P(x1, y1) e P(x2, y2),
//escreva a distância entre eles. A fórmula que efetua tal cálculo é: 

						//d= raiz( (x2-x1)**2 + (y2-y1)**2 )
	
	funcao inicio()
	{	

		real x1, y1, x2, y2, d
		
		escreva("Este é um programa para calcular dois pontos quaisquer em um plano\nos valores pedidos serão p(x1,y1) e p(x2,y2)")
		escreva("\nEscreva o valor x1 do P: ")
		leia(x1)
		escreva("\nEscreva o valor y1 do P: ")
		leia(y1)
		escreva("\nEscreva o valor x2 do P: ")
		leia(x2)
		escreva("\nEscreva o valor x2 do P: ")
		leia(y2)

		d = Matematica.raiz(Matematica.potencia((x2-x1), 2) + Matematica.potencia((y2-y1), 2), 2)

		escreva("Distância entre eles é de ",d)

		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 803; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */