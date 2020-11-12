/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Escrita com entrada de dados heterogêneos
 */

package pratica_07;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problema_05 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        conta c = new conta();

        try 
        {
            //Declaração das variáveis
            int cont;
            String dados;
            StringTokenizer separator;

            //Informe o path com o nome do arquivo
            File arq = new File("/home/guilherme/Desktop/Exercicio05.txt");

            //Verifica se  o arquivo exite
            if(arq.exists() == true)
            {
                //Cria o arquivo
                arq.createNewFile();
            }

            //Entrada de dados
            System.out.print("Informe o número da conta: ");
            c.numConta = sc.nextInt();
            System.out.print("Informe o número da agência: ");
            c.agencia = sc.nextInt();
            System.out.print("Informe o saldo da conta: ");
            c.saldo = sc.nextDouble();
            sc.close();

            //Abre o arquivo para escrita
            FileWriter writer = new FileWriter(arq, true);
            //Escreve no arquivo
            BufferedWriter bw = new BufferedWriter(writer);

            //Separa a string
            separator = new StringTokenizer(c.numConta + ";" + c.agencia + ";" + c.saldo); 

            cont = separator.countTokens();
            for(int j = 0; j < cont; j++)
            {
                dados = separator.nextToken();
                bw.append(dados); //Escreve no final do arquivo
                bw.newLine(); //quebra de linha
            }
            
            //Fecha o arquivo
            bw.close();
            writer.close();
        }
        catch (Exception e)
        {

        }
    }
}
