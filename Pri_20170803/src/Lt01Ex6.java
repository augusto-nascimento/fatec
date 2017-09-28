/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus
    conteúdos
*/
import javax.swing.JOptionPane;
public class Lt01Ex6 {
    public static void main (String args[]) {
        int x, y, a;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y"));
        System.out.format("Entrada: x = %d, y = % d %n", x, y);
        a = x;
        x = y;
        y = a;
        System.out.format("Saída: x = %d, y = % d %n", x, y);
    }
}