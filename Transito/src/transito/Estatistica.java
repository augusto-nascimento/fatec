/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transito;

/**
 *
 * @author augusto
 */
public class Estatistica {
    int cod_cidade;
    String nome_cidade;
    int qtd_acidentes;
    int tipo_veiculo;
    Estatistica() { 
        this(0, "",0,0); 
    }
    Estatistica(int _cod_cidade, String _nome_cidade, int _qtd_acidentes, int _tipo_veiculo) {
        cod_cidade = _cod_cidade;
        nome_cidade = _nome_cidade;
        qtd_acidentes = _qtd_acidentes;
        tipo_veiculo = _tipo_veiculo;
    }
    
}