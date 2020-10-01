/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Calcular e exibir o valor final de um financiamento.
 */

package pratica_02;

import java.util.Scanner;

public class Problema_13 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das Variáveis
        double valorC, taxaJ, valorF;
        int tempo;

        // Entrada de Dados
        System.out.print("Digite o valor contratado R$");
        valorC = sc.nextDouble();
        System.out.print("Digite o tempo em meses dos empréstimo: ");
        tempo = sc.nextInt();
        System.out.print("Digite a taxa de juros: R$");
        taxaJ = sc.nextDouble();
        sc.close();

        System.out.println("");

        // Calculo do financiamento
        valorF = valorC * Math.pow((1 + taxaJ), tempo);

        // Saída do Resultado
        System.out.println("O valor final do fincancimaneto é de R$" + valorF);
        System.out.println("\n");
    }
}
