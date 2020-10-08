/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê o pessos das pessoas até que a carga 
 *    máxima ou a quantidade de pessoas seja ultrapasada.
 */

package pratica_04;

import java.util.Scanner;

public class Problema_24 
{
    public static void main(String[] args) 
    {
        Scanner sc= new Scanner(System.in);
        
        //Declaração das variáveis
        double cargaMax, peso, cargaT=0;
        int quantI=1, quantM;
        
        //Entrada de Dados
        System.out.print("Informe a carga máxima suportada[kg]: ");
        cargaMax = sc.nextDouble();
        System.out.print("Informe a quantidade máxima de pessoas suportadas: ");
        quantM = sc.nextInt();
        sc.close();
        
        System.out.println("");
        
        /*
        Repete até o peso ou até a quantidade de pessoas
        seja ultrapassada   
        */
        do
        {
            //Recebe o peso
            System.out.print("Informe o seu peso [kg]: ");
            peso = sc.nextDouble();
            cargaT = cargaT + peso; 
            quantI++;
            
            //Verifica a carga
            if(cargaT > cargaMax)
            {
                break;
            }
            //Verifica a quantidade
            else if(quantI > quantM)
            {
                break;
            }
        }
        while(cargaT <= cargaMax || quantI <= quantM);
        
        System.out.println("\n");
    }
}
