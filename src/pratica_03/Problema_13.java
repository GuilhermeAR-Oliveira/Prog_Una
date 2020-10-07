/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Recebe a idade do nadador e retorna a categoria.
 */

package pratica_03;

import java.util.Scanner;

public class Problema_13 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        int idade;
        
        //Entrada de Dados
        System.out.print("Digite a sua idade: ");
        idade = sc.nextInt();
        sc.close();
        
        System.out.println("");
        
        //Verifica a idade
        if(idade >= 5 & idade <= 7)
        {
            System.out.println("Categoria: Infantil");
        }
        else if(idade >= 8 & idade <= 10)
        {
            System.out.println("Categoria: Juvenil");
        }
        else if(idade >= 11 & idade <= 15)
        {
            System.out.println("Categoria: Adolescente");
        }
        else if(idade >= 16 & idade <= 30)
        {
            System.out.println("Categoria: Adulto");
        }
        else if(idade > 30)
        {
            System.out.println("Categoria: Sênior");
        }
        else
        {
            System.out.println("Idade inválida");
        }
        System.out.println("\n");
        
    }
}
