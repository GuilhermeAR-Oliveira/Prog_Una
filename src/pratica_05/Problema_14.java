/*
 *  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Armazena as notas dos alunos em um vetor,
 *   imprima as notas e retorna no final o status de 
 *   aprovamento de cada um.
 */

package pratica_05;

public class Problema_14 
{
	public static void main(String[] args) 
	{
		//Declaração da variável
		double notaF = 0;
		
		//Declaração da Matriz
		double notaAluno[][] = {
			
			{3.3, 4.0, 1.8},
			{2.0, 2.5, 1.5},
			{2.5, 3.0, 1.7},
			{1.5, 2.0, 1.0},
			{4.0, 4.0, 2.0}
		};
		
		//Percorre a matriz
		for(int i = 0; i < notaAluno.length; i++)
		{
			System.out.print("\nAluno " + (i + 1) + ": " );
			
			notaF = 0;
			for(int j = 0; j < notaAluno[i].length; j++)
			{
				System.out.print(notaAluno[i][j] + " ");
				notaF = notaF + notaAluno[i][j];
			}
			
			//Verifica a nota final
			if(notaF >= 6.0)
			{
				System.out.print("--> Nota Final: " + notaF + " - Aprovado");
			}
			else
			{
				System.out.print("--> Nota Final: " + notaF + " - Reprovado");
			}
			
		}
		
		System.out.println("\n");
	}
}
