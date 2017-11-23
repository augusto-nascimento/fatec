/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transito;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import javax.swing.JList;
import javax.swing.JOptionPane;
//import java.util.Hashtable;

/**
 *
 * @author augusto
 */
public class Metodos {
    JList list_tipo_veiculo = new JList(new String[] {"Carro", "Caminhao", "Moto"});
    static String fileName = "estatistica.txt";
    public Estatistica GravaCidade (Estatistica estatistica) throws IOException {	
        int i;
        String row_record;
        estatistica = new Estatistica();
        estatistica.cod_cidade = Integer.parseInt(JOptionPane.showInputDialog("Entre com o codigo da cidade:"));
        estatistica.nome_cidade = JOptionPane.showInputDialog("Entre com o nome da cidade:");
        estatistica.qtd_acidentes = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade de acidentes:"));
        JOptionPane.showMessageDialog(
            null, list_tipo_veiculo, "Escolha o tipo de veiculo", JOptionPane.PLAIN_MESSAGE);
        estatistica.tipo_veiculo = list_tipo_veiculo.getSelectedIndex();
        row_record = String.format("%s|%s|%s|%s\n", 
                    estatistica.cod_cidade, 
                    estatistica.nome_cidade,
                    estatistica.qtd_acidentes,
                    estatistica.tipo_veiculo
                    );
        Path path = Paths.get(fileName);
        if (Files.exists(path)) {
            Files.write(path, row_record.getBytes(), StandardOpenOption.APPEND);
        }
        else {
            File f = new File(fileName);
            f.createNewFile();
            Files.write(path, row_record.getBytes(), StandardOpenOption.APPEND);
        }
        System.out.println("GRAVAÇÃO FEITA COM SUCESSO ");	
    //    writer.close();
        return estatistica;
    }

    /**
     *
     * @param tipoAcidente
     * @throws java.io.IOException
     */
    public void TipoAcidente(int tipoAcidente) throws IOException{
        int i;
        String row;
        BufferedReader ler = new BufferedReader(new FileReader( fileName ));	
        while ((row = ler.readLine()) != null) {
            if (Integer.parseInt(row.split("\\|")[3]) == tipoAcidente) {
                System.out.println(row);
            }
        }
    }
}

//public class ListaVeiculos {
//    public static Hashtable CarregaTipoVeiculo() {
//        Hashtable <Integer, String> tipoVeiculos = new Hashtable<Integer, String>();
//        tipoVeiculos.put(1,"moto");
//        tipoVeiculos.put(2,"carro");
//        tipoVeiculos.put(3,"caminhão");
//        return tipoVeiculos;
//    }
//}