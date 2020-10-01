/* Nome: Guilherme Augusto R. Oliveira
 * Disciplina: Programação de Computadores
 * Programa: Cálculo do salário final de acordo com o salário fixo e a comissão
 */

package pratica_02;

import java.util.Scanner;

public class Problema_09 
{
    public static void main(String[] args) 
    {
        /*
         * O valor da comissão é de 4% sobre as vendas
         */
        Scanner sc = new Scanner(System.in);

        // Declaração das Variáveis
        double salFixo, salFinal, comissao, vendas;

        // Entrada de Dados
        System.out.print("Informe o seu salário atual: R$");
        salFixo = sc.nextDouble();
        System.out.print("Informe o valor das vendas: R$");
        vendas = sc.nextDouble();
        sc.close();

        System.out.println("");

        // Calculo da comissão e do salário final
        comissao = (vendas * 4) / 100;
        salFinal = salFixo + comissao;

        // Saída dos Resultados
        System.out.println("O valor da comissão é de R$" + comissao);
        System.out.println("O valor do salário final é de R$" + salFinal);

        System.out.println("\n");
    }
}
