/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Receba o raio de uma circunferência. Calcule e mostre o comprimento da
    circunferência
*/
import javax.swing.JOptionPane;
public class Lt01Ex11 {
    public static void main (String args[]) {
        int r;
        double c;
        r = Integer.parseInt(JOptionPane.showInputDialog("Informe o raio da circunferência"));
        c = 2 * Math.PI * r ;
        System.out.format("O comprimento da circunferência é  %.2f%n ", c);
    }
}