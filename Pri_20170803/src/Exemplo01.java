/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Calcular a soma de dois valores a partir da coleta de A e B
*/
import javax.swing.JOptionPane;
public class Exemplo01 {
    public static void main (String args[]) {
        int A, B, C;
        A = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor em A"));
        B = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor em B"));
        C = A + B;
        System.out.println("A soma dos dois valores digitados é: " + C);
    }
}