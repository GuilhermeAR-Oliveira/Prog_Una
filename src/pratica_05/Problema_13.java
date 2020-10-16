/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Imprimi o nome dos professores e os dias
 *	 nos quais eles lencionam de acordo com que foi 
 *	 armazenado ema uma matriz boleana.	
 */

package pratica_05;

public class Problema_13 
{
    public static void main(String[] args) 
    {
        //Declaração dos vetores
        String[] diasSemana = {"Segunda-Feira", "Terça-Feira", "Quarta-Feira", "Quinta-Feira", "Sexta-Feira"};
        String[] professores = {"Jailson Mota", "Renata Lima", "Carlos Ribeiro", "Amanda Ceni"};
        
        //Declaração da matriz
        boolean[][] diasLecionados = {
            {true, false, true, false, false},
            {false, true, false, true, false},
            {true, false, false, false, false},
            {false, true, false, true, true}
        };
        
        //percorre o vetor com os professores
        for(int i = 0; i < professores.length; i++)
        {
            System.out.print("\n" + professores[i] + ": ");
            
            //percorre a matriz
            for(int j = 0; j < diasLecionados[i].length; j++)
            {
                //verifica o dia que o professor leciona
                if(diasLecionados[i][j])
                {
                    System.out.print(diasSemana[j] + " ");
                    
                }
            }
        }
        System.out.println("\n");
    }
}
