/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-31
    Objetivo: Receba dois números inteiros, verifique qual o maior entre eles. 
    Calcule e mostre o resultado da somatória dos valores ímpares entre eles.
*/

import javax.swing.JOptionPane;
public class Lt01Ex35 {
    public static void main(String args[]) {
        int a, b, somatorio=0;
        int[] lista;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        lista = ordenar(a, b);
        a = lista[0];
        b = lista[1];
        for (int i = a; i<=b; i++) {
            if (i % 2 != 0) {
                somatorio = somatorio + i;
            }
        }
        System.out.printf("A soma de todos os números ímpares entre %d e %d "
                            + " é %d\n", a,b,somatorio );
    }
    public static int[] ordenar(int a, int b) {
        int[] retorno;
        int x;
        retorno = new int[2];
        if (a>b) {
            x = b;
            b = a;
            a = x;
        }
        retorno[0] = a;
        retorno[1] = b;
        return retorno;
    }
}