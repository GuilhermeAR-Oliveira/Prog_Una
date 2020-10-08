/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê 100 numeros inteiros e exiba a soma dos mesmos.
 */

package pratica_04;

import java.util.Scanner;

public class Problema_06 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        int num, soma = 0, i=1;
        
        //Lê e soma 100 valores inteiros
        do
        {
            System.out.print("[" + i + "] Digite um valor inteiro: ");
            num = sc.nextInt();
            sc.close();

            i++;
            soma = soma + num;
        }
        while(i <= 100);
        
        //Saída dos Resultados
        System.out.println("");
        System.out.println("A soma dos números é: " + soma);
        System.out.println("\n");
    }
}
