/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Lê dois valores e exibi se são múltiplos ou não 
 */

package pratica_03;

import java.util.Scanner;

public class Problema_05 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        int num1, num2;

        // Entrada de Dados
        System.out.print("Digite um valor: ");
        num1 = sc.nextInt();
        System.out.print("Digite outro valor: ");
        num2 = sc.nextInt();
        sc.close();

        System.out.println("");

        // Testa se são múltiplos
        if (num1 % num2 == 0 || num2 % num1 == 0) 
        {
            System.out.println("São múltiplos");
        } 
        else 
        {
            System.out.println("Não são múltiplos");
        }
        System.out.println("\n");
    }
}
