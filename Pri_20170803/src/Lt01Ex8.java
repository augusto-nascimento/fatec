/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Receba o valor de um depósito em poupança. Calcule e mostre o valor
    após 1 mês de aplicação sabendo que rende 1,3% a. m.
*/
import javax.swing.JOptionPane;
public class Lt01Ex8 {
    public static void main (String args[]) {
        double valor_inicial, valor_final;
        valor_inicial = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da aplicação inicial:"));
        valor_final = valor_inicial * (1 + (1.3 / 100));
        System.out.format("O valor após um mês de aplicação é R$ %.2f%n", valor_final);
    }
}