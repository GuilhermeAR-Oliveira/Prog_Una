/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Construa um programa que caulcula o salário 
 *   líquido de um funcionário, de acordo com a quantidade de
 *   faltas entre 0 e 30, TRUE se entiver entre a
 *   faixa de valor e FALSE se não estiver. Caso o valor seja  
 *   verdadeiro o calculo do salario é realizado.    
 *   salarioL = salarioB - ((salarioB / 30) * faltas) 
 */

package pratica_06;

import java.util.Scanner;

public class Problema_18 
{

    //Função que retorna o salario líquida
    public static double salarioLiquido(double salB, int faltas)
    {
        double salL;

        salL = salB  - ((salB / 30) * faltas);
        return salL;
    }

    //Função que retorna as faltas
    public static boolean verficaFaltas(int faltas)
    {
        if(faltas >= 0 && faltas <= 30)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração das Variáveis
        double salB, salL;
        int faltas;
        boolean quantF;

        //Entrada de Dados
        System.out.print("Informe o valor do salario bruto R$");
        salB = sc.nextDouble();
        System.out.print("Informe a quantidade de faltas: ");
        faltas = sc.nextInt();
        sc.close();

        //Chamada da função
        quantF = verficaFaltas(faltas);

        //Verifica as faltas
        if(quantF == true)
        {
            salL = salarioLiquido(salB, faltas);
            System.out.println("\nO valor do salário liquido é de R$" + salL);
        }
        else
        {
            //Saída de dados
            System.out.println("\nNúmero de faltas não permitido!");
        }
    }
}
