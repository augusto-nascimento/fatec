/*
    Nome do programador: Augusto Rocha Nascimento
    Data de elaboração: 2017-08-17
    Objetivo: Receba o preço atual e a média mensal de um produto.
    Calcule e mostre o novo preço sabendo que:
    Venda Mensal    Preço Atual     Preço Novo
    <500            <30             +10%
    >=500 e <1000   >=30 e <80      +15%
    >=1000          >=80            -5%

    Para outras condições, preço novo será igual ao preço atual
*/
import javax.swing.JOptionPane;
public class Lt01Ex28 {
    public static void main (String args[]) {
        int venda_mensal;
        double preco_atual, preco_novo;
        venda_mensal = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de produtos vendidos: "));
        preco_atual = Double.parseDouble(JOptionPane.showInputDialog("Informe o preço atual do produto: "));
        if (venda_mensal < 500 && preco_atual < 30){
            preco_novo = preco_atual * 1.1;
        }
        else if (venda_mensal >= 500 && venda_mensal <1000  && preco_atual >=30 && preco_atual <80) {
            preco_novo = preco_atual * 1.15;
        }
        else if (venda_mensal > 1000 && preco_atual >=80) {
            preco_novo = preco_atual * 0.95;
        }
        else {
            preco_novo = preco_atual;
        }
        System.out.format("O novo preço será de R$ %.2f %n", preco_novo);
    }
}