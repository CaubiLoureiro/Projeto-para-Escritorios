package chatComSocket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;

public class GerenciadorDeClientes extends Thread{

    private Socket cliente;
    private String nomeCliente;
    private static final Map<String, GerenciadorDeClientes> clientes = new HashMap<String, GerenciadorDeClientes>();

    public GerenciadorDeClientes(Socket cliente){
        this.cliente = cliente;
        new Thread(this).start();
    }



    @Override
    public void run(){
        try {
            BufferedReader leitor = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            PrintWriter escritor = new PrintWriter(cliente.getOutputStream(), true);
            escritor.println("Escreva seu nome");
            String menssagem = leitor.readLine();
            this.nomeCliente = menssagem;
            escritor.println(" ola "+this.nomeCliente);
            clientes.put(this.nomeCliente, this);

            while(true) {
                menssagem = leitor.readLine();

                if (menssagem.equalsIgnoreCase("::SAIR")) {
                    this.cliente.close();
                } else {
                    escritor.println("vc disse" + menssagem);
                }
            }

        } catch (IOException e) {
            System.err.println("Conexão cortada");
            e.printStackTrace();
        }

    }



}
