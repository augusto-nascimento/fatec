/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-03
    Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e
    quantos anos terá daqui a 17 anos.
*/
import java.util.Calendar;
import javax.swing.JOptionPane;
public class Lt01Ex12 {
    public static void main (String args[]) {
        int ano_nascimento, idade;
        Calendar cal = Calendar.getInstance();
        int ano_atual = cal.get(Calendar.YEAR);
        
        ano_nascimento = Integer.parseInt(JOptionPane.showInputDialog("Informe o ano de nascimento"));
        idade = ano_atual - ano_nascimento;
        System.out.format("Você possui %d%n ", idade);
        idade = idade + 17;
        System.out.format("Daqui a 17 ano você vai possuir %d%n ", idade);
    }
}