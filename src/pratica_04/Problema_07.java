/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê N números inteiros e exibi tanto a 
 *   quantidade quanto a soma dos números ímpares digitados.
 */
package pratica_04;

import java.util.Scanner;

public class Problema_07 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        int num, soma=0, quant, i=1, impar=0;
        
        //Entrada de Dados
        System.out.print("Quantos números deseja informar: ");
        quant = sc.nextInt();
        sc.close();
        
        //Laço de iteração
        while(i <= quant)
        {
            System.out.print("[" + i + "] Digite um valor inteiro: ");
            num = sc.nextInt();
            
            //Verifica, soma e conta os ímpares
            if(num % 2 != 0)
            {
                soma = soma + num;
                impar++;
            }
            i++; 
        }
        
        System.out.println("");
        
        //Saída dos Resultados
        System.out.println("Números ímpares digitados: " + impar);
        System.out.println("Valor da soma dos números ímpares informados: " + soma);
        System.out.println("\n");
    }
}
