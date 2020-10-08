/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Imprimir os números 11, 21, 31 .. 101
 */

package pratica_04;

public class Problema_03 
{
    public static void main(String[] args) 
    {
        //Declaração das Variáveis
        int num = 11;
        
        while(num <= 101)
        {
            System.out.print(num + " ");
            
            num = num + 10;
        }
        System.out.println("\n");
    }
}
