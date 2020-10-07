/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Recebe o código e retorna a categoria dos 
 *  produtos de uma empresa.
 */

package pratica_03;

import java.util.Scanner;

public class Problema_15 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        int cod;
        
        //Entrada de Dados
        System.out.print("Informe o código do produto: ");
        cod = sc.nextInt();
        sc.close();
        
        System.out.println("");
        
        //Verifica o código
        if(cod == 1)
        {
            System.out.println("Alimento perecível");
        }
        else if(cod == 2 || cod == 3)
        {
            System.out.println("Alimento não-perecível");
        }
        else if(cod == 4 || cod == 5 || cod == 6)
        {
            System.out.println("Vestuário");
        }
        else if(cod == 7)
        {
            System.out.println("Higiene pessoal");
        }
        else if(cod >= 8 & cod <= 12)
        {
            System.out.println("Limpeza");
        }
        else
        {
            System.out.println("Inválido");
        }
        System.out.println("\n");
    }
}
