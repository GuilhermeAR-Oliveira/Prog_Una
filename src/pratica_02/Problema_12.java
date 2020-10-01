/* Nome: Guilherme Augusto R. Oliveira
 * Disciplina: Programação de Computadores
 * Programa: Calcular e exibir a distância entre dois pontos de um plano.
 */
package pratica_02;

import java.util.Scanner;

public class Problema_12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das Variáveis
        double x1, y1, x2, y2, dist;

        // Entrada de Dados
        System.out.print("Informe o ponto x1 do plano: ");
        x1 = sc.nextDouble();
        System.out.print("Informe o ponto y1 do plano: ");
        y1 = sc.nextDouble();
        System.out.print("Informe o ponto x2 do plano: ");
        x2 = sc.nextDouble();
        System.out.print("Informe o ponto y2 do plano: ");
        y2 = sc.nextDouble();
        sc.close();

        System.out.println("");

        // Calculo da distancia
        dist = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

        System.out.format("A distância entre os pontos é: %.2f", dist);
        System.out.println("\n");
    }
}
