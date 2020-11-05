/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Crie um método que recebe um vetor de números inteiros 
 *   e um número inteiro. O método deve retornar o número de ocorrências 
 *   desse número no vetor
 */

package pratica_06;

import java.util.Scanner;

public class Problema_12 
{
    //Função que retornar ocorrências no Vetor
    public static int buscaVet(int[] vet, int vetNum)
    {
        int quant=0;

        for(int v : vet)
        {
            if(v == vetNum)
            {
                quant++;
            }
            else
            {
                return 0;
            }
        }
        return quant;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 

        //Declaração das Variáveis
        int vetQuant, vetNum, busca;

        //Entrada de Dados
        System.out.print("Informe o tamanho do vetor: ");
        vetQuant = sc.nextInt();

        //Declaração do vetor
        int vet[] = new int[vetQuant];

        //Insere os elementos no vetor
        for(int i = 0; i < vet.length; i++) 
        {
            System.out.print("Informe o elemento para a posição [" + (i + 1) + "]: ");
            vet[i] = sc.nextInt();
        }

        //Entrada de Dados
        System.out.print("Informe o elemento a ser buscado no vetor: ");
        vetNum = sc.nextInt();
        sc.close();

        //Chamada da função
        busca = buscaVet(vet, vetNum);

        //Saída de Dados
        System.out.println("\nO elemento " + vetNum + " apareceu " + busca + " vezes no vetor");
        System.out.println();
    }
}
