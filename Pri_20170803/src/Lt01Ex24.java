/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-10
    Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
*/
import javax.swing.JOptionPane;
public class Lt01Ex24 {
    public static void main (String args[]) {
        int x;
        x = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
        
        if (x % 2 == 0) {
            System.out.format("%d é divisível por 2%n", x);
        }
        if (x % 3 == 0) {
            System.out.format("%d é divisível por 3%n", x);
        }
        if ((x % 2 != 0) && (x % 3 != 0)) {
            System.out.format("%d não é divisível por 2 nem por 3%n", x);
        }
    }
}