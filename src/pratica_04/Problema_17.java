/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê um valor e retorna uma tabela de valores
 */

package pratica_04;

import java.util.Scanner;

public class Problema_17 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração de variáveis
        int num;
        
        //Entrada de Dados
        System.out.print("Digite um valor: ");
        num = sc.nextInt();
        sc.close();
        
        System.out.printf("\n%-10s %-10s %-10s %-10s\n", "N", "10*N", "100*N", "1000*N");
        
        //Repete até o valor digitado
        for(int i = 1; i <= num; i++)
        {
            System.out.printf("%-10d %-10d %-10d %-10d\n", i, 10*i, 100*i, 1000*i);
        }
        
        System.out.println("\n");
    }
}
