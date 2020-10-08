/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê um número inteiro até que o valor seja
 *   igual a -1, retorna a quantidade valores informados
 *   e valores iguais a 5.   
 */

package pratica_04;

import java.util.Scanner;

public class Problema_18 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração de variáveis
        int num, quantN=0, quantN5=0;
        
        do
        {
            System.out.print("Digite um número inteiro: ");
            num = sc.nextInt();
            sc.close();
            
            if(num != -1)
            {
                quantN++;
                
                if(num == 5)
                {
                    quantN5++;
                }
            }
            
        }
        while (num != -1);
        
        System.out.println("\nvalores 5: " + quantN5);
        System.out.println("Valores: " + quantN);
        System.out.println("\n");
    }
}
