/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Coletar o valor do lado de um quadrado e apresentar a área
*/
import javax.swing.JOptionPane;
public class Lt01Ex1 {
    public static void main (String args[]) {
        double a, b;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do lado do quadrado"));
        b = a * a;
        System.out.println("A área do quadrado  é: " + b);
    }
}