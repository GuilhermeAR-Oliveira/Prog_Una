/*	Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Armazena em uma matriz os valores de um serviços
 * 	de manicure, calcule o valor do salario  ao final do mês.
 *  O valor de ambos os sercições já é definido. 
 */

package pratica_05;

import java.util.Scanner;

public class Problema_15 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Declaração das variáveis
		int maos, pes;
		double salarioMes, valorM, valorP, porcenM, porcenP;
		
		//Declaração da Matriz
		int manicureS[][] = new int[4][2];
		
		//Percorre e armazena os valores na matriz
		for(int i = 0; i < manicureS.length; i++)
		{
			System.out.println("Manicure " + (i + 1) + " :");
			System.out.print("Informe a quantidade de serviços - [mãos]: ");
			maos = sc.nextInt();
			System.out.print("Informe a quantidade de serviços - [pés]: ");
			pes = sc.nextInt();
			sc.close();
			
			valorM = (maos * 20);
			valorP = (pes * 25);
			
			porcenM = valorM * 70 / 100;
			porcenP = valorP * 70 / 100;
			
			//Calcula o valor total no mês
			salarioMes = (maos * porcenM) + (pes * porcenP); 
			
			System.out.println("Salario no mês: R$" + salarioMes);
			System.out.print("-------------------------------------------\n");
			
			salarioMes = 0;
			for(int j = 0; j < manicureS[i].length; j++)
			{
				salarioMes = (valorM + porcenM) + (valorP + porcenP);
			}
		}
	}
}
