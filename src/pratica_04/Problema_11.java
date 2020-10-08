/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê n numeros inteiros e exibi a quantidade 
 *   e o produto dos números informados
 */
package pratica_04;

import java.util.Scanner;

public class Problema_11 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das variáveis
        int num, quant, i=1, produto = 1;
        
        //Entrada de dados
        System.out.print("Quantos números deseja informar: ");
        quant = sc.nextInt();
        sc.close();
        
        //Repete até o quantidade informada
        while(i <= quant)
        {
            System.out.print("Informe um valor: ");
            num = sc.nextInt();  
            
            //Verifica os valores pares
            if(num % 2 == 0)
            {
                produto = produto * num;
            }
            i++;
            
        }
        
        //Saída dos Resultados
        System.out.println("");
        System.out.println("Foram informados o total de " + quant + " números inteiros");
        System.out.println("O produto dos números pares informados é: " + produto);
        
        System.out.println("\n");
    }
}
