/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Lê um caractere e exiba uma mensagem 
 */

package pratica_03;

import java.util.Scanner;

public class Problema_07 
{
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das Variáveis
        char letra;

        // Entrada de Dados
        System.out.print("Digite uma letra: ");
        letra = sc.next().charAt(0);
        sc.close();

        System.out.println("");

        // Testa qual caractere foi digitado
        if (letra == 'S' || letra == 's') 
        {
            System.out.println("Você digitou SIM");
        } 
        else if (letra == 'N' || letra == 'n') 
        {
            System.out.println("Você digitou NÃO");
        } 
        else 
        {
            System.out.println("Digitação errada. Tente Novamente.");
        }
        System.out.println("\n");
    }
}
