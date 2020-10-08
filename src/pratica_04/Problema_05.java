/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Soma os números de 1 a 100 e imprimi o valor final
 */

package pratica_04;

public class Problema_05 
{
    public static void main(String[] args) 
    {
        //Decalração das variáveis
        int num = 1, soma=0;
        
        //Repete até o valor 100
        while(num <= 100)
        {
            num++;
            soma = soma + num;
        }
        
        //Saída dos Resultados
        System.out.println("A soma é: " + soma);
        System.out.println("\n");
    }
}
