/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Crie um programa contendo um método 
 *   que recebe um vetor contendo números inteiros e 
 *   retorna o menor número do vetor.
 */

package pratica_06;

import java.util.Scanner;

public class Problema_06 
{
    //Função para retornar o menor elemento
    public static int vetorInteiros(int[] v)
    {
        int menor = v[0];

        for(int i = 0; i < v.length; i++)
        {
            if(v[i] < menor)
            {
                menor = v[i];
            }
        }
        return menor;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração das Variáveis
        int quant, vetorMenor;

        //Entrada de Dados
        System.out.print("Informe o tamanho do vetor: ");
        quant = sc.nextInt();

        //Declaração do Vetor
        int vetor[] = new int[quant];

        System.out.println("");

        //Entrada dos elementos do vetor
        for(int i = 0; i < vetor.length; i++)
        {
            System.out.print("Informe o " + (i + 1) + "º elemento do vetor: ");
            vetor[i] = sc.nextInt();
        }
        sc.close();

        //Chamada da função
        vetorMenor = vetorInteiros(vetor);

        //Saída de Dados
        System.out.println("\nO menor elemento do vetor é: " + vetorMenor);
    }
}
