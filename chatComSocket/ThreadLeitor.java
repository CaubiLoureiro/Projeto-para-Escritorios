package chatComSocket;

import javax.jnlp.FileContents;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ThreadLeitor implements Runnable {
    /**
     *
     * @author caubi
     */


    private Socket cliente;


    public ThreadLeitor(Socket cliente){
        new Thread(this).start();
        this.cliente = cliente;
    }





    @Override
    public void run() {
        try {
            BufferedReader leitor = new BufferedReader(new InputStreamReader(cliente.getInputStream()));
            while(true){
                String mensagem = leitor.readLine();
                if(mensagem == null || mensagem.isEmpty())
                    continue;

                System.out.println("o servidor disse: " + mensagem);
            }

        } catch (IOException e) {
            System.out.println("impossivel ler a mensagem do servidor");
            e.printStackTrace();
        }
    }
}
