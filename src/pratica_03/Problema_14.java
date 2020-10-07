/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Recebe a idade e a altura do jogador de basquete 
    e defini a sua categoria.
 */

package pratica_03;

import java.util.Scanner;

public class Problema_14 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        int idade;
        double altura;
        
        //Entrada de Dados
        System.out.print("Informe a sua idade: ");
        idade = sc.nextInt();
        System.out.print("Informe a sua altura: ");
        altura = sc.nextDouble();
        sc.close();
        
        System.out.println("");
        
        //Verifica a idade e a altura
        if(idade >= 6 & idade <= 10 & altura >= 1.00)
        {
            System.out.println("Categoria: Infantil");
        }
        else if(idade >= 11 & idade <= 17 & altura >= 1.40)
        {
            System.out.println("Categoria: Júnior");
        }
        else if(idade >= 18 & idade <= 35 & altura >= 1.70)
        {
            System.out.println("Categoria: Profissional");
        }
        else if(idade > 35 & altura >= 1.60)
        {
            System.out.println("Categoria: Sênior");
        }
        else
        {
            System.out.println("Não apto");
        }
        System.out.println("\n");
    }    
}
