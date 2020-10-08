/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê 100 números inteiros e retorne o produto
 *   dos mesmos.     
 */
package pratica_04;

import java.util.Scanner;

public class Problema_14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        int num, produto = 1;
        
        // Repete até 100 números inteiros
        for(int i = 1; i <= 100; i++)
        {
            //Entrada de Dados
            System.out.print("Informe um número inteiro: ");
            num = sc.nextInt();
            sc.close();
            produto = produto * num;
        }
        
        //Retorna o produto dos números
        System.out.println("\nO produto dos números é: " + produto);
        System.out.println("\n\n");   
    }
}
