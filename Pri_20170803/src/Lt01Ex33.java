/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-31
    Objetivo: Receba um número N. Calcule e mostre a serie 
    1 + 1/2 + 1/3 + ... + 1/N
*/

import javax.swing.JOptionPane;
public class Lt01Ex33 {
    static int n;
    public static void main(String args[]) {
        int saida;
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        saida = somaSerie(n);
    }
    public static int somaSerie(int x) {
        int retorno;
        retorno = 1 / x;
        if (x>=1) {
            x = x + ();
        }
        System.out.printf("o valor de n é %d", x);
    }
}
