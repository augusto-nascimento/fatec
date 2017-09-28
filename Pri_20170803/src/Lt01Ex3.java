/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Coletar base e altura de um triangulo e mostrar a area
*/
import javax.swing.JOptionPane;
public class Lt01Ex3 {
    public static void main (String args[]) {
        double b, h, A;
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da base do triângulo"));
        h = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da altura do triângulo"));
        A = b * h / 2;
        System.out.println("A área do triângulo  é: " + A);
    }
}