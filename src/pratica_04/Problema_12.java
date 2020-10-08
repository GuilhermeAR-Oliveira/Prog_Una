/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Imprimi os múltiplos negativos de 7, 
 *   superiores a -1000.
 */
package pratica_04;

public class Problema_12 
{
    public static void main(String[] args) 
    {
        //Declaração das variáveis
        int num=0;
        
        do
        {
            if(num % 7 == 0 & num < 0)
            {
                System.out.print(num + " ");
            }
            num--;
            
        }
        while(num > -1000);
        
        System.out.println("\n");
    }
}
