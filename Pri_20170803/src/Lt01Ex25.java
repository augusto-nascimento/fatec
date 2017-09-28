/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-10
    Objetivo: Receba a hora inicial e a hora final de um jogo (hh,mm),
    sabendo que o tempo máximo é de 24 horas e pode começar em um dia e terminar em outro.
*/
import javax.swing.JOptionPane;
public class Lt01Ex25 {
    public static void main (String args[]) {
        int hi, hf, mi, mf;
        int dh, dm;
        hi = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora inicial: "));
        mi = Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto inicial: "));
        hf = Integer.parseInt(JOptionPane.showInputDialog("Informe a hora final: "));
        mf = Integer.parseInt(JOptionPane.showInputDialog("Informe o minuto final: "));        
        if (hi <= hf) {
            dh = hf - hi;
        }
        else {
            dh = 24 - hi + hf;
        }
        if (mf >= mi) {
            dm = mf - mi;
        }
        else {
            dm = (60 - mi) + (mf);
            dh = dh - 1;
        }
        System.out.format("tempo transcorrido %d:%d%n", dh, dm);
    }
}