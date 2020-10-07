/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Recebe o salário de um fucnionário, calcula 
    o reajuste e exibi o novo salário.
 */

package pratica_03;

import java.util.Scanner;

public class Problema_10 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração de Variáveis
        double salario, novoSalario, aumento;
        
        //Entrada de Dados
        System.out.print("Informe o seu salário: R$");
        salario = sc.nextDouble();
        sc.close();
        
        System.out.println("");
        
        //Verifica o salário
        if(salario < 700.0)
        {
            aumento = (salario * 30) / 100;
            novoSalario = salario + aumento;
            System.out.println("Você teve um aumento de 30%.\n" + "Seu novo salário é de R$" + novoSalario);
        }
        else if(salario >= 700.0)
        {
            aumento = (salario * 31) / 100;
            novoSalario = salario + aumento;
            System.out.println("Você teve um aumento de 10%.\n" + "Seu novo salário é de R$" + novoSalario);
        }
        System.out.println("\n");
    }
}
