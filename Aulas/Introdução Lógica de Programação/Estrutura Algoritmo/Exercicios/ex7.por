programa
{	
	//Escreva um sistema que lê os coeficientes a,b,c,d,e e f e calcula e mostra os valores de x e y. 

	//x = c.e – b.f / a.e – b.d       y = a.f – c.d / a.e – b.d

	                                                   //a.x + b.y = c                   d.x + e.y = f
	
	
	funcao inicio()
	{

		real a, b, c, d, ee, f, x, y
		
		escreva("Sistema de Equações Lineares\n")
		
		escreva("Digite o coeficiente a: ")
		leia(a)
		escreva("Digite o coeficiente b: ")
		leia(b)
		escreva("Digite o coeficiente c: ")
		leia(c)
		escreva("Digite o coeficiente d: ")
		leia(d)
		escreva("Digite o coeficiente e: ")
		leia(ee)
		escreva("Digite o coeficiente f: ")
		leia(f)

		x = ( (c*ee) - (b*f) / (a*ee) - (b*d) )

		y = ( (a*f) - (c*d) / (a*ee) - (b*d) )

		escreva("O Valor de x é: ",x)
		escreva("O Valor de y é: ",y)
		

		
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 466; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */