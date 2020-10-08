/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê um valor e retorna o fatorial
 */

package pratica_04;

import java.util.Scanner;

public class Problema_21 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        int num, fat=1;
        
        //Entrada de Dados
        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();
        sc.close();
        
        // Realiza a contagem até o valor digitado
        for(int i = 1; i <= num; i++)
        {
            fat = fat * i;
        }
        
        //Retorna o valor do fatorial
        System.out.println("O fatorial de " + num + "! = " + fat);
        System.out.println("\n");
    }
}
