/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Par ou Ímpar
 */

package pratica_03;

import java.util.Scanner;

public class Problema_02 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        int num;

        System.out.print("Digite um número inteiro: ");
        num = sc.nextInt();
        System.out.println("");
        sc.close();       

        // Teste se é par ou ímpar
        if (num % 2 == 0) {
            System.out.println("O número " + num + " é par");
        } else {
            System.out.println("O número " + num + " é ímpar");
        }
        System.out.println("\n");
    }
}
