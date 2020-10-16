/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Armazenar em um vetor os nomes dos alunos
 *   e exibir uma lista com os nomes deles.
 */

package pratica_05;

public class Problema_03 
{
    public static void main(String[] args) 
    {
        // Decalração do vetor
        String[] nomes = {"Ana Clara Silva", "Fernando Campolina", "João Carlos Barbosa", "Letícia Marques", 
        "Márcio Medeiros", "Nelson Rodrigues", "Paulo Araújo", "Renato Rios", "William José Guimarães"};
        
        //
        System.out.println("Listagem dos alunos: ");
        System.out.println("---------------------");
        
        // Lê as posições do vetor e retorna o nome dos alunos
        for(int i = 0; i <= 8; i++)
        {
            System.out.println((i + 1) + "   " + nomes[i]);
        }
        System.out.println("---------------------");
    }
}
