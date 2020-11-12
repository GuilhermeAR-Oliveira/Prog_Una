/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Separação de palavras
 */

package pratica_07;

import java.util.Scanner;
import java.util.StringTokenizer;


public class Problema_08 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        StringTokenizer separador;

        //Declaração da variável
        String frase;

        //Entrada de Dados
        System.out.print("Digite uma frase: ");
        frase = sc.nextLine();
        sc.close();

        separador = new StringTokenizer(frase);
        
        //Separa cada palavra por linha
        while(separador.hasMoreTokens()) 
        {
            //Exibi cada palavra
            System.out.println(separador.nextToken());
        }
        
    }
}
