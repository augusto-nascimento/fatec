/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Receber a temperatura em Celsius e mostrar em Fahrenheit
    F = (1.8 * C) + 32
    F = (9*C +160)/5
*/
import javax.swing.JOptionPane;
public class Lt01Ex4 {
    public static void main (String args[]) {
        double c, f;
        c = Double.parseDouble(JOptionPane.showInputDialog("Digite a temperatura em Celsius"));
        f = (1.8 * c) + 32;
        System.out.println("A temperatura em Fahrenheit é: " + f);
        f = ((9 * c) + 160) / 5;
        System.out.println("A temperatura em Fahrenheit é: " + f);
    }
}