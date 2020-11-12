/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Escrita simples em arquivo
 */

package pratica_07;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Problema_01 
{
    public static void main(String[] args)
    {
        try
        {
            //Informa o nome do arquivo
            File arquivo = new File("/home/guilherme/Desktop/Exercicio1.txt");

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
            bW.append("Primeiro texto escrito"); 

            //Quebra de linha
            bW.newLine();

            //Fecha o arquivo
            bW.close();
            fW.close();
        }
        catch(Exception ex)
        {
            
        }
    }
}
