/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Crie um metodo para calcular a media
 *   de dois valores e retorna a media.
 */

package pratica_06;

import java.util.Scanner;

public class Problema_01 
{
    //Função para calcular a média
    public static double calcularMedia(double n1, double n2)
    {
        return (n1 + n2) / 2;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração das variáveis
        double num1, num2, media;

        //Entrada de Dados
        System.out.print("Informe um valor: ");
        num1 = sc.nextDouble();
        System.out.print("Informe um outro valor: ");
        num2 = sc.nextDouble();
        sc.close();

        //Chamada da função
        media = calcularMedia(num1, num2);

        //Saída de dados
        System.out.println("A média é: " + media);
    }
}
