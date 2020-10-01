/* Nome: Guilherme Augusto R. Oliveira
 * Disciplina: Programação de Computadores
 * Programa: Lê o custo de fábrico de um carro e exiba 
    o valor do custo para o consumidor.
 */

package pratica_02;

import java.util.Scanner;

public class Problema_11 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das Variáveis
        double custoF, custoC, impostos, porcenD;

        // Entrada de Dados
        System.out.print("Informe o custo de fábrica do carro: R$");
        custoF = sc.nextDouble();
        sc.close();

        System.out.println("");

        // Calculo do custo ao consumidor
        porcenD = (custoF * 28) / 100;
        impostos = (custoF * 45) / 100;
        custoC = custoF + porcenD + impostos;

        // Saída dos Resultados
        System.out.println("O valor do carro ao consumidor é de R$" + custoC);
        System.out.println("\n");
    }
}
