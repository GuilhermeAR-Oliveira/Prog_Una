/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Faça um programa contendo um método 
 *   que receba um número e que retorne VERDADEIRO 
 *   se o número for primo, e FALSO caso contrário.
 */

package pratica_06;

import java.util.Scanner;

public class Problema_09 
{
    //Função para calcular se o número é primo 
    public static boolean numPrimo(int num)
    {
        boolean primo = true;

        if(num == 1)
        {
            return false;
        }

        for(int i = 2; i < num; i++)
        {
            if (num % i == 0) 
            {
                primo = false;
                break;
            }
        }
        return primo;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração da variável
        int num;

        //Entrada de Dados
        System.out.print("Informe um número inteiro: ");
        num = sc.nextInt();
        sc.close();

        //Saída de Dados
        System.out.println(numPrimo(num));

    }
}
