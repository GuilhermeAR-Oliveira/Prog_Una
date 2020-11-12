/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Leitura Seletiva
 */

package pratica_07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

public class Problema_10 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            //Informa o nome do arquivo
            File arq = new File("/home/guilherme/Desktop/Exercicio06.txt");
            
            //Declaração de variáveis
            String linha, numConta;

            //Entrada de dados 
            System.out.print("Informe o número da conta: ");
            numConta = sc.next();
            sc.close();

            //Verifica se o arquivo existe
            if(arq.exists() == true)
            {
                //Abre o arquivo para leitura
                FileReader fR = new FileReader(arq);
                BufferedReader bR = new BufferedReader(fR);

                //Lê cada linha
                while(bR.ready())
                {
                    linha = bR.readLine();

                    //Verifica em cada linha se a conta existe 
                    if(linha.contains(numConta))
                    {
                        System.out.println(linha);
                    }
                }

                //Fecha o arquivo
                bR.close();
                fR.close();
            }
        }
        catch (Exception ex)
        {

        }
    }
}
