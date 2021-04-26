package Processos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pedro
 */
public class Processo {
    private String numeroDoProcesso;
    private String nomeDoCliente;
    private String cpfOuCnpj;
    
    public Processo(String num, String nome, String cpfOuCnpj){
        this.numeroDoProcesso = num;
        this.nomeDoCliente = nome;
        this.cpfOuCnpj = cpfOuCnpj;
    }

    public String getNumeroDoProcesso() {
        return numeroDoProcesso;
    }

    public String getNomeDoCliente() {
        return nomeDoCliente;
    }

    public String getCpfOuCnpj() {
        return cpfOuCnpj;
    }
}
