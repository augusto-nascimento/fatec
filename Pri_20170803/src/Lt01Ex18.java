/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-10
    Objetivo: Receba dois valores inteiros, calcule e mostre a diferença do maior pelo menor valor.
*/
import javax.swing.JOptionPane;
public class Lt01Ex18 {
    public static void main (String args[]) {
        int a, b, x;
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número inteiro: "));
        if (a<b) {
            x = a;
            a = b;
            b = x;
        }
        x = a - b;
        System.out.format("A diferença entre %d e %d é: %d %n ", a, b, x);
    }
}