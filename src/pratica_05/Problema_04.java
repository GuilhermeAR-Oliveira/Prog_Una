/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Armazenar em um vetor os nomes  e notas dos alunos
 *   e exibir uma lista com todos os dados.
 */

package pratica_05;

public class Problema_04 
{
    public static void main(String[] args) 
    {
        // Decalração do vetor
        String[] nomes = {"Ana Clara Silva", "Fernando Campolina", "João Carlos Barbosa", "Letícia Marques", 
        "Márcio Medeiros", "Nelson Rodrigues", "Paulo Araújo", "Renato Rios", "William José Guimarães"};
        
        double[] notas = {7.5, 10, 5.3, 8.2, 9, 9.5, 4.6, 7, 6.4};
        
        //
        System.out.println("Listagem dos alunos: ");
        System.out.println("-----------------------------------");
        
        // Lê as posições do vetor e retorna o nome dos alunos
        for(int i = 0; i <= 8; i++)
        {
            System.out.printf("%-3s %-25s %4s\n", (i + 1), nomes[i], notas[i]);
        }
        System.out.println("-----------------------------------");
        System.out.println("\n");
    }
}
