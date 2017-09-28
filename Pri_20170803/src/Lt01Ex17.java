/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-10
    Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12km/l. 
    Receber o tempo de percurso e a velocidade média.
*/
import javax.swing.JOptionPane;
public class Lt01Ex17 {
    public static void main (String args[]) {
        double percurso_tempo, velocidade_media, consumo_medio, consumo_total;
        percurso_tempo = Double.parseDouble(JOptionPane.showInputDialog("Digite o tempo gasto no percurso em horas"));
        velocidade_media = Double.parseDouble(JOptionPane.showInputDialog("Informe a velocidade média em km/h"));
        consumo_medio = 12;
        consumo_total = (velocidade_media * percurso_tempo) / consumo_medio;
        System.out.format("Consumo total de combustivel: %.2f litros%n ", consumo_total);
    }
}