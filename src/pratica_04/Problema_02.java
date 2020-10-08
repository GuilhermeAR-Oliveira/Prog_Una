/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Imprimi números pares de 1 a 100 na ordem inversa
 */

package pratica_04;

public class Problema_02 
{
    public static void main(String[] args) 
    {
        
        //Declaração das Variáveis
        int num = 100;
        
        // Repetição
        while(num >= 1)
        {
            //Teste os pares
            if(num % 2 == 0)
            {
                System.out.print(num + " ");
            }
            num--;
        }
        System.out.println("\n");
    }
}
