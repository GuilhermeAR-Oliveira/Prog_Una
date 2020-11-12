/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Leitura senquencial
 */

package pratica_07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class Problema_07 
{
    public static void main(String[] args)
    {
         //Informe o path com o nome do arquivo
        File arq = new File("/home/guilherme/Desktop/Exercicio02.txt");

        try
        {
            String linha;

            //Verifica se  o arquivo exite
            if(arq.exists() == true)
            {

                //Abre o arquivo para leitura
                FileReader fR = new FileReader(arq);
                BufferedReader bR = new BufferedReader(fR);

                while(bR.ready())
                {
                    //Lê cada linha do arquivo
                    linha = bR.readLine();
                    System.out.println(linha);
                }

                //Fecha o arquivo
                bR.close();
            }
        }
        catch (Exception ex)
        {

        }
    }
}
