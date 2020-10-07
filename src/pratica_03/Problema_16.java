/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Lê valor das vendas de três corretores 
    e exiba o nome, o valor da venda e a comissao de cada um.
 */

package pratica_03;

import java.util.Scanner;

public class Problema_16 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        double venda1, venda2, venda3, comissao, total;
        
        //Entrada de Dados
        System.out.print("Informe o valor da venda de João: R$");
        venda1 = sc.nextDouble();
        System.out.print("Informe o valor da venda de Fernado: R$");
        venda2 = sc.nextDouble();
        System.out.print("Informe o valor da venda de Márcio: R$");
        venda3 = sc.nextDouble();
        sc.close();
        
        System.out.println("");
        
        System.out.println("====== Relatório de Vendas ======");
        //Verifica o valor da comissão
        //João
        if(venda1 > 50.000)
        {
            comissao = (venda1 * 12) / 100;
            System.out.println("Corretor: João");
            System.out.println("Valor da venda: R$" + venda1);
            System.out.println("Valor da comissão: R$" + comissao);
            System.out.println("--------------------------------");
        }
        else if(venda1 >= 30.00 & venda1 <= 50.000)
        {
            comissao = (venda1 * 9.5) / 100;
            System.out.println("Corretor: João");
            System.out.println("Valor da venda: R$" + venda1);
            System.out.println("Valor da comissão: R$" + comissao);
            System.out.println("--------------------------------");
        }
        else
        {
            comissao = (venda1 * 7) / 100;
            System.out.println("Corretor: João");
            System.out.println("Valor da venda: R$" + venda1);
            System.out.println("Valor da comissão: R$" + comissao);
            System.out.println("--------------------------------");
        }
        
        //Fernando
        if(venda2 > 50.000)
        {
            comissao = (venda2 * 12) / 100;
            System.out.println("Corretor: Fernando");
            System.out.println("Valor ds venda: R$" + venda2);
            System.out.println("Valor da comissão: R$" + comissao);
            System.out.println("--------------------------------");
        }
        else if(venda1 >= 30.00 & venda1 <= 50.000)
        {
            comissao = (venda2 * 9.5) / 100;
            System.out.println("Corretor: Fernando");
            System.out.println("Valor ds venda: R$" + venda2);
            System.out.println("Valor da comissão: R$" + comissao);
            System.out.println("--------------------------------");
        }
        else
        {
            comissao = (venda2 * 7) / 100;
            System.out.println("Corretor: Fernando");
            System.out.println("Valor ds venda: R$" + venda2);
            System.out.println("Valor da comissão: R$" + comissao);
            System.out.println("--------------------------------");
        }
        
        //Márcio
        if(venda3 > 50.000)
        {
            comissao = (venda3 * 12) / 100;
            System.out.println("Corretor: Márcio");
            System.out.println("Valor ds venda: R$" + venda3);
            System.out.println("Valor da comissão: R$" + comissao);
            System.out.println("--------------------------------");
        }
        else if(venda1 >= 30.00 & venda1 <= 50.000)
        {
            comissao = (venda3 * 9.5) / 100;
            System.out.println("Corretor: Márcio");
            System.out.println("Valor ds venda: R$" + venda3);
            System.out.println("Valor da comissão: R$" + comissao);
            System.out.println("--------------------------------");
        }
        else 
        {
            comissao = (venda3 * 7) / 100;
            System.out.println("Corretor: Márcio");
            System.out.println("Valor ds venda: R$" + venda3);
            System.out.println("Valor da comissão: R$" + comissao);
            System.out.println("--------------------------------");
        }
        
        // Caulcula e exibi o total das vendas
        total = venda1 + venda2 + venda3;
        System.out.println("Total de vendas: R$" + total);
        System.out.print("=================================");
        System.out.println("\n");
    }
}
