/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Cálculo da área e do perímetro de uma circunferência
 */
package pratica_02;

import java.util.Scanner;

public class Problema_02 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        /*
         * A = pi . r^2 P = (2 * pi) * r
         */

        // Declaração das Variáveis
        double area, raio, perim;
        double pi = 3.14;

        // Entrada de Dados
        System.out.print("Informe a valor do raio: ");
        raio = sc.nextDouble();
        System.out.println("");

        sc.close();

        // Calculo da área e do perimetro
        area = pi * Math.pow(raio, 2);
        perim = (2 * pi) * raio;

        // Saída dos Resultados
        System.out.println("O valor da area é: " + area);
        System.out.println("O valor do perimetro é: " + perim);

        System.out.println("\n");
    }
}
