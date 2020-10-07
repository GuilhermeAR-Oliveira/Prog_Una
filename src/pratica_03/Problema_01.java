/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Exibir o maior entre dois números inteiros
 */

package pratica_03;

import java.util.Scanner; 

public class Problema_01 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das variaveis
        int num1, num2;
        
        System.out.print("Digite um número inteiro: ");
        num1 = sc.nextInt();
        System.out.print("Digite um outro número inteiro: ");
        num2 = sc.nextInt();
        System.out.println("");

        sc.close();
        
        //Teste do maior número e saída dos resultados
        if(num1 > num2)
        {
            System.out.print("O número " + num1 + " é o maior");
        }
        else
        {
            System.out.print("O número " + num2 + " é o maior");
        }
        System.out.println("\n");
    }
}
