/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-17
    Objetivo: Receba o numero de voltas, a extenção do circuito em (metros) 
    e o tempo de duracao em minutos. Calcule e mostre a velocidade média em km/h
*/
import javax.swing.JOptionPane;
public class Lt01Ex27 {
    public static void main (String args[]) {
        int volta_quantidade;
        double circuito_tamanho, duracao, velocidade_media;
        volta_quantidade = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de voltas: "));
        circuito_tamanho = Double.parseDouble(JOptionPane.showInputDialog("Informe o tamanho do circuito em metros: "));
        duracao = Double.parseDouble(JOptionPane.showInputDialog("Informe a duracao da prova em minutos: "));
        
        velocidade_media = ((volta_quantidade * circuito_tamanho) / 1000) / (duracao/60);
        System.out.format("A velocidade média é de %.2f km/h %n", velocidade_media);
    }
}