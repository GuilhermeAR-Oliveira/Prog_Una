/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Cálculo da área de um triângulo 
 */

package pratica_02;

import java.util.Scanner;

public class Problema_01 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        // Declaração das Variáveis
        int base, altura, area;
        
        //Entrada de Dados
        System.out.print("Informe a base do triângulo: ");
        base = sc.nextInt();
        System.out.print("Informe a altura do triângulo: ");
        altura = sc.nextInt();
        System.out.println("");

        sc.close();
        
        // Calculo da area
        area = (base * altura) / 2;
        
        //Saída dos resultados
        System.out.println("O triângulo de base " + base + " e altura " + altura);
        System.out.println("Possui uma area de " + area);
        System.out.println("\n");
        
    }
}
