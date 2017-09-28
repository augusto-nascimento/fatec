/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Receba os valores do comprimento, largura e altura de um paralelepípedo.
    Calcule e mostre seu volume.
*/
import javax.swing.JOptionPane;
public class Lt01Ex7 {
    public static void main (String args[]) {
        int a, l, c, v;
        a = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do paralelepipido:"));
        l = Integer.parseInt(JOptionPane.showInputDialog("Digite a largura do paralelepipido:"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite a comprimento do paralelepipido:"));
        v = a * l * c;
        System.out.format("O volume do paralelepípido é %d%n", v);
    }
}