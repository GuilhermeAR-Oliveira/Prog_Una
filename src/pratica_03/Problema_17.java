/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Calcula o valor total da hospedagem de um cliente
 */

package pratica_03;

import java.util.Scanner;

public class Problema_17 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        String nome;
        int diaria;
        double taxaS, totalConta;
        
        //Entrada de Dados
        System.out.print("Informe o seu nome: ");
        nome = sc.nextLine();
        System.out.print("Digite o número de diárias no hotel: ");
        diaria = sc.nextInt();
        sc.close();
        
        System.out.println("");
        
        //Verifica a taxa de serviço
        if(diaria > 4)
        {
            taxaS = diaria * 5.00;
        }
        else if(diaria == 4)
        {
            taxaS = diaria * 7.50;
        }
        else
        {
            taxaS = diaria * 10.0;
        }
        
        //Calcula o total da hospeagem
        totalConta = (150.0 * diaria) + taxaS;
        
        //Saída dos Resultados
        System.out.println("O valor da hospedagem do ciente " + nome + " é de R$" + totalConta);
        System.out.println("\n");
        
    }
}
