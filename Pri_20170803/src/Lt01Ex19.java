/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-10
    Objetivo: Receba dois números reais. Calcule e mostre o maior deles
*/
import javax.swing.JOptionPane;
public class Lt01Ex19 {
    public static void main (String args[]) {
        double a, b;
        a = Double.parseDouble(JOptionPane.showInputDialog("Informe um número: "));
        b = Double.parseDouble(JOptionPane.showInputDialog("Informe outro número: "));
        if (a<b) {
            System.out.format("O maior número digitado é %f%n ", b);
        }
        else {
            System.out.format("O maior número digitado é %f%n", a);
        }
    }
}