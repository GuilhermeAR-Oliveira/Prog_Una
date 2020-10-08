/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Imprimi números pares de 1 a 100
 */

package pratica_04;

public class Problema_01 
{
    public static void main(String[] args) 
    {
        //Declaração das Variáveis
        int num = 1;
        
        while(num <= 100)
        {
            if(num % 2 == 0)
            {
                System.out.print(num + " ");
            }
            num++;
        }
        System.out.println("\n");
    }    
}
