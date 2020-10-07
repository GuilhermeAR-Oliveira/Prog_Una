/* Nome: Guilherme Augusto R. Oliveira
 * Disciplinas: Programação de Computadores
 * Programa: Recebe três notas de 0 a 10 e exibi a aprovação do aluno
 */

package pratica_03;

import java.util.Scanner;

public class Problema_08 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Declaração das Variáveis
        double nota1, nota2, nota3, notaFinal;

        // Entrada de Dados
        System.out.print("Informe a primeria nota: ");
        nota1 = sc.nextDouble();
        System.out.print("Informe a segunda nota: ");
        nota2 = sc.nextDouble();
        System.out.print("informa a terceira nota: ");
        nota3 = sc.nextDouble();
        sc.close();

        System.out.println("");

        // Calcula a média aritmética
        notaFinal = (nota1 + nota2 + nota3) / 3;

        // Verifica a nota
        if (notaFinal >= 0 & notaFinal <= 4) 
        {
            System.out.println("Reprovado");
        } 
        else if (notaFinal >= 4 & notaFinal <= 7) 
        {
            System.out.println("Exame");
        } 
        else if (notaFinal >= 7 & notaFinal <= 10) 
        {
            System.out.println("Aprovado");
        }
        System.out.println("\n");
    }
}
