/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-10
    Objetivo: Receba 3 valores obrigatoriamente em ordem crescente e um quarto não 
    necessáriamente em ordem. Mostre os 4 números em ordem crescente
*/
import javax.swing.JOptionPane;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;

public class Lt01Ex23 {
    public static void main (String args[]) {
        List<Double> a = new ArrayList<>();
        List<Double> b = new ArrayList<>();
        int i, t;
        double valor;
        //for (variavel; condiçao; ++/--){}
        for (i=0; i <4; i++){
            valor = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota " + (i+1)));
            a.add(valor);
        }
        System.out.println("lista entrada: " + a);
        for (i=0 ; i < a.size() ; i++) {
            valor = a.get(i);
            t = i;
            while (t > 0 && valor < a.get(t-1)) {
                a.set(t, a.get(t-1));
                t -=1;
            }
            a.set(t, valor);
        }
        System.out.println("lista saida: " + a);
    }
}