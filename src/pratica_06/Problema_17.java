/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Construa um programa que caulcula o salário 
 *   líquido de um funcionário e o imprima na tela. O usuário 
 *   digita o salário bruto do funcionário e a quantidade de 
 *   faltas no mês. salarioL = salarioB - ((salarioB / 30) * faltas) 
 */

package pratica_06;

import java.util.Scanner;

public class Problema_17 
{
    //Função que calcula o salario liquido
    public static double salarioLiquido(double salB, int faltas)
    {
        double salL;

        salL = salB  - ((salB / 30) * faltas);
        return salL;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração das variáveis
        double salB, salL;
        int faltas;

        //Entrada de Dados
        System.out.print("Informe o salário bruto R$");
        salB = sc.nextDouble();
        System.out.print("Informe o número de faltas: ");
        faltas = sc.nextInt();
        sc.close();

        //Chamada da função
        salL =  salarioLiquido(salB, faltas);

        //Saída da função
        System.out.println("\nO valor do salário liquido será de R$" + salL);

    }
}
