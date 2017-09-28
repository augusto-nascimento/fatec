/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Coletar valor do salario e mostrar novo salario com reajuste de 15%
*/
import javax.swing.JOptionPane;
public class Lt01Ex2 {
    public static void main (String args[]) {
        double a, b;
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do salário"));
        b = a * 1.15;
        System.out.println("O valor do novo salário é: " + b);
    }
}