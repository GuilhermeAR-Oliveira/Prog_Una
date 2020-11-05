/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Crie um metodo para calcular a media
 *   de dois valores e um outro que calcula a media de 
 *   de três valores e retorne esses valores.
 */

package pratica_06;

import java.util.Scanner;

public class Problema_02 
{
    //Função para calcular a média
    public static double calcularMedia(double n1, double n2)
    {
        return (n1 + n2) / 2;
    }

    //Função para calcular a média
    public static double calcularMedia(double n1, double n2, double n3)
    {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        double num1, num2, num3, media2, media3;

        //Entrada de Dados
        System.out.print("Informe um valor: ");
        num1 = sc.nextDouble();
        System.out.print("Informe um segundo valor: ");
        num2 = sc.nextDouble();
        System.out.print("Informe um terceiro valor: ");
        num3 = sc.nextDouble();
        sc.close();

        //Chamada da função
        media2 = calcularMedia(num1, num2); 
        media3 = calcularMedia(num1, num2, num3);
        /*
            sobrecarga de método: dois métodos possuem o mesmo nome, 
            porém os seus parâmetros são diferentes
        */

        //Saída de Dados
        System.out.println("A média dos dois valores é: " + media2);
        System.out.println("A média dos três valores é: " + media3);
		System.out.println("\n");
    }
}
