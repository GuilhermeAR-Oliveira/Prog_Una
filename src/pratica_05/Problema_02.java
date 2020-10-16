/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Preenche um vetor com a 3 notas de um aluno
 *    e depois calcula a soma total das notas.
 */

package pratica_05;

import java.util.Scanner;

public class Problema_02 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração do vetor
        double[] notaProvas = new double[3];
        double totalP=0;
        
        //Preenche o vetor com três notas
        for(int i = 0; i <= 2; i++)
        {
            System.out.print("Digite a nota da prova " + (i + 1) + ": ");
            notaProvas[i] = sc.nextDouble();
            sc.close();
            
            totalP = totalP + notaProvas[i];
        }
        
        //Exibi o total dos pontos
        System.out.println("\nTotal de pontos: " + totalP);
        System.out.println("\n");
        
        
    }
}
