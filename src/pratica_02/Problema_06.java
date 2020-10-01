/* Nome: Guilherme Augusto R. Oliveira
 * Disciplina: Programação de Computadores
 * Programa: Conversão de horas para minutos
 */

package pratica_02;

import java.util.Scanner;

public class Problema_06 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das Variáveis
        double horas;
        int minutos;

        // Entrada de Dados
        System.out.print("Informe o valor em horas: ");
        horas = sc.nextDouble();
        sc.close();

        // Converão de horas para minutos
        minutos = (int) horas * 60;

        // Entrada de Dados
        System.out.println("O valor da conversão de " + horas + " horas " + "para minutos é: " + minutos);
        System.out.println("\n");
    }    
}
