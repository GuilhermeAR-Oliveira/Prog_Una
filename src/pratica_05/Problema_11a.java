/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Lê um numero inteiro relativo ao dia semana
 *    e exibi um texto com o dia da semana. (Sem vetor)
 */

package pratica_05;

import java.util.Scanner;

public class Problema_11a 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração da Variável
        int nomeS;
        
        //Entrada de Dados
        System.out.print("Digite o número correspondente ao dia da semana [1 para domingo, 7 para sábado]: ");
        nomeS = sc.nextInt();
        sc.close();
        
        System.out.println("");
        
        switch(nomeS)
        {
            case 1: 
                System.out.println("Domingo");
            break;
            
            case 2:
                System.out.println("Segunda-Feira");
            break;
            
            case 3:
                System.out.println("Terça-Feira");
            break;
            
            case 4:
                System.out.println("Quarta-Feira");
            break;
            
            case 5:
                System.out.println("Quinta-Feira");
            break;
            
            case 6:
                System.out.println("Sexta-Feira");
            break;
            
            case 7:
                System.out.println("Sábado");
            break;
            
            default:
                System.out.println("Dia da semana inválido");
            break;    
        }
        
        System.out.println("\n");
    }
}
