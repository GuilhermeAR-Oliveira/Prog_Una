/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Procura uma cadeia de string x no vetor v e 
 *   retorna a sua posição. Caso x não seja encontrado, retorna -1.
 */

package pratica_06;

import java.util.Scanner;

public class Problema_11 
{
    //Função para buscar string no vetor
    public static int buscarVet(String[] v, String s)
    {
        for (int i = 0; i < v.length; i++) 
        {
            if (v[i].equals(s))
            {
                return i;
            }
                
        }
        return -1;
    }
    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in); 

        //Declaração do Vetor
        String[] vet = {"César","João","Fernando","Zilton"};
        String cadeia;

        //Entrada de Dados
        System.out.println("Informe a palavra a ser buscada: ");
        cadeia = sc.next();
        sc.close();
        
        //Chamada da função e saída de dados
        int pos = buscarVet(vet, cadeia);
        System.out.println(pos);
    }
}
