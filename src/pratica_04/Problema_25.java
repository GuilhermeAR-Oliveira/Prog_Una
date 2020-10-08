/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Exibe a tabuada de todos os numeros
 *    de 1 até o valor digitado
 */

package pratica_04;

import java.util.Scanner;

public class Problema_25 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        int num;
        
        //Entrada de dados
        System.out.print("Informe um número inteiro: ");
        num = sc.nextInt();
        sc.close();
        
        System.out.println("");
        
        // Repete até o numero informado
        for(int i = 1; i <= num; i++)
        {
            System.out.println(i + " x " + num + " = " + (i * num));
        }
        
        System.out.println("\n");
    }
}
