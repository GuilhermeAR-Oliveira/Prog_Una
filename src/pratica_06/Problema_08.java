/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Crie um programa contendo um método 
 *   que recebe uma matriz de números reais e retorne 
 *   VERDADEIRO caso a matriz seja uma matriz identidade, 
 *   e FALSO caso contrário.
 */

package pratica_06;

public class Problema_08 
{
    //Função para retornar a matriz
    public static boolean matrizIdentidade(double[][] m)
    {
        int numeroDeLinhas = m.length;
        for (int i = 0; i < m.length; i++) 
        {
            if (m[i].length != numeroDeLinhas)
            {
                return false;
            }
                
            for (int j = 0; j < m[i].length; j++) 
            {
                if (i == j) 
                {
                    if(m[i][j] != 1) 
                    {
                        return false;
                    }
                }
                else
                {
                    if(m[i][j] != 0) 
                    {
                        return false;
                    }
                }
            }
        }
        return true;
    } 

    public static void main(String[] args)
    {
        //Declaração da matriz
        double mat[][] = {{1,0,0},{0,1,0},{0,0,1}};

        //Saída de Dados e chamada da função
        System.out.println(matrizIdentidade(mat));
    }
}
