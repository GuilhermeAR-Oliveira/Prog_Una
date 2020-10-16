/*	Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Armazena em uma matriz a temperatura média
 * 	de cada trimestre. Retorna a maior e a menor temperatura 
 * 	média de cada trimestre.
 */

package pratica_05;

public class Problema_18 
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
		
		for (int j = 0; j < 4; j++) 
		{
            double menor = temperatura[0][j];
            double maior = temperatura[0][j];
            
            for (int i = 1; i < temperatura.length; i++) 
			{
                if (temperatura[i][j] < menor)
                    menor = temperatura[i][j];
                
                if (temperatura[i][j] > maior)
                    maior = temperatura[i][j];
            }
            
            System.out.println("Trimestre " + (j+1) + " - Maior: " + maior + "  Menor: " + menor);
        }
		System.out.println("\n");
		
	}
}
