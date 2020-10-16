/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Preeche um vetor com 5 valores inteiros,
 *   imprime o vator e exibia a quantidade de valores negativos.
 */

package pratica_05;

import java.util.Scanner;

public class Problema_07 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração do Vetor
        int[] vetor = new int[5];
        int quantN=0;
        
        //Preenche o vator
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print("Informe um numero inteiro: ");
            vetor[i] = sc.nextInt();
        }
        sc.close();

        System.out.print("\nVetor:\n[");
        
        //Lê o vetor
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print("  " + vetor[i] + "  ");
            
            //Verifica os valores negativos
            if(vetor[i] < 0)
            {
                quantN++;
            }
        }
        //Exibe o resultado
        System.out.print("]");
        System.out.println("\nQuantidade de numeros nagativos no vetor: " + quantN++);
        System.out.println("\n");
    }
}
