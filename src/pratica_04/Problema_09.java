/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê 10 números reais e imprimi quais 
 *   foram o maior e o menor.
 */

package pratica_04;

import java.util.Scanner;

public class Problema_09 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das variáveis
        double num, maior=0, menor=0;
        
        //Laço de Iteração
        for(int i = 1; i <= 10; i++)
        {
            //Entrada de Dados
            System.out.print("[" + i + "] Digite um número real: ");
            num = sc.nextDouble();
            sc.close();
            
            //Verifica qual é o maior e o menor
            if(i == 1)
            {
                maior = num;
                menor = num;
            }
            else
            {
                if(num < menor)
                {
                    menor = num;
                }
                if(num > maior)
                {
                    maior = num;
                }
            }
        }
        System.out.println("");
        
        //Saída dos Resultados
        System.out.println("O maior dos números reais foi: " + maior);
        System.out.println("O menor dos números reais foi: " + menor);
        System.out.println("\n");
            
    }
}
