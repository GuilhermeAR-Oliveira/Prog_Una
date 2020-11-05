/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Construa um programa que calcula o
 *   coneito em função da nota do aluno.
 */

package pratica_06;

import java.util.Scanner;

public class Problema_15 
{
    //Função que verifica o conceito do aluno
    public static void conceitoAluno(int nota)
    {
        if(nota >= 0 && nota <= 49)
        {
            System.out.println("Insuficiente");
        }
        else if(nota >= 50 && nota <= 64)
        {
            System.out.println("Regular");
        }
        else if(nota >= 65 && nota <= 84)
        {
            System.out.println("Bom");
        }
        else if(nota >= 85 && nota <= 100)
        {
            System.out.println("Ótimo");
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração da variáveis
        int nota;

        //Entrada de dados
        System.out.print("Informe a sua nota: ");
        nota = sc.nextInt();
        sc.close();

        //Chamada da função
        conceitoAluno(nota);
    }
}
