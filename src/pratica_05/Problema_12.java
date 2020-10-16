/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplina: Programação de Computadores
 *  Programa: Lê uma lista de funcionários com seus
 *   respetivos salarios informados, calcula a media sarial
 *   e a quantidade de funcionarios que ganham acima da media.  
 *   No final exibe todos os resultados.
 */

package pratica_05;

import java.util.Scanner;

public class Problema_12 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das variáveis
        double soma=0, media;
        int numeroFunc, quantF=0;
        
        //Lê o número de funcionarios
        System.out.print("Digite o número de funcionários da empresa: ");
        numeroFunc = sc.nextInt();
        sc.close();
        
        //Declaração do vetor
        double[] salarios = new double[numeroFunc];
        
        for(int i = 0; i < numeroFunc; i++)
        {
            System.out.print("Informe o salário do funcionário " + (i + 1) + ": ");
            salarios[i] = sc.nextDouble();
        }
        
        //Calcula a média dos salarios
        for(double salario : salarios)
        {
            soma = soma + salario;
        }
        media = soma / numeroFunc;
        
        /* Outra forma de fazer o laço de repetição
        for(int i = 0; i < numeroFunc; i++)
        {
            soma = soma + salarios[i];
        }
        */
        
        //Calcula o número de funcionario que ganham acima da media
        for(double salario : salarios)
        {
            //Verifca os salarios
            if(salario > media)
            {
                quantF++;
            }
        }
        
        //Lê cada salário
        for(int i = 0; i < salarios.length; i++)
        {
            System.out.printf("R$%.2f\n", salarios[i]);
        }
        
        //Exibi os valores finais
        System.out.printf("A média salarial é R$%.2f\n",  media);
        System.out.println("Quantidade de funcionários que ganham acima da media: " + quantF);
        
    }
}
