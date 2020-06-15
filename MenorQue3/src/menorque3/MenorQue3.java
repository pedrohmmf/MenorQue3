/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menorque3;

import java.util.Scanner;
/**
 *
 * @author pedro
 */
public class MenorQue3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
        System.out.println ("Digite um número:");
        int n = entrada.nextInt();
        
        if (n<=3)
            System.out.println(n);
        else if (n>3)
            System.out.println("Número inválido");
        else
            System.out.println("O que você digitou pelo amor de deus???");
                
        // TODO code application logic here
    }
    
}
