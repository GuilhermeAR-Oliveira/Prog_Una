/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Procura o inteiro x no vetor v e retorna a sua posição. 
 *   Caso x não seja encontrado, retorna -1.
 */

package pratica_06;

import java.util.Scanner;

public class Problema_10 
{
    //Função que retorna a busca no Vetor
    public static int buscaVetor(int[] vet, int num)
    {
        for (int i = 0; i < vet.length; i++) 
        {
            if (vet[i] == num)
            {
                return i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração da Variáveis
        int pos, vetQuant, num;
        
        //Entrada de Dados
        System.out.print("Informe o tamanho de vetor: "); 
        vetQuant = sc.nextInt();

        //Declaração do Vetor
        int[] vet = new int[vetQuant];

        //Insere os elementos no vetor
        for(int i = 0; i < vet.length; i++)
        {
            System.out.print("Informe um valor para a posição [" + (i + 1) + "]: ");
            vet[i] = sc.nextInt();
        }

        //Entrada de Dados
        System.out.print("Informe um valor a ser buscado no vetor: ");
        num = sc.nextInt();
        sc.close();

        //Chamada da função
        pos = buscaVetor(vet, num);

        //Saída de Dados
        System.out.println("O elemento " + num + " esta na posição [" + pos + "] do vetor");

        System.out.println();
    }
}
