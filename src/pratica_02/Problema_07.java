/* Nome: Guilherme Augusto R. Oliveira
 * Disciplina: Programação de Computadores
 * Programa: Conversão de horas para segundos
 */

package pratica_02;

import java.util.Scanner;

public class Problema_07 
{
    public static void main(String[] args) {
        /*
         * 1h = 3600
         */

        Scanner sc = new Scanner(System.in);

        // Declaração das Variáveis
        double horas;
        int segundos;

        // Entrada de Dados
        System.out.print("Informe o valor em horas: ");
        horas = sc.nextDouble();
        sc.close();

        // Conversão de horas pra segundos
        segundos = (int) horas * 3600;

        // Saída dos Resultados
        System.out.println("O valor da conversão de " + horas + " horas " + "para segundos é: " + segundos);
        System.out.println("\n");
    }
}
