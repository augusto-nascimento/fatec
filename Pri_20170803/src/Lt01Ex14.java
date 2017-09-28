/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Receba 2ângulos de um triângulo. Calcule e mostre o valor do 3º ângulo.
*/
import javax.swing.JOptionPane;
public class Lt01Ex14 {
    public static void main (String args[]) {
        int a1, a2, a3;
        a1 = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro ângulo do triângulo"));
        a2 = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo ângulo do triângulo"));
        a3 = 180 - a1 - a2;
        System.out.format("O terceiro angulo do triângulo mede %d graus%n ", a3);
    }
}