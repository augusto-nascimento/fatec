/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transito;

import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author augusto
 */
public class Transito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Estatistica estatistica = new Estatistica();
        Metodos m = new Metodos();
        int opc=0      ;
        while (opc!=9){
            opc = Integer.parseInt(JOptionPane.showInputDialog(
                "1 - Cadastrar Cidade \n "
                + "2 - Consulta por tipo de veiculo \n "
                + "3 - Consulta por quantidade de acidentes \n "
                + "4 - Consulta por codigo, nome, quantidade de acidentes \n "
                + "5 - Consultar:"
                        + " menor numero de acidentes \n "
                        + " maior numero de acidentes \n "
                        + " Cidades com quantidade de acidentes acima da media das 5 cidades \n "
                + "4 - Consulta por codigo, nome, quantidade de acidentes \n "
                + "9 - Finaliza"));
            switch (opc) {
                case 1: estatistica = m.GravaCidade(estatistica);
                    break;
                case 2:
                    JOptionPane.showMessageDialog(
                        null, m.list_tipo_veiculo, "Escolha o tipo de veiculo", JOptionPane.PLAIN_MESSAGE);
                    m.TipoAcidente (m.list_tipo_veiculo.getSelectedIndex());
                    break;
                case 9: JOptionPane.showMessageDialog(null,"FINALIZADO ");
                    break;
                default: JOptionPane.showMessageDialog(null,"OPÇÃO INVÁLIDA");
            } 
        }
    }
}
