package Processos;

import java.io.IOException;
import ObjetoProcesso.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

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
    public static void inicializaTamanho(String nomeDoArquivo){
        try{
            File arquivo = new File(nomeDoArquivo);
            FileReader arq = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(arq);
            String linha = br.readLine();
            br.close();
            arq.close();
            if(linha == null){
                File arquivo1 = new File(nomeDoArquivo);
                FileWriter arq1 = new FileWriter(arquivo1);
                BufferedWriter bw = new BufferedWriter(arq1);
                bw.write("0");
                bw.close();
                arq.close();
            }
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    
    }
    public static int tamanhoArquivo(String nomeDoArquivoTamanho){
        int tamanho = 0;
        try {
            File arquivo = new File(nomeDoArquivoTamanho);
            FileReader arq = new FileReader(arquivo);
            BufferedReader br = new BufferedReader(arq);
            String linha = br.readLine();
            tamanho = Integer.parseInt(linha);
            br.close();
            arq.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return tamanho;
    }
    public static <T> void ArmazenaProcesso(String nomeDoArquivo, String nomeDoArquivoTamanho, T processo){
       int tamanho = 0;
       FileOutputStream arq;
       try{
          arq = new FileOutputStream(nomeDoArquivo);
          ObjectOutputStream os = new ObjectOutputStream(arq);
          os.writeObject(processo);
          os.flush();
          os.close();
       }
       catch(FileNotFoundException e){
           System.out.println(e.getMessage());
       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }      
       try{
           File arquivo1 = new File(nomeDoArquivoTamanho);
           FileReader arq1 = new FileReader(arquivo1);
           BufferedReader br = new BufferedReader(arq1);
           String linha = br.readLine();
           tamanho = Integer.parseInt(linha) + 1;
           br.close();
           arq1.close();
       }
       catch(FileNotFoundException e){
           System.out.println(e.getMessage());
       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
       try{
        File arquivo2 = new File(nomeDoArquivoTamanho);
        FileWriter arq2 = new FileWriter(arquivo2);
        BufferedWriter bw = new BufferedWriter(arq2);
        String tam = String.valueOf(tamanho);
        bw.write(tam);
        bw.close();
        arq2.close();
       }
       catch(FileNotFoundException e){
           System.out.println(e.getMessage());
       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
    }
    public static <T> void AdicionaProcesso(String nomeDoArquivo, String nomeDoArquivoTamanho, T processo){
       int tamanho = 0;
       FileOutputStream arq;
       try{
          arq = new FileOutputStream(nomeDoArquivo, true);
          ObjectOutputStream os1 = new AppendObjectOutputStream(arq);
          os1.writeObject(processo);
          os1.flush();
          os1.close();
       }
       catch(FileNotFoundException e){
           System.out.println(e.getMessage());
       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
       try{
           File arquivo1 = new File(nomeDoArquivoTamanho);
           FileReader arq1 = new FileReader(arquivo1);
           BufferedReader br = new BufferedReader(arq1);
           String linha = br.readLine();
           tamanho = Integer.parseInt(linha) + 1;
           br.close();
           arq1.close();
       }
       catch(FileNotFoundException e){
           System.out.println(e.getMessage());
       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
       try{
        File arquivo2 = new File(nomeDoArquivoTamanho);
        FileWriter arq2 = new FileWriter(arquivo2);
        BufferedWriter bw = new BufferedWriter(arq2);
        String tam = String.valueOf(tamanho);
        bw.write(tam);
        bw.close();
        arq2.close();
       }
       catch(FileNotFoundException e){
           System.out.println(e.getMessage());
       }
       catch(IOException e){
           System.out.println(e.getMessage());
       }
    }
    
    public static <T extends Processo> void buscaProcessoNumero (String nomeDoArquivo, String nomeDoArquivoTamanho, String numero){
        int tam = tamanhoArquivo(nomeDoArquivoTamanho);
        try{
            FileInputStream arquivo = new FileInputStream(nomeDoArquivo);
            ObjectInputStream is = new ObjectInputStream(arquivo);
            int achou = 0; 
            for(int i = 0; i < tam; i++){
                T processo = (T) is.readObject();
                if(processo.getNumeroProcesso().equals(numero)){
                    System.out.printf("Registro %d: ", i+1);
                    System.out.println("\nNome do Réu: "+ processo.getReu());
                    System.out.println("Nome do Autor do Processo: "+ processo.getAutor());
                    System.out.println("Número do Processo: "+ processo.getNumeroProcesso());
                    System.out.println("Nome do Advogado do Autor do Processo: "+ processo.getAdvogadoAutor());  
                    System.out.println("Nome do Advogado do Réu: "+ processo.getAdvogadoReu());
                    if(processo instanceof PessoaFisica)
                        System.out.println("CPF: "+ ((PessoaFisica) processo).getCpf() +"\n");
                    else
                        System.out.println("CNPJ: "+ ((PessoaJuridica) processo).getCnpj() +"\n");
                    achou = 1;
                    break;
                }
            }
            if(achou == 0){
                throw new ProcessoNaoEncontradoException();
            }
            is.close();
        }
        catch(ProcessoNaoEncontradoException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public static <T extends Processo> void buscaProcessoCpf (String nomeDoArquivo,String nomeDoArquivoTamanho, String cpf){
        int tam = tamanhoArquivo(nomeDoArquivoTamanho);        
        try{
            FileInputStream arquivo = new FileInputStream(nomeDoArquivo);
            ObjectInputStream is = new ObjectInputStream(arquivo);
            int achou = 0; 
            for(int i = 0; i < tam; i++){
                T processo = (T) is.readObject();
                if(processo instanceof PessoaFisica){
                    if(((PessoaFisica)processo).getCpf().equals(cpf)){
                        System.out.printf("Registro %d: ", i+1);
                        System.out.println("\nNome do Réu: "+ processo.getReu());
                        System.out.println("Nome do Autor do Processo: "+ processo.getAutor());
                        System.out.println("Número do Processo: "+ processo.getNumeroProcesso());
                        System.out.println("Nome do Advogado do Autor do Processo: "+ processo.getAdvogadoAutor());  
                        System.out.println("Nome do Advogado do Réu: "+ processo.getAdvogadoReu());
                        System.out.println("CPF: "+ ((PessoaFisica) processo).getCpf() +"\n");
                        achou = 1;
                        break;
                    }
                }                
            }
            if(achou == 0)
                throw new ProcessoNaoEncontradoException();
            is.close();
        }
        catch(ProcessoNaoEncontradoException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public static <T extends Processo> void buscaProcessoCnpj (String nomeDoArquivo, String nomeDoArquivoTamanho, String cnpj){
        int tam = tamanhoArquivo(nomeDoArquivoTamanho);  
        try{
            FileInputStream arquivo = new FileInputStream(nomeDoArquivo);
            ObjectInputStream is = new ObjectInputStream(arquivo);
            int achou = 0; 
            for(int i = 0; i < tam; i++){
                T processo = (T) is.readObject();
                if(processo instanceof PessoaJuridica){
                    if(((PessoaJuridica)processo).getCnpj().equals(cnpj)){
                        System.out.printf("Registro %d: ", i+1);
                        System.out.println("\nNome do Réu: "+ processo.getReu());
                        System.out.println("Nome do Autor do Processo: "+ processo.getAutor());
                        System.out.println("Número do Processo: "+ processo.getNumeroProcesso());
                        System.out.println("Nome do Advogado do Autor do Processo: "+ processo.getAdvogadoAutor());  
                        System.out.println("Nome do Advogado do Réu: "+ processo.getAdvogadoReu());
                        System.out.println("CNPJ: "+ ((PessoaJuridica) processo).getCnpj() +"\n");
                        achou = 1;
                        break;
                    }
                }                
            }
            if(achou == 0)
                throw new ProcessoNaoEncontradoException();
            is.close();
        }
        catch(ProcessoNaoEncontradoException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    public static <T extends Processo> void imprimeArquivoDeProcessos(String nomeDoArquivo,  String nomeDoArquivoTamanho){
        int tam = tamanhoArquivo(nomeDoArquivoTamanho);
        try{
            FileInputStream arquivo = new FileInputStream(nomeDoArquivo);
            ObjectInputStream is = new ObjectInputStream(arquivo);
            int achou = 0; 
            for(int i = 0; i < tam; i++){
                T processo = (T) is.readObject();
                System.out.printf("Registro %d: ", i+1);
                System.out.println("\nNome do Réu: "+ processo.getReu());
                System.out.println("Nome do Autor do Processo: "+ processo.getAutor());
                System.out.println("Número do Processo: "+ processo.getNumeroProcesso());
                System.out.println("Nome do Advogado do Autor do Processo: "+ processo.getAdvogadoAutor());  
                System.out.println("Nome do Advogado do Réu: "+ processo.getAdvogadoReu());
                if(processo instanceof PessoaFisica)
                    System.out.println("CPF: "+ ((PessoaFisica) processo).getCpf() +"\n");
                else
                    System.out.println("CNPJ: "+ ((PessoaJuridica) processo).getCnpj() +"\n");
            }
            is.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        catch(ClassNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
}
