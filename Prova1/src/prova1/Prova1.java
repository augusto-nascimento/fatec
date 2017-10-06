/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prova1;

import javax.swing.JOptionPane;
import java.util.Random;

/**
 *
 * @author tecnico
 */

public class Prova1 {
    static int x=0;
    static void MenuPrincipal(){
        int opcao=0;
        int[] vetor;
        vetor = new int[300];
        while (opcao!=9) {
            opcao = Integer.parseInt(
                    JOptionPane.showInputDialog(
                    "--------------Menu principal ----------\n" +
                    "-- 1 - Carregar Vetor -----------------\n" +
                    "-- 2 - Mostrar Sequência Fibonacci ----\n" +
                    "-- 9 - Finaliza -----------------------\n" +
                    "-- Se diferente, imprimir n + (n-1) + (n-2) + ... + 1 \n\n" +
                    "-- Digite uma opção:"));
            switch(opcao){
                case 1:
                    vetor = CarregaVetor();
                    for (int obj: vetor){
                        System.out.print(obj + " ");
                    }
                    break;
                case 2:
                    for (int i=0; i<300;i++) {
                        x = vetor[i];
                        Fibonnaci();
                    }
                    break;
                case 9:
                    System.exit(0);
                default:
                    System.out.print(
                            "A somatoria de " + Integer.toString(opcao) + 
                            " é " + Integer.toString(Somatoria(opcao)) + "\n"
                    );
            }
        }
    }
    static int Somatoria(int n) {
        int soma = n;
        if (soma >1) {
            soma = soma + Somatoria(n-1);
        }
        else {
            soma = 1;
        }
        return soma;
    }
    static int[] CarregaVetor() {
        int[] vetor;
        int somaDivDois=0;
        int somaDivTres=0;
        vetor = new int[300];
        Random rand = new Random();
        for (int i=0; i<300; i++) {
            vetor[i] = rand.nextInt(100) + 1;
            if (vetor [i] % 2 == 0) {
                somaDivDois = somaDivDois + vetor[i];
            }
            if (vetor [i] % 3 == 0) {
                somaDivTres = somaDivTres + vetor[i];
            }            
        }
        System.out.println(
                "A soma dos números divisíveis por 2 é " + Integer.toString(somaDivDois) + "\n"
                );
        System.out.println(
                "A soma dos números divisíveis por 3 é " + Integer.toString(somaDivTres) + "\n"
                );
        return vetor;
    }
    static void Fibonnaci() {
        int a=1, b=0;
        while (a<=x){
            System.out.print(Integer.toString(a) + " ");
            a = a + b;
            b = a - b;
        }
        System.out.print("\n");
    }
    public static void main(String[] args) {
        MenuPrincipal();
    }
}