/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-17
    Objetivo: Receba 2 numeros inteiros. Verifique e mostre se o maior número é multiplo do menor.
*/
import javax.swing.JOptionPane;
public class Lt01Ex26 {
    public static void main (String args[]) {
        int a, b, x;
        a = Integer.parseInt(JOptionPane.showInputDialog("Informe um número inteiro: "));
        b = Integer.parseInt(JOptionPane.showInputDialog("Informe outro número inteiro: "));
        if (a>b) {
            x = a;
            a = b;
            b = x;
        }
        if (b % a == 0){
            System.out.format("%d é multiplo de %d%n", b, a);
        }
        else {
            System.out.format("%d não é multiplo de %d%n", b, a);
        }
        
    }
}