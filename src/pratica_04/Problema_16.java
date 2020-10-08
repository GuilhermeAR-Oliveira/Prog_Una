/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê N números inteiros e retorna a 
 *   quantidade e o produto dos valores pares
 */

package pratica_04;

import java.util.Scanner;

public class Problema_16 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        int num, quantV, quantP=0, produto=1;
        
        System.out.print("Deseja informa quantos valores: ");
        quantV = sc.nextInt();
        
        
        //Repete até o valor digitado
        for(int i = 1; i <= quantV; i++)
        {
            System.out.print("Informe um número inteiro: ");
            num = sc.nextInt();
            
            //Verifica se o valor é par
            if(num % 2 == 0)
            {
                quantP++;
                produto = produto * num;
            }
        }
        sc.close();
        
        //Retorno da quantidade e do produto
        System.out.println("\nQuantidade de valores pares: " + quantP);
        System.out.println("Produto dos valores pares: " + produto);
        System.out.println("\n");
        
    }
}
