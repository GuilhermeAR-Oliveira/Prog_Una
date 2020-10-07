/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Lê um valor e exibi se é um 
    número par ou ímpar ou se é positivo ou negativo
 */

package pratica_03;

import java.util.Scanner;

public class Problema_06 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das variáveis
        int num;

        // Entrada de Dados
        System.out.print("Digite um valor inteiro: ");
        num = sc.nextInt();
        sc.close();

        System.out.println("");

        // Teste de par ou impar e negativo ou positivo
        if (num % 2 == 0 & num > 0) 
        {
            System.out.println("O número " + num + " é par e positivo");
        } 
        else if (num % 2 != 0 & num > 0) 
        {
            System.out.println("O número " + num + " é ímpar e positivo");
        } 
        else if (num % 2 == 0 & num < 0) 
        {
            System.out.println("O número " + num + " é par e negativo");
        } 
        else 
        {
            System.out.println("O número " + num + " é ímpar e negativo");
        }
        System.out.println("\n");

    }
}
