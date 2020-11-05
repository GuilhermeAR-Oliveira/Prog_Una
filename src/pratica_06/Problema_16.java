/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Construa um programa que receba um valor N digitado pelo usuário,
 *  some os números do número n até 100 e exiba o valor total da soma. 
 *  pergunte ao usuário se ele deseja entrar ou outro número ou não.
 */

package pratica_06;

import java.util.Scanner;

public class Problema_16 
{
    //Função que retorna a soma dos valores
    public static void somaNum(int[] num, int quant)
    {
        int total = 0;

        for(int i = 0; i <= quant; i++)
        {
            total = total + num[i];
        }

        System.out.println("\nO valor da soma dos números é: " + total);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração do Vetor
        int[] num = new int[100];

        //Declaração das variáveis
        int quant=0;
        char resposta;
        
        //Insere valores no vetor
        for(int i = 0; i <= num.length; i++)
        {
            //Entrada de Dados
            System.out.print("Informe um número: ");
            num[i] = sc.nextInt();

            System.out.print("Deseja informar mais um valor [S/N]: ");
            resposta = sc.next().charAt(0);

            //Verifica a resposta do usuário
            if(resposta == 's' || resposta == 's')
            {
                quant = quant + 1;
            }
            else if(resposta == 'n' || resposta == 'N')
            {
                break;
            }
        }
        sc.close();

        //Chamada da função
        somaNum(num, quant);
    }
}
