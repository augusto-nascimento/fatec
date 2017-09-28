/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-10
    Objetivo: Receba dois valores inteiros, mostre seus valores em ordem crescente.
*/
import javax.swing.JOptionPane;
public class Lt01Ex22 {
    public static void main (String args[]) {
        int a, b, x;
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número inteiro: "));
        if (a>b) {
            x = a;
            a = b;
            b = x;
        }
        System.out.format("Em ordem crescente %d e %d%n", a, b);
    }
}