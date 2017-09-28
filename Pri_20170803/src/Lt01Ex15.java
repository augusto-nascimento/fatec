/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre
    a hipotenusa..
*/
import javax.swing.JOptionPane;
public class Lt01Ex15 {
    public static void main (String args[]) {
        int co, ca;
        double hi;
        co = Integer.parseInt(JOptionPane.showInputDialog("Informe o primeiro cateto do triângulo"));
        ca = Integer.parseInt(JOptionPane.showInputDialog("Informe o segundo cateto do triângulo"));
        hi = Math.sqrt(Math.pow(co, 2) + Math.pow(ca, 2));
        System.out.format("A hipotenusa mede %.0f%n ", hi);
    }
}