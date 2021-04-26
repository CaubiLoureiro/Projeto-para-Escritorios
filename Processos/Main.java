/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processos;

import java.io.IOException;

/**
 *
 * @author pedro
 */
public class Main {
    public static void main(String[] Args){
        Processo processo = new Processo("1111-2222-3333", "Pedro", "12312312332");
        Processo processo1 = new Processo("1141-2233-2343", "Jorge", "13443223454");
        try {
            Arquivos.AdicionaProcesso("C:/Users/pedro/OneDrive/Teste.txt", processo);
            Arquivos.AdicionaProcesso("C:/Users/pedro/OneDrive/Teste.txt", processo1);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            Arquivos.imprimeArquivoDeProcessos("C:/Users/pedro/OneDrive/Teste.txt");
            Arquivos.buscaProcessoCpf("C:/Users/pedro/OneDrive/Teste.txt", "13443223454");
            Arquivos.buscaProcessoNome("C:/Users/pedro/OneDrive/Teste.txt", "Pedro");
            Arquivos.buscaProcessoNumero("C:/Users/pedro/OneDrive/Teste.txt", "99999999999");
            
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        catch (ProcessoNaoEncontradoException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
