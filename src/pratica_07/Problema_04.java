/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Programa que lê os dados de uma 
 *   classe e aramazena em um objeto da classe.
 */

package pratica_07;

import java.util.Scanner;

public class Problema_04 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Instancia a classe
        conta c = new conta();

        //Entrada de Dados
        System.out.print("Informe o número da conta: ");
        c.numConta = sc.nextInt();
        sc.close();

        //Saída de Dados
        System.out.println("Número da Conta: " + c.numConta);
    }
}
