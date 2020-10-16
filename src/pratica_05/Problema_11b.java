/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Lê um numero inteiro relativo ao dia semana
 *    e exibi um texto com o dia da semana. (Com vetor)
 */

package pratica_05;

import java.util.Scanner;

public class Problema_11b 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração do vetor
        String nomeS[] = {"Domingo", "Segunda-Feira", "Terça-Feira", "Quarta-Feira", 
        "Quinta-Feira", "Sexta-Feira", "Sábado"};
        int dia; 
        
        //Entrada de Dados
        System.out.print("Digite o número correspondente ao dia da semana [1 para domingo, 7 para sábado]: ");
        dia = sc.nextInt();
        sc.close();
        
        System.out.println("");
        
        //Verifica o dia da semana
        if(dia >= 1 && dia <= 7)
        {
            //Exibi o dia da semana
            System.out.println(nomeS[dia -1]);
        }
        else
        {
            System.out.println("Sia da semana inválido");
        }
        System.out.println("\n");
    }
}
