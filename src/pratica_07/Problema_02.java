/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Escrita sequencial
 */

package pratica_07;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Problema_02 
{
    public static void main(String[] args)
    {
        try
        {
            int linha=1;

            //Informa o nome do arquivo
            File arquivo = new File("/home/guilherme/Desktop/Exercicio02.txt");

            //Escreve no arquivo até o valor ser menor ou igual a 100 
            while(linha <= 100)
            {
                
                //Verifica se o arquivo existe
                if(arquivo.exists() == true)
                {
                    //Cria o arquivo
                    arquivo.createNewFile();
                }

                //Abre o arquivo para escrita
                FileWriter fW = new FileWriter(arquivo, true);
                //Escreve no arquivo
                BufferedWriter bW = new BufferedWriter(fW);

                //Escreve no arquivo
                bW.append("Texto " + linha); 
                //quebra de linha
                bW.newLine(); 

                //Fecha o arquivo
                bW.close(); 
                fW.close();

                linha++;
            }
        }
        catch(Exception ex)
        {
            
        }
    }
}
