/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Preencha um vetor de 10 posições, guarde 
 *   os 10 numeros na ordem inversa em outro vetor.
 *   Exiba o valor de ambos os vetores.
 */

package pratica_05;

import java.util.Scanner;

public class Problema_09 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração dos Vetores
        int[] vetorOriginal = new int[10];
        int num = vetorOriginal.length;
        int[] vetorInvertido = new int[num];
        
        //Preenche o vetor original
        for(int i = 0; i < vetorOriginal.length; i++)
        {
            System.out.print("Informe a posição " + i + " para o vetor: ");
            vetorOriginal[i] = sc.nextInt();
        }
        sc.close();
        System.out.println("");
        
        //Preenche o outro vetor com os valores inversos
        for(int i = 0; i < num; i++)
        {
            vetorInvertido[i] = vetorOriginal[num-1-i];
        }
        
        //Lê o vetor original
        System.out.print("vetorOriginal = [");
        for(int vet : vetorOriginal)
        {
            System.out.printf("%5s", vet);
        }
        System.out.println("    ]");
        
        //Lê o vetor invertido
        System.out.print("vetorInvertido = [");
        for(int vet : vetorInvertido)
        {
            System.out.printf("%5s", vet);
        }
        System.out.println("    ]");
        System.out.println("\n");
        
        
        
    }
}
