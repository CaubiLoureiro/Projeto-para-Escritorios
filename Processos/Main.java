/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Processos;

import java.io.IOException;
import ObjetoProcesso.*;

/**
 *
 * @author pedro
 */
public class Main {
    public static void main(String[] Args){
        PessoaFisica processo = new PessoaFisica("Alfredo", "Pedro", "12333-3212-2332-322", "Gabriel","Jorge", "12312312332");
        PessoaJuridica processo1 = new PessoaJuridica("Marcos", "CocaCola", "12342-242424-2333-3", "Hugo","João", "11209832098");
        try {
            Arquivos.AdicionaProcesso("C:/Users/pedro/OneDrive/Teste.txt", processo);
            Arquivos.AdicionaProcesso("C:/Users/pedro/OneDrive/Teste.txt", processo1);
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        
        try {
            Arquivos.imprimeArquivoDeProcessos("C:/Users/pedro/OneDrive/Teste.txt");
            Arquivos.buscaProcessoCpfOuCnpj("C:/Users/pedro/OneDrive/Teste.txt", "12312312332");
            Arquivos.buscaProcessoCpfOuCnpj("C:/Users/pedro/OneDrive/Teste.txt", "11209832098");
            Arquivos.buscaProcessoAutor("C:/Users/pedro/OneDrive/Teste.txt", "Pedro");
            Arquivos.buscaProcessoNumero("C:/Users/pedro/OneDrive/Teste.txt", "12342-242424-2333-3");
            Arquivos.buscaProcessoAdvogadoAutor("C:/Users/pedro/OneDrive/Teste.txt", "Gabriel");
            Arquivos.buscaProcessoAdvogadoReu("C:/Users/pedro/OneDrive/Teste.txt", "João");
        } 
        catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        catch (ProcessoNaoEncontradoException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
