/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Exibi o salario, o cargo de um funcionario,
    o valor do aumento e seu novo salário.
 */
package pratica_03;

import java.util.Scanner;

public class Problema_12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        int cod;
        double salario, aumento, novoSalario;
        
        //Entrada de Dados
        System.out.print("Informe o seu código: ");
        cod = sc.nextInt();
        System.out.print("Informe o seu salário: R$");
        salario = sc.nextDouble();
        sc.close();
        
        System.out.println("");
        
        //Seleciona o cargo
        switch(cod)
        {
            case 1: 
                aumento = (salario * 50) / 100;
                novoSalario = salario + aumento;
                System.out.println("Cargo: Escrituário");
                System.out.println("Teve um aumento de 50% no valor de R$" + aumento);
                System.out.println("Novo salário: R$" + novoSalario);
            break;
            
            case 2:
                aumento = (salario * 35) / 100;
                novoSalario = salario + aumento;
                System.out.println("Cargo: Secretário");
                System.out.println("Teve um aumento de 35% no valor de R$" + aumento);
                System.out.println("Novo salário: R$" + novoSalario);
            break;
            
            case 3:
                aumento = (salario * 20) / 100;
                novoSalario = salario + aumento;
                System.out.println("Cargo: Caixa");
                System.out.println("Teve um aumento de 20% no valor de R$" + aumento);
                System.out.println("Novo salário: R$" + novoSalario);
            break;
            
            case 4:
                aumento = (salario * 10) / 100;
                novoSalario = salario + aumento;
                System.out.println("Cargo: Gerente");
                System.out.println("Teve um aumento de 10% no valor de R$" + aumento);
                System.out.println("Novo salário: R$" + novoSalario);
            break;
                
            case 5:
                System.out.println("Cargo: Diretor");
                System.out.println("Não tem aumento");
            break;
                
            default:
                System.out.println("Código Inválido");
            break; 
        }
        System.out.println("\n");
    }
}
