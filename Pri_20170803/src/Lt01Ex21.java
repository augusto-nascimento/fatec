/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-10
    Objetivo: Receba 4 notas bimestrais de um aluno. Calcule e mostre a média aritmética. 
    Mostre a mensagem de acordo com a média:
        Se a média >=6 exibir APROVADO
        Se a média for >= 3 ou <6 EXAME
        Se a média for <3 RETIDO
*/
import javax.swing.JOptionPane;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class Lt01Ex21 {
    public static void main (String args[]) {
        List<Double> a = new ArrayList<>();
        int i;
        double nota, soma = 0, media;
        //for (variavel; condiçao; ++/--){}
        for (i=0; i <4; i++){
            nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + i));
            a.add(nota);
        }
        for (i=0; i <4; i++){
            soma = soma + a.get(i);
        }
        media = soma / 4; 
        if (media >=6) {
            System.out.format("APROVADO");
        }
        else if (media >=3) {
            System.out.format("EXAME");
        }
        else {
            System.out.format("RETIDO");
        }
    }
}