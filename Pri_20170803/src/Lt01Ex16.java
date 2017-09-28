/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-10
    Objetivo: Receba a quantidade de horas trabalhadas, o valor por hora, o percentual
    de desconto e o número de descendentes. Calcule o salário que serão as
    horas trabalhadas x o valor por hora. Calcule o salário líquido (= Salário
    Bruto – desconto). A cada dependente será acrescido R$ 100 no Salário
    Líquido. Exiba o salário a receber.
*/
import javax.swing.JOptionPane;
public class Lt01Ex16 {
    public static void main (String args[]) {
        int quantidade_filhos;
        double quantidade_horas, valor_hora, desconto_percentual, salario_bruto, salario_liquido, salario_receber;
        quantidade_horas = Double.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de horas trabalhadas"));
        valor_hora = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da hora trabalhada"));
        desconto_percentual = Double.parseDouble(JOptionPane.showInputDialog("Informe o percentual de desconto"));
        quantidade_filhos = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de filhos"));
        salario_bruto = quantidade_horas * valor_hora;
        salario_liquido = salario_bruto * (1-(desconto_percentual/100));
        salario_receber = salario_liquido + (quantidade_filhos * 100);
        System.out.format("Salário Bruto: %.2f%n ", salario_bruto);
        System.out.format("Salário Líquido: %.2f%n ", salario_liquido);
        System.out.format("Salário a receber: %.2f%n ", salario_receber);
    }
}