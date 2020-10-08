/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê um número e retorna se ele é primo
 *    ou não.
 */

package pratica_04;

import java.util.Scanner;

public class Problema_19 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das variáveis
        int num;
        boolean primo = true;
        
        //Entrada de Dados
        System.out.print("Informe um nuḿero inteiro: ");
        num = sc.nextInt();
        sc.close();
        
        //Verifica o número digitado
        if(num == 1)
        {
            primo = false;
        } 
        for(int i = 2; i <= num; i++)
        {
            //Verifica se o número é primo
            if(num % i == 0)
            {
                primo = false;
                break;
            }
        }
        if(primo)
        {
            System.out.println("\nO número " + num + " é um número primo");
        }
        else
        {
            System.out.println("\nO número " + num + " não é um número primo");
        }
        
        System.out.println("\n");
    }       
    
}
