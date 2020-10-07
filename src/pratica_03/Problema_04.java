/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Lê três valores e exibi se a soma 
 *  de A com B é menor, maior ou igual a C
 */

package pratica_03;

import java.util.Scanner;

public class Problema_04 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das Variáveis
        int num1, num2, num3, soma;

        // Entrada dos Dados
        System.out.print("Digite um valor[A]: ");
        num1 = sc.nextInt();
        System.out.print("Digite mais um valor[B]: ");
        num2 = sc.nextInt();
        System.out.print("Digite mais um valor[C]: ");
        num3 = sc.nextInt();
        sc.close();

        System.out.println("");

        // Soma entre A e B
        soma = num1 + num2;

        // Teste se A com B é maio que C
        if (soma < num3) 
        {
            
            System.out.println("A soma entre " + num1 + " e " + num2 + " é menor que " + num3);
        } 
        else if (soma > num3) 
        {
            
            System.out.println("A soma entre " + num1 + " e " + num2 + " é maior que " + num3);
        } 
        else 
        {
            System.out.println("A soma entre " + num1 + " e " + num2 + " é igual a " + num3);
        }
        System.out.println("\n");
    }
}
