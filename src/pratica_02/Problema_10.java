/* Nome: Guilherme Augusto R. Oliveira
 * Disciplina: Programação de Computadores
 * Programa:  Lê o número de horas trabalhadas, o valor do salário mínimo 
 * e o número de horas extras trabalhadas. Cacular e exibir o salario.
 */

package pratica_02;

import java.util.Scanner;

public class Problema_10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das Variáveis
        double horasT, horasE, salM, salB, salT;
        double valorHT, valorHE, quantiaHE;

        // Entrada de Dados
        System.out.print("Informe o número de horas trabalhadas: ");
        horasT = sc.nextDouble();
        System.out.print("Informe o salário mínimo: R$");
        salM = sc.nextDouble();
        System.out.print("Informe o número de horas extras realizadas: ");
        horasE = sc.nextDouble();
        sc.close();

        System.out.println("");

        // Calculos do salário
        valorHT = salM / 8;
        valorHE = salM / 4;
        salB = horasT * valorHT;
        quantiaHE = horasE * valorHE;
        salT = salB + quantiaHE;

        // Saída dos Resultados
        System.out.println("O valor da hora trabalhada é de R$" + valorHT);
        System.out.println("O valor da hora extra é de R$" + valorHE);
        System.out.println("O salário bruto é de R$" + salB);
        System.out.println("A quantia a receber por horas extras é de R$" + quantiaHE);
        System.out.println("O salário total é de R$" + salT);

        System.out.println("\n");
    }
}
