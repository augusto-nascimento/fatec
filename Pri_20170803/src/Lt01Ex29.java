/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-17
    Objetivo: Receba o tipo de investimento (1 = poupança e 2 = renda fixa) e o valor
    do investimento. Calcule e mostre o valor corrigido em 30 dias sabendo que a poupança = 3%
    e a renda fixa = 5%. Demais tipos não serão considerados.
*/
import javax.swing.JOptionPane;
public class Lt01Ex29 {
    public static void main (String args[]) {
        int investimento_tipo;
        double investimento_inicial, rendimento;
        investimento_tipo = Integer.parseInt(JOptionPane.showInputDialog("Informe o tipo de investimento %n 1 = poupança e 2 = renda fixa: "));
        investimento_inicial = Double.parseDouble(JOptionPane.showInputDialog("Informe o investimento inicial em reais: "));
        if (investimento_tipo == 1){
            rendimento = investimento_inicial * 1.03;
        }
        else{
            rendimento = investimento_inicial * 1.05;
        }
        System.out.format("Após um mês você terá o montante de R$ %.2f %n", rendimento);
    }
}