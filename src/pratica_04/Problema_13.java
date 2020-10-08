/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê 10 números e imprimi a quantidade
 *   de números maiores ou iguais a 5 e menor que 20  
 */
package pratica_04;

import java.util.Scanner;

public class Problema_13 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das variáveis
        int num, quant5=0, quant20=0;

        // Realiza a contagem até o decimo número
        for(int i = 1; i <= 10; i++)
        {
            //Entrada de Dados
            System.out.print("Informe um valor: ");
            num = sc.nextInt();
            sc.close();
            
            if(num >= 5)
            {
                quant5++;
            }
            else if(num <= 20)
            {
                quant20++;
            }
        }
        
        //Saídados Resultados
        System.out.println("\nQuantidade de numeros maiores ou iguais a cinco: " + quant5);
        System.out.println("Quantidade de numeros menores ou iguais a vinte: " + quant20);
        System.out.println("Total: " + (quant5 + quant20));
        
        System.out.println("\n\n");
    }
}
