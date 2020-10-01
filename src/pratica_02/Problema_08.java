/* Nome: Guilherme Augusto R. Oliveira
 * Disciplina: Programação de Computadores
 * Programa: Cálculo da soma, multiplicação e media de 3 números reais
 */

package pratica_02;

import java.util.Scanner;

public class Problema_08 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das Variáveis
        double num1, num2, num3;
        double soma, multi, media;

        // Entrada de Dados
        System.out.print("Informe um número real: ");
        num1 = sc.nextDouble();
        System.out.print("Informe um outro número real: ");
        num2 = sc.nextDouble();
        System.out.print("Informe mais outro número real: ");
        num3 = sc.nextDouble();
        sc.close();

        System.out.println("");

        // Cálculos
        soma = num1 + num2 + num3;
        multi = num1 * num2 * num3;
        media = soma / 3;

        // Saída dps Resultados
        System.out.println("O valor da soma é: " + soma);
        System.out.println("O valor da multiplicação é: " + multi);
        System.out.println("O valor da media é " + media);

        System.out.println("\n");
    }
}
