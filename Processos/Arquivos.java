package Processos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
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
public class Arquivos {
    public static void AdicionaProcesso(String nomeDoArquivo, Processo processo) throws IOException{
       File arquivo = new File(nomeDoArquivo);
       FileWriter arq = new FileWriter(arquivo, true);
       BufferedWriter bwArq = new BufferedWriter(arq);
       
       String inicio = processo.getNumeroDoProcesso()+";";
       String concat = inicio.concat(processo.getNomeDoCliente()+";");
       String frase = concat.concat(processo.getCpfOuCnpj()+";");
       
       System.out.println(frase);
       bwArq.write(frase);
       bwArq.newLine();
       
       System.out.println("Processo adicionado ao arquivo.");
       bwArq.close();
       arq.close();
    }
    public static void buscaProcessoCpf(String nomeDoArquivo, String cpfOuCnpj) throws IOException{
       File arquivo = new File(nomeDoArquivo);
       FileReader arq = new FileReader(arquivo);
       BufferedReader brArq = new BufferedReader(arq);
       int i = 0, achou = 0;
       while(brArq.ready()){
           i++;
           String linha[] = brArq.readLine().split(";");
           if(linha[2].equals(cpfOuCnpj)){      
                System.out.printf("Registro %d: ", i);
                System.out.println("Número do Processo: "+ linha[0]);
                System.out.println("Nome do Cliente: "+ linha[1]);
                System.out.println("CPF ou CNPJ: "+ linha[2]);  
                achou = 1;
                break;
           }
       }
       if(achou == 0){
           throw new ProcessoNaoEncontradoException();
       }
       brArq.close();
       arq.close();
    }
    public static void buscaProcessoNome(String nomeDoArquivo, String nome) throws IOException{
       File arquivo = new File(nomeDoArquivo);
       FileReader arq = new FileReader(arquivo);
       BufferedReader brArq = new BufferedReader(arq);
       int i = 0, achou = 0;
       while(brArq.ready()){
           i++;
           String linha[] = brArq.readLine().split(";");
           if(linha[1].equals(nome)){      
                System.out.printf("Registro %d: ", i);
                System.out.println("Número do Processo: "+ linha[0]);
                System.out.println("Nome do Cliente: "+ linha[1]);
                System.out.println("CPF ou CNPJ: "+ linha[2]);  
                achou = 1;
                break;
           }
       }
       if(achou == 0){
           throw new ProcessoNaoEncontradoException();
       }
       brArq.close();
       arq.close();
    }
    public static void buscaProcessoNumero(String nomeDoArquivo, String numero) throws IOException{
       File arquivo = new File(nomeDoArquivo);
       FileReader arq = new FileReader(arquivo);
       BufferedReader brArq = new BufferedReader(arq);
       int i = 0, achou = 0;
       while(brArq.ready()){
           i++;
           String linha[] = brArq.readLine().split(";");
           if(linha[0].equals(numero)){      
                System.out.printf("Registro %d: ", i);
                System.out.println("Número do Processo: "+ linha[0]);
                System.out.println("Nome do Cliente: "+ linha[1]);
                System.out.println("CPF ou CNPJ: "+ linha[2]);  
                achou = 1;
                break;
           }
       }
       if(achou == 0){
           throw new ProcessoNaoEncontradoException();
       }
       brArq.close();
       arq.close();
    }

    public static void imprimeArquivoDeProcessos(String nomeDoArquivo) throws IOException{
       File arquivo = new File(nomeDoArquivo);
       FileReader arq = new FileReader(arquivo);
       BufferedReader brArq = new BufferedReader(arq);
       int i = 0;
       
       while(brArq.ready()){
           i++;
           String linha[] = brArq.readLine().split(";");
           System.out.printf("Registro %d: ", i);
           System.out.println("Número do Processo: "+ linha[0]);
           System.out.println("Nome do Cliente: "+ linha[1]);
           System.out.println("CPF ou CNPJ: "+ linha[2]);        
       }
 
       brArq.close();
       arq.close();
    }
}
