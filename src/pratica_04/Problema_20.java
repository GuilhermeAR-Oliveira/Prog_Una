/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Retorne a serie de Fibonacci até
 *    o valor digitado.
 */

package pratica_04;

import java.util.Scanner;

public class Problema_20 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração de Variáveis
        int n1, n2, n3, num;
        
        n1 = 0;
        n2 = 1;
        
        //Entrada de Dados
        System.out.print("Dgite um valor: ");
        num = sc.nextInt();
        sc.close();
        
        System.out.print("\n" + n1 + " " + n2);
        n3 = n1 + n2;
        
        //Faz a contagem até o valor informado
        while(n3 <= num)
        {
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
            n3 = n1 + n2;
            
        }
        
        System.out.println("\n");
    }
}
