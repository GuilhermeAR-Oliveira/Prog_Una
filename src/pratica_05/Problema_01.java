/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Preenche um vetor com a nota de 5 alunos
 *    e depois calcula a media das notas.
 */

package pratica_05;

import java.util.Scanner;

public class Problema_01 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Delcração do vetor e das variáveis
        double[] notas = new double[5];
        double media=0, soma=0;
        
        //Preenche o vetor com as notas dos alunos
        for(int i = 0; i <= 4; i++)
        {
            System.out.print("Informe a nota do Aluno " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
            sc.close();
            
            soma = soma + notas[i];
        }
        
        //Calcula a média das notas
        media = soma / 5;
        
        //Exibi o resultado
        System.out.println("\nA média das notas é: " + media);
        System.out.println("\n");
    }
}
