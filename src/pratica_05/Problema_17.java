/*	Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Armazena em uma matriz a temperatura média
 * 	de cada trimestre. Retorna a temperatura média de cada
 * 	trimestre considerando o ano.
 */

package pratica_05;

public class Problema_17 
{
	public static void main(String[] args) 
	{
		
		//Declaração da matriz
		int temperatura[][] = {
			{30, 25, 27, 31},
			{31, 26, 28, 33},
			{29, 23, 26, 34},
			{28, 23, 27, 30},
			{33, 22, 25, 31},
			{32, 21, 26, 29}
		};
		
		for(int i = 0; i < temperatura.length; i++)
		{
			double media=0;
			
			for(int j = 0; j < temperatura[i].length; j++)
			{
				media = media + temperatura[i][j];
			}
			
			media = media / temperatura.length;
			System.out.println("Temperatura média do trimestre " + (i+1) + ": " + media);
		}
		System.out.println("\n");
	
	}
}
