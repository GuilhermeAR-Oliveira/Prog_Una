/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Exibi todos os números pares a partir de 
 *   0 até que encontre um múltiplo de 7.
 */

package pratica_04;

public class Problema_04 
{
    public static void main(String[] args) 
    {
        //Declaração das varáveis
        int num = 0;

        // Repete até o multiplo de 7
        do
        {
            //Exibi os pares
            if(num % 2 == 0)
            {
                System.out.print(num + " ");
            }
            num++;
        }
        while(num % 7 != 0);
        
        System.out.println("\n");
    }
}
