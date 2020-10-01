/* Nome: Guilherme Augusto R. Oliveira
 * Disciplina: Programação de Computadores
 * Programa: Conversão de km/h para m/s
 */

package pratica_02;

import java.util.Scanner;

public class Problema_04 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Decalração da variável
        double vel, valor;

        // Entrada de Dados
        System.out.print("Informe a velocidade do carro em kh/h: ");
        vel = sc.nextDouble();
        sc.close();

        // Conversão da velocidade
        valor = vel / 3.6;

        // Saída dos Resultados
        System.out.println("A velocidade do carro em m/s é: " + valor);
        System.out.println("\n");

    }
}
