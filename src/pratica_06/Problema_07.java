/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Crie um programa contendo um método 
 *   que recebe um número inteiro positivo e retorna 
 *   o fatorial deste número.
 */

package pratica_06;

import java.util.Scanner;

public class Problema_07 
{
    //Função para calcular do fatorial
    public static int fatorial(int num)
    {
        int fat=1;

        for(int i = 2; i <= num; i++)
        {
            fat = fat * i;
            //System.out.print(i + " x ");
        }
        return fat;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração das Variáveis
        int num, fat;

        //Entrada de Dados
        System.out.print("\nInforme um número inteiro: ");
        num = sc.nextInt();
        sc.close();

        //Chamada da função
        fat = fatorial(num);

        //Saída de dados
        System.out.println("O fatorial de " + num + "! é: " + fat);
    }
}
