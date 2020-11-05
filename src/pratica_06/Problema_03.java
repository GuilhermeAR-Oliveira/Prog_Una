/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Crie um programa contendo dois métodos 
 *   que imprimem vetores de números. O primeiro método 
 *   imprime um vetor de números inteiros, e o segundo 
 *   imprime um vetor de números reais.
 */

package pratica_06;

public class Problema_03 
{
    //Método para que imprimir um vetor de inteiros
    public static void vetorInteiro(int[] v)
    {
        for(int i : v)
        {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    //Método para que imprimir um vetor de reais
    public static void vetorReal(double[] v)
    {
        for(double i : v)
        {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args)
    {
        //Declaração dos vetores
        int[] v1 = {1, 44, 2, 9, 10};
        double[] v2 = {1.5, 4.5, 6.8, 4.9};

        //Chamada do método
        vetorInteiro(v1);
        vetorReal(v2);
    }
}
