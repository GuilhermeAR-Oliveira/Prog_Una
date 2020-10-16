/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Preenche uma matriz 4x3 com valores já definidos
 *   e exiba o valor da soma dos elementos de cada linha
 */

package pratica_05;

public class Problema_10 
{
    public static void main(String[] args) 
    {
        //Declara a matriz com os valores
        int[][] m = {{0, 40, -20},{10, -10, 9},{20, -40, 10},{50, 100, 1}};
        
        //Percorre toda a matriz
        for(int i = 0; i < m.length; i++)
        {
            int soma = 0; //Zera o valor da soma ao final de cada laço
            
            for(int j = 0; j < m[i].length; j++)
            {
                //Soma os valores em cada coluna da matriz
                soma = soma + m[i][j];
            }
            System.out.println(soma);
        }
        
    }
}
