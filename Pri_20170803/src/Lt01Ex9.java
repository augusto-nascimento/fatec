/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Receba os 2 números inteiros. Calcule e mostre a soma dos quadrados.
*/
import javax.swing.JOptionPane;
public class Lt01Ex9 {
    public static void main (String args[]) {
        int a, b;
        double x;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        x = Math.pow(a,2) + Math.pow(b,2);
        System.out.format("A soma dos quadrados de %d e %d é igual à %.0f%n ", a, b, x);
    }
}