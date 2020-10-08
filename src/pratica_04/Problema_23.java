/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê um volume inicial e calcule o tempo necessário
 *    para que ultrapasse 1000 cm².
 */

package pratica_04;

import java.util.Scanner;

public class Problema_23 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        
        //Declaração das Variáveis
        int volumeI, tempo=0;
        
        //Entrada de Dados
        System.out.print("Digite o volume inicial em cm²: ");
        volumeI = sc.nextInt();
        sc.close();
        
        // Realiza a contagem do tempo 
        while(volumeI < 1000)
        {
            volumeI = volumeI * 2;
            tempo++;
        }
        
        //Retorna o valor do tempo 
        System.out.println("O tempo necessário para ultrapassar 1000cm² é " + tempo + " segundos");
        System.out.println("\n");
    }
}
