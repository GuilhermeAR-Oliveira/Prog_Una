/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Construa um programa que dois números 
 *   e retorna o maior deles.   
 */

package pratica_06;

import java.util.Scanner;

public class Problema_14 
{
    //Função que retorna o maior valor
    public static int maiorNumero(int n1, int n2)
    {
        int maior = n1;

        if(n1 > n2)
        {
            maior = n1;
            return maior;
        }
        else
        {
            maior = n2;
            return maior;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração das Variáveis
        int num1, num2, maiorNum;

        //Entrada de Dados
        System.out.print("Informe um valor: ");
        num1 = sc.nextInt();
        System.out.print("Informe um valor: ");
        num2 = sc.nextInt();
        sc.close();

        //Chamada da função
        maiorNum = maiorNumero(num1, num2);

        //Saída de Dados
        System.out.println("\nO maior número é: " + maiorNum);
    }
}
