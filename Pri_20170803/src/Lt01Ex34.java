/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-31
    Objetivo: Receba um número. Calcule e mostre a tabuada desse número
*/
import javax.swing.JOptionPane;
public class Lt01Ex34 {
    public static void main (String args[]) {
        int x, resultado;
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
        for (int i=0; i <=10; i++) {
            resultado = x * i;
            System.out.printf("%d X %d = %d\n", x, i, resultado);
        }
    }
}