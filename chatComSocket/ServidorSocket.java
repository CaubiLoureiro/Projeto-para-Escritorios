package chatComSocket;

import chatComSocket.GerenciadorDeClientes;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;


public class ServidorSocket {
	/**
	 *
	 * @author caubi
	 */
	
	public static void main(String[] args) {
		
		ServerSocket servidor = null;
		try {
			servidor = new ServerSocket(5000);
			System.out.println("servidor iniciado");
			
			while(true){
				Socket cliente = servidor.accept();
				new GerenciadorDeClientes(cliente);
			}
			
		} catch (IOException e) {
			
			try {
				if(servidor != null)
					servidor.close();
			} catch (IOException e1) {}
			
			System.err.println("erro ao iniciar servidor");
			e.printStackTrace();
		}
		
	}
}
