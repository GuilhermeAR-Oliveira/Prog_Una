/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Cálculo da área e do perímetro de um retângulo
 */

package pratica_02;

import java.util.Scanner;

public class Problema_03 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);

        /*
         * Area = base * altura Perimetro = 2 * (b + h)
         */

        // Declaração das Variáveis
        int base, altura, area, perim;

        // Entrada de Dados
        System.out.print("Informe a base: ");
        base = sc.nextInt();
        System.out.print("Informe a altura: ");
        altura = sc.nextInt();
        System.out.println("");
        sc.close();

        // Calculo da área e do perímetro
        area = base * altura;
        perim = 2 * (base + altura);

        // Saída dos Resultados
        System.out.println("O valor da área do retângulo é: " + area);
        System.out.println("O valor do perímetro do retângulo é: " + perim);

        System.out.println("\n");
    }
}
