/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê um numero e para a repetição quando
 *    o valor for menor que 0. 
 */
package pratica_04;

import java.util.Scanner;

public class Problema_10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Decalração das Variáveis
        int num, i=1, quant;
        
        //Entrada de Dados
        System.out.print("Quantos valores deseja inserir: ");
        quant = sc.nextInt();
        sc.close();
        System.out.println("");
        
        //Laço de iteração
        while(i <= quant)
        {
            i++;
            
            System.out.print("Digite um valor: ");
            num = sc.nextInt();
            
            //Verifica o valor do número
            if(num >= 0)
            {
                continue;
            }
            if(num < 0)
            {
                break;
            }
        }
        
        System.out.println("\n");
    }
}
