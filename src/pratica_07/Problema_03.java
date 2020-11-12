/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Escrita com entrada de dados
 */

package pratica_07;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Problema_03 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        try
        {
            //Declaração das variáveis
            String nome, sobrenome, dados;
            int idade, cont;
            StringTokenizer separator;

            //Informe o path com o nome do arquivo
            File arq = new File("/home/guilherme/Desktop/Exercicio03.txt");

            //Verifica se  o arquivo exite
            if(arq.exists() == true)
            {
                //Cria o arquivo
                arq.createNewFile();
            }

            //Entrada de dados
            System.out.print("Digite o seu nome: ");
            nome = sc.nextLine();
            System.out.print("Digite o seu sobrenome: ");
            sobrenome = sc.nextLine();
            System.out.print("Digite a sua idade: ");
            idade = sc.nextInt();
            sc.close();

            //Abre o arquivo para escrita
            FileWriter writer = new FileWriter(arq, true);
            //Escreve no arquivo
            BufferedWriter bw = new BufferedWriter(writer);

            //Separa a string
            separator = new StringTokenizer(nome + ";" + sobrenome + ";" + idade + ";"); 

            cont = separator.countTokens();
            for(int i = 0; i < cont; i++)
            {
                dados = separator.nextToken();
                bw.append(dados); //Escreve no final do arquivo
            }
            
            //Fecha o arquivo
            bw.close();
            writer.close();

        }
        catch(Exception ex)
        {

        }
    }
}
