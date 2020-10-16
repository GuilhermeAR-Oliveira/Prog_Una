/*	Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Armazena em uma matriz a temperatura média
 * 	 de cada trimestre. Retorna a temperatura de acordo
 * 	 com o ano e o trimestre.
 */

package pratica_05;

import java.util.Scanner;

public class Problema_16 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		//Declaração de Variáveis
		int ano, trimestre;
		
		//Declaração da matriz
		int temperatura[][] = {
			{30, 25, 27, 31},
			{31, 26, 28, 33},
			{29, 23, 26, 34},
			{28, 23, 27, 30},
			{33, 22, 25, 31},
			{32, 21, 26, 29}
		};
		
		//Entrada de Dados
		System.out.print("Informe o ano: ");
		ano = sc.nextInt();
		System.out.print("Informe o trimestre: ");
		trimestre = sc.nextInt();
		sc.close();
		
		int i = ano - 2013;
		int j = trimestre - 1;
		
		System.out.print("\nA temperatura média é: " + temperatura[i][j]);
		System.out.println("\n");
		
	}
}
