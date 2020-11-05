/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Crie um programa contendo um método 
 *   que recebe um vetor contendo números reais e 
 *   retorna a média aritmética dos elementos do vetor.
 */

package pratica_06;

import java.util.Scanner;

public class Problema_04 
{
    //Função para calcular a média de um vetor
    public static double vetorReal(double[] v)
    {
        double media=0;

        for(int i = 0; i < v.length; i++) 
        {
            media = media + v[i];
        }
        media = media / v.length;

        return media;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração do Vetor e variáveis
        double[] v = new double[5];
        double media;

        
        for(int i = 0; i < v.length; i++)
        {
            //Entrada de Dados
            System.out.print("Informe o " + (i + 1) + "º valor: ");
            v[i] = sc.nextDouble();
        }
        sc.close();

        //Chamada da função
        media = vetorReal(v);

        //Saídade Dados
        System.out.println("\nO valor da média do vetor é: " + media);
    }
}
