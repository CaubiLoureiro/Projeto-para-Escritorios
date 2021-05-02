/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processos;

import ObjetoProcesso.*;

/**
 *
 * @author pedro
 */
public class Main {
    public static void main(String[] Args){
        Arquivos.inicializaTamanho("C:/Users/pedro/OneDrive/Documentos/NetBeansProjects/Projeto/src/main/java/Processos/tamanho.txt");
        PessoaFisica processo = new PessoaFisica("Alfredo", "Pedro", "12333-3212-2332-322", "Gabriel","Jorge", "12312312332");
        PessoaJuridica processo1 = new PessoaJuridica("Marcos", "CocaCola", "12342-242424-2333-3", "Hugo","João", "11209832098");
//        Arquivos.ArmazenaProcesso("C:/Users/pedro/OneDrive/Documentos/NetBeansProjects/Projeto/src/main/java/Processos/entrada.dat", "C:/Users/pedro/OneDrive/Documentos/NetBeansProjects/Projeto/src/main/java/Processos/tamanho.txt", processo);
        Arquivos.AdicionaProcesso("C:/Users/pedro/OneDrive/Documentos/NetBeansProjects/Projeto/src/main/java/Processos/entrada.dat", "C:/Users/pedro/OneDrive/Documentos/NetBeansProjects/Projeto/src/main/java/Processos/tamanho.txt", processo);
        Arquivos.AdicionaProcesso("C:/Users/pedro/OneDrive/Documentos/NetBeansProjects/Projeto/src/main/java/Processos/entrada.dat", "C:/Users/pedro/OneDrive/Documentos/NetBeansProjects/Projeto/src/main/java/Processos/tamanho.txt", processo1);;
//       
        Arquivos.imprimeArquivoDeProcessos("C:/Users/pedro/OneDrive/Documentos/NetBeansProjects/Projeto/src/main/java/Processos/entrada.dat", "C:/Users/pedro/OneDrive/Documentos/NetBeansProjects/Projeto/src/main/java/Processos/tamanho.txt");
        Arquivos.buscaProcessoCpf("C:/Users/pedro/OneDrive/Documentos/NetBeansProjects/Projeto/src/main/java/Processos/entrada.dat", "C:/Users/pedro/OneDrive/Documentos/NetBeansProjects/Projeto/src/main/java/Processos/tamanho.txt", "12312312332");
        Arquivos.buscaProcessoCnpj("C:/Users/pedro/OneDrive/Documentos/NetBeansProjects/Projeto/src/main/java/Processos/entrada.dat", "C:/Users/pedro/OneDrive/Documentos/NetBeansProjects/Projeto/src/main/java/Processos/tamanho.txt", "12312312332");
//        Arquivos.buscaProcessoNumero("C:/Users/pedro/OneDrive/Documentos/NetBeansProjects/Projeto/src/main/java/Processos/entrada.dat", "0");

    }
}
