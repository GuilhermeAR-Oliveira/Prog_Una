/* Nome: Guilherme Augusto R. Oliveira
 * Disciplina: Programação de Computadores
 * Programa: Conversão de minutos para horas
 */

package pratica_02;

import java.util.Scanner;

public class Problema_05 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das Variáveis
        int minutos;
        double horas;

        // Entrada de Dados
        System.out.print("Informe o valor em minutos: ");
        minutos = sc.nextInt();
        sc.close();

        // Conversão de minutos para horas
        horas = minutos / 60;

        // Saída dos Resultados
        System.out.println("O valor da conversão de " + minutos + " minutos " + "para horas é: " + horas);
        System.out.println("\n");
    }
}
