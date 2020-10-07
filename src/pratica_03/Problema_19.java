/*  Nome: Guilherme Augusto R. Oliveira
 *  Disciplinas: Programação de Computadores
 *  Programa: Recebe um valor e calcula o valor da compra
 *  de acordo a forma de pagamento. 
 */

package pratica_03;

import java.util.Scanner;

public class Problema_19 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        //Declaração das Variáveis
        double valorC, totalC, desconto;
        int pagar;
        
        //Menu de opções
        System.out.println("=============== Formas de Pagamento ==============");
        System.out.println("[1] Compra a Vista - desconto de 10%");
        System.out.println("[2] Compra a Prazo 30 dias - desconto de 5%");
        System.out.println("[3] Compra a Vista 60 dias - mesmo preço");
        System.out.println("[4] Compra a Vista 90 dias - acréscimo de 5%");
        System.out.println("[5] Compra com cartão de débito - desconto de 8%");
        System.out.println("[6] Compra com cartão de crédito - desconto de 7%");
        System.out.println("===================================================");
        
        //Entrada de Dados
        System.out.print("Digite o valor da compra: ");
        valorC = sc.nextDouble();
        System.out.print("Escolha a forma de pagamento: ");
        pagar = sc.nextInt();
        sc.close();
        
        System.out.println("");
        
        //Seleciona a forma de pagamento
        switch(pagar)
        {
            case 1: 
                desconto = (valorC * 10) / 100;
                totalC = valorC - desconto;
                System.out.println("O valor da compra é de R$: " + totalC);
            break;
            
            case 2:
                desconto = (valorC * 5) / 100;
                totalC = valorC - desconto;
                System.out.println("O valor da compra é de R$: " + totalC);
            break;  
            
            case 3:
                totalC = valorC;
                System.out.println("O valor da compra é de R$: " + totalC);
            break;
            
            case 4:
                desconto = (valorC * 5) / 100;
                totalC = valorC + desconto;
                System.out.println("O valor da compra é de R$: " + totalC);
            break;    
            
            case 5:
                desconto = (valorC * 8) / 100;
                totalC = valorC - desconto;
                System.out.println("O valor da compra é de R$: " + totalC);
            break;
            
            case 6:
                desconto = (valorC * 7) / 100;
                totalC = valorC - desconto;
                System.out.println("O valor da compra é de R$: " + totalC);
            break;
        }
        
        System.out.println("\n");       
    }
}
