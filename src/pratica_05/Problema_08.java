/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Preenche um dois vetore de 5 posições e 
 *   imprimi um terceiro vetor que é a soma dos
 *   elementos dos outros vetores.    
 */

package pratica_05;

import java.util.Scanner;

public class Problema_08 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração dos vetores
        int vet = 5;
        int[] vetor1 = new int[vet];
        int[] vetor2 = new int[vet];
        int[] vetor3 = new int[vet];
        
        //Preenche o vetor1 e vetor2
        for(int i = 0; i <= 4; i++)
        {
            System.out.print("Informe o valor para a posição " + i + " do vetor 1: ");
            vetor1[i] = sc.nextInt();
            System.out.print("Informe o valor para a posição " + i + " do vetor 2: ");
            vetor2[i] = sc.nextInt();
        }
        sc.close();
        
        System.out.println();
        
        //Preenche o vetor3
        for(int i = 0; i < vet; i++)
        {
            vetor3[i] = vetor1[i] + vetor2[i];
        }
        
        //Imprimi o vetor1
        System.out.print("Vetor 1: [");
        for(int vetor1i : vetor1)
        {
            System.out.printf("%5d",vetor1i);
        }
        System.out.println("   ]");
        
        //Imprimi o vetor2
        System.out.print("Vetor 2: [");
        for(int vetor2i : vetor2)
        {
            System.out.printf("%5d", vetor2i);
        }
        System.out.println("   ]");
        
        //Imprimi o vetor3
        System.out.print("Vetor 3: [");
        for(int vetor3i : vetor3)
        {
            System.out.printf("%5d", vetor3i);
        }
        System.out.println("   ]");
        System.out.println("\n");
    }
}
