package Project_Vac;

public class Idade extends Pessoa{
	
	private int idade;
	int resultado;
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int condicaoIdade(int i) {
		
		if(i >= 60 && i <= 64) 
		{
			resultado = 1;
		}
		else if (i >= 65 && i <=70 )
		{
			resultado = 2;
		}
		else if (i >= 71 && i <= 75)
		{
			resultado = 3;
		}
		else if (i >= 76 && i <= 80)
		{
			resultado = 4;
		}
		else if(i > 80) 
		{
			resultado = 5;
		}
		else
		{
			resultado = 0;
		}
		return resultado;	
	}	
}
