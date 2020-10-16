/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores e POO
 *  Programa: Preenche um vetor de 13 posições, cada 
 *   elemento é o quadrado da sua posição. Ao final
 *   imprimi o vetor resultante.
 */

package pratica_05;

public class Problema_06 
{
    public static void main(String[] args) 
    {
       // Declaração do Vetor
        double[] vetor = new double[13];


       // Preenche o vetor 
        System.out.print("[");
        for(int i = 0; i <= 12; i++)
        {
            vetor[i] = Math.pow((i + 1), 2);
            System.out.print("  " + vetor[i] + "  ");
        }
    
       //Exibi o valor final do vetor
        System.out.print("]");
        System.out.println("\nVetor resultante: " + vetor[12]);
        System.out.println("\n");
    }
}
