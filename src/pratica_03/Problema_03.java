/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Imprimir três valores em ordem crescente
 */

package pratica_03;

import java.util.Scanner;

public class Problema_03 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das Variáveis
        int a, b, c;

        // Entrada dos Dados
        System.out.print("Digite um valor[A]: ");
        a = sc.nextInt();
        System.out.print("Digite mais um valor[B]: ");
        b = sc.nextInt();
        System.out.print("Digite mais um valor[C]: ");
        c = sc.nextInt();
        sc.close();

        System.out.println("");

        // Impressão dos valores em ordem crescente
        if (a < b && b < c) 
        {
            System.out.println(a + " " + b + " " + c);
        } 
        else if (a < c && c < b)
        {
            System.out.println(a + " " + c + " " + b);
        } 
        else if (c < a && a < b) 
        {
            System.out.println(c + " " + a + " " + b);
        } 
        else if (b < a && a < c) 
        {
            System.out.println(b + " " + a + " " + c);
        } 
        else if (b < c && c < a) 
        {
            System.out.println(b + " " + c + " " + a);
        } 
        else if (c < b && b < a) 
        {
            System.out.println(c + " " + b + " " + a);
        }
        System.out.println("\n");
    }
}
