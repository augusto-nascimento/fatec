/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Receba a quantidade de alimento em quilos. Calcule e mostre quantos dias
durará esse alimento sabendo que a pessoa consome 50g ao dia.
*/
import javax.swing.JOptionPane;
public class Lt01Ex13 {
    public static void main (String args[]) {
        int alimento_massa;
        double dia;
        alimento_massa = Integer.parseInt(JOptionPane.showInputDialog("Informe quantos kilogramas de alimentos possui"));
        dia = alimento_massa / 0.05;
        System.out.format("Você possui alimento suficiente para os próximos %.1f dias%n ", dia);
    }
}