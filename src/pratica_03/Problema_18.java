/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê um numero ente 1 e 12, e retorna o 
 *  mês e a estação do ano correspondentes.     
 */

package pratica_03;

import java.util.Scanner;

public class Problema_18 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
                
        //Declaração das Variáveis
        int num;
        
        //Entrada de Dados
        System.out.print("Informe um número entre 1 e 12: ");
        num = sc.nextInt();
        sc.close();

        System.out.println("");
        
        //Verifica o mês e a estação
        if(num == 1)
        {
            System.out.println("Mês: Janeiro - Estação: Verão");
        }
        else if(num == 2)
        {
            System.out.println("Mês: Fevereiro - Estação: Verão");
        }
        else if(num == 3)
        {
            System.out.println("Mês: Março - Estação: Verão");
        }
        else if(num == 4)
        {
            System.out.println("Mês: Abril - Estação: Outono");
        }
        else if(num == 5)
        {
            System.out.println("Mês: Maio - Estação - Outono");
        }
        else if(num == 6)
        {
            System.out.println("Mês: Junho - Estação: Outono");
        }
        else if(num == 7)
        {
            System.out.println("Mês: Julho - Estação: Inverno");
        }
        else if(num == 8)
        {
            System.out.println("Mês: Agosto - Estação: Inverno");
        }
        else if(num == 9)
        {
            System.out.println("Mês: Setembro - Estação: Inverno");
        }
        else if(num == 10)
        {
            System.out.println("Mês: Outubro - Estação: Primavera");
        }
        else if(num == 11)
        {
            System.out.println("Mês: Novembro - Estação: Primavera");
        }
        else if(num == 12)
        {
            System.out.println("Mês: Dezembro - Estação: Verão");
        }
        System.out.println("\n");
    }
}
