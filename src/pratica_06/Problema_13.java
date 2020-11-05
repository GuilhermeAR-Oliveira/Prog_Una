/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Construa um programa que calcula a
 *   area de um triangulo e retorna o valor da area. 
 */

package pratica_06;

import java.util.Scanner;

public class Problema_13 
{
    //Função que retorna a area do triângulo
    public static int areaTriangulo(int base, int altura)
    {
        return base * altura / 2;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        //Declaração das Variáveis
        int base, altura, areaT;    

        //Entrada de Dados
        System.out.print("Informe a base do triângulo: ");
        base = sc.nextInt();
        System.out.print("Informe a altura do triângulo: ");
        altura = sc.nextInt();
        sc.close();

        //Chamada da função
        areaT = areaTriangulo(base, altura);

        //Saída de Dados
        System.out.println("\nA area do triângulo é " + areaT);
    }
}
