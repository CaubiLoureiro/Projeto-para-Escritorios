package Processos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import ObjetoProcesso.*;

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
    public static void AdicionaProcesso(String nomeDoArquivo, PessoaFisica processo) throws IOException{
       File arquivo = new File(nomeDoArquivo);
       FileWriter arq = new FileWriter(arquivo, true);
       BufferedWriter bwArq = new BufferedWriter(arq);
       
       String inicio = processo.getReu()+";";
       String concat = inicio.concat(processo.getAutor()+";");
       String concat1 = concat.concat(processo.getNumeroProcesso()+";");
       String concat2 = concat1.concat(processo.getAdvogadoAutor()+";");
       String concat3 = concat2.concat(processo.getAdvogadoReu()+";");
       String frase = concat3.concat(processo.getCpf()+";");
       
       System.out.println(frase);
       bwArq.write(frase);
       bwArq.newLine();
       
       System.out.println("Processo adicionado ao arquivo.");
       bwArq.close();
       arq.close();
    }
    public static void AdicionaProcesso(String nomeDoArquivo, PessoaJuridica processo) throws IOException{
       File arquivo = new File(nomeDoArquivo);
       FileWriter arq = new FileWriter(arquivo, true);
       BufferedWriter bwArq = new BufferedWriter(arq);
       
       String inicio = processo.getReu()+";";
       String concat = inicio.concat(processo.getAutor()+";");
       String concat1 = concat.concat(processo.getNumeroProcesso()+";");
       String concat2 = concat1.concat(processo.getAdvogadoAutor()+";");
       String concat3 = concat2.concat(processo.getAdvogadoReu()+";");
       String frase = concat3.concat(processo.getCnpj()+";");
       
       System.out.println(frase);
       bwArq.write(frase);
       bwArq.newLine();
       
       System.out.println("Processo adicionado ao arquivo.");
       bwArq.close();
       arq.close();
    }
    public static void buscaProcessoCpfOuCnpj(String nomeDoArquivo, String cpfOuCnpj) throws IOException{
       File arquivo = new File(nomeDoArquivo);
       FileReader arq = new FileReader(arquivo);
       BufferedReader brArq = new BufferedReader(arq);
       int i = 0, achou = 0;
       while(brArq.ready()){
           i++;
           String linha[] = brArq.readLine().split(";");
           if(linha[5].equals(cpfOuCnpj)){      
                System.out.printf("Registro %d: ", i);
                System.out.println("Nome do Réu: "+ linha[0]);
                System.out.println("Nome do Autor do Processo: "+ linha[1]);
                System.out.println("Número do Processo: "+ linha[2]);
                System.out.println("Nome do Advogado do Autor do Processo: "+ linha[3]);  
                System.out.println("Nome do Advogado do Réu: "+ linha[4]);  
                System.out.println("CPF ou CNPJ: "+ linha[5] +"\n");  
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
    public static void buscaProcessoAutor(String nomeDoArquivo, String autor) throws IOException{
       File arquivo = new File(nomeDoArquivo);
       FileReader arq = new FileReader(arquivo);
       BufferedReader brArq = new BufferedReader(arq);
       int i = 0, achou = 0;
       while(brArq.ready()){
           i++;
           String linha[] = brArq.readLine().split(";");
           if(linha[1].equals(autor)){      
                System.out.printf("Registro %d: ", i);
                System.out.println("Nome do Réu: "+ linha[0]);
                System.out.println("Nome do Autor do Processo: "+ linha[1]);
                System.out.println("Número do Processo: "+ linha[2]);
                System.out.println("Nome do Advogado do Autor do Processo: "+ linha[3]);  
                System.out.println("Nome do Advogado do Réu: "+ linha[4]);  
                System.out.println("CPF ou CNPJ: "+ linha[5] +"\n");  
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
    public static void buscaProcessoReu(String nomeDoArquivo, String reu) throws IOException{
       File arquivo = new File(nomeDoArquivo);
       FileReader arq = new FileReader(arquivo);
       BufferedReader brArq = new BufferedReader(arq);
       int i = 0, achou = 0;
       while(brArq.ready()){
           i++;
           String linha[] = brArq.readLine().split(";");
           if(linha[0].equals(reu)){      
                System.out.printf("Registro %d: ", i);
                System.out.println("Nome do Réu: "+ linha[0]);
                System.out.println("Nome do Autor do Processo: "+ linha[1]);
                System.out.println("Número do Processo: "+ linha[2]);
                System.out.println("Nome do Advogado do Autor do Processo: "+ linha[3]);  
                System.out.println("Nome do Advogado do Réu: "+ linha[4]);  
                System.out.println("CPF ou CNPJ: "+ linha[5] +"\n");  
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
           if(linha[2].equals(numero)){      
                System.out.printf("Registro %d: ", i);
                System.out.println("Nome do Réu: "+ linha[0]);
                System.out.println("Nome do Autor do Processo: "+ linha[1]);
                System.out.println("Número do Processo: "+ linha[2]);
                System.out.println("Nome do Advogado do Autor do Processo: "+ linha[3]);  
                System.out.println("Nome do Advogado do Réu: "+ linha[4]);  
                System.out.println("CPF ou CNPJ: "+ linha[5] +"\n");  
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
    public static void buscaProcessoAdvogadoAutor(String nomeDoArquivo, String adv) throws IOException{
       File arquivo = new File(nomeDoArquivo);
       FileReader arq = new FileReader(arquivo);
       BufferedReader brArq = new BufferedReader(arq);
       int i = 0, achou = 0;
       while(brArq.ready()){
           i++;
           String linha[] = brArq.readLine().split(";");
           if(linha[3].equals(adv)){      
                System.out.printf("Registro %d: ", i);
                System.out.println("Nome do Réu: "+ linha[0]);
                System.out.println("Nome do Autor do Processo: "+ linha[1]);
                System.out.println("Número do Processo: "+ linha[2]);
                System.out.println("Nome do Advogado do Autor do Processo: "+ linha[3]);  
                System.out.println("Nome do Advogado do Réu: "+ linha[4]);  
                System.out.println("CPF ou CNPJ: "+ linha[5] +"\n");  
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
    public static void buscaProcessoAdvogadoReu(String nomeDoArquivo, String numero) throws IOException{
       File arquivo = new File(nomeDoArquivo);
       FileReader arq = new FileReader(arquivo);
       BufferedReader brArq = new BufferedReader(arq);
       int i = 0, achou = 0;
       while(brArq.ready()){
           i++;
           String linha[] = brArq.readLine().split(";");
           if(linha[4].equals(numero)){      
                System.out.printf("Registro %d: ", i);
                System.out.println("Nome do Réu: "+ linha[0]);
                System.out.println("Nome do Autor do Processo: "+ linha[1]);
                System.out.println("Número do Processo: "+ linha[2]);
                System.out.println("Nome do Advogado do Autor do Processo: "+ linha[3]);  
                System.out.println("Nome do Advogado do Réu: "+ linha[4]);  
                System.out.println("CPF ou CNPJ: "+ linha[5] +"\n");  
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
           System.out.println("Nome do Réu: "+ linha[0]);
           System.out.println("Nome do Autor do Processo: "+ linha[1]);
           System.out.println("Número do Processo: "+ linha[2]);
           System.out.println("Nome do Advogado do Autor do Processo: "+ linha[3]);  
           System.out.println("Nome do Advogado do Réu: "+ linha[4]);  
           System.out.println("CPF ou CNPJ: "+ linha[5] +"\n");        
       }
 
       brArq.close();
       arq.close();
    }
}
