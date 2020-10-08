/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê 30 números inteiros e exibi quantidade 
 *   e a soma dos números divisíveis por 5.
 */
package pratica_04;

import java.util.Scanner;

public class Problema_08 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das variáveis
        int num, soma=0, i=1, quant=0;
        
        //Laço de Iteração
        while(i <= 5)
        {
            //Entrada de Dados
            System.out.print("[" + i + "] Informe um número inteiro: ");
            num = sc.nextInt();
            sc.close();
            i++;
            
            //Verifica, soma e conta os divisiveis por 5
            if(num % 5 == 0)
            {
                soma = soma + num;
                quant++;
            }
        }
        System.out.println("");
        
        //Saida dos Resultados
        System.out.println("A quantidade de números divisiveis por 5 é: " + quant);
        System.out.println("A soma dos números divisiveis por 5 é: " + soma);
        System.out.println("\n");
    }
}
