/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Leitura por palavra
 */

package pratica_07;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;

public class Problema_09 
{
    public static void main(String[] args)
    {
        //Informe o path com o nome do arquivo
        File arq = new File("/home/guilherme/Desktop/Exercicio05.txt");

        try
        {
            //Declaração das variáveis
            String linha, texto;
            StringTokenizer separador;
            int cont;

            //Verifica se  o arquivo exite
            if(arq.exists() == true)
            {
                //Abre o arquivo para leitura
                FileReader fR = new FileReader(arq);
                BufferedReader bR = new BufferedReader(fR);

                //Lê cada linha do arquivo
                while(bR.ready())
                {
                    //Separa cada palavra
                    linha = bR.readLine();
                    separador = new StringTokenizer(linha, " - ");
                    cont = separador.countTokens();
                        
                    for(int i=0; i < cont; i++)
                    {
                        texto = separador.nextToken();
                        System.out.println(texto);
                    }
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
