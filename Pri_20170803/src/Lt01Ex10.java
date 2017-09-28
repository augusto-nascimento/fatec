/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Receba 2 números reais. Calcule e mostre a diferença desses valores.
*/
import javax.swing.JOptionPane;
public class Lt01Ex10 {
    public static void main (String args[]) {
        int a, b, x;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número:"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número:"));
        x = b - a;
        System.out.format("A diferença entre %d e %d é igual à %d%n ", a, b, x);
    }
}