/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê 10 numeros reais e retorne o maior e o menor
 */

package pratica_04;

import java.util.Scanner;

public class Problema_15 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        double num, maior=0, menor=0;
        
        //Repete até o decimo valor
        for(int i = 1; i <= 5; i++)
        {
            //Entrada de Dados
            System.out.print("Informe um número real: ");
            num = sc.nextDouble();
            sc.close();
            
            //Verifica o primeiro valor
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
        
        //Retorna o maior e menor valor
        System.out.println("\nO maior valor é: " + maior);
        System.out.println("O maior valor é: " + menor);
        
        System.out.println("\n");
    }
}
