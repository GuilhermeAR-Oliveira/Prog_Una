/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Recebe três notas de 0 a 100 e exibi o conceito do aluno
 */

package pratica_03;

import java.util.Scanner;

public class Problema_09 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das Variáveis
        int nota;

        // Entrada de Dados
        System.out.print("Informe a sua nota[0 - 100]: ");
        nota = sc.nextInt();
        sc.close();

        System.out.println("");

        // Verifica a nota
        if (nota >= 0 & nota <= 49) 
        {
            System.out.println("Insuficiente");
        } 
        else if (nota >= 50 & nota <= 64) 
        {
            System.out.println("Regular");
        } 
        else if (nota >= 65 & nota <= 84) 
        {
            System.out.println("Bom");
        } 
        else if (nota >= 85 & nota <= 100) 
        {
            System.out.println("Ótimo");
        }
        System.out.println("\n");

    }
}
