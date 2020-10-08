/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Lê os codigos dos candidatos e retorna os votos computados
 */

package pratica_04;

import java.util.Scanner;

public class Problema_22 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis 
        int cod, voto1=0, voto2=0, voto3=0, votoN=0;
        
        //Repete até que seja digitado 0
        do
        {
            System.out.print("Informe o codigo do seu candidato: ");
            cod = sc.nextInt();
            sc.close();
            
            //Verifica o codigo do candidato
            if(cod == 1)
            {
                voto1++;
            }
            else if(cod == 2)
            {
                voto2++;
            }
            else if(cod == 3)
            {
                voto3++;
            }
            else if(cod == 4)
            {
                votoN++;
            }       
        }
        while(cod != 0);
        
        //Votos retornados de cada candidato
        System.out.println("\nVotos do candidato 1: " + voto1);
        System.out.println("Votos do candidato 2: " + voto2);
        System.out.println("Votos do candidato 3: " + voto3);
        System.out.println("Votos nulos: " + votoN);
        
        System.out.println("\n");
    }
}
