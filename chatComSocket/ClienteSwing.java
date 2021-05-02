package chatComSocket;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.net.Socket;
import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

public class ClienteSwing extends JFrame {


    private static final long serialVersionUID = -5261903818373181455L;
    private JTextArea taEditor = new JTextArea("digite aqui sua mensagem");
    private JTextArea taVisor = new JTextArea();
    private JList liUsarios = new JList();
    private PrintWriter escritor;
    private BufferedReader leitor;
    private JScrollPane scrollTaVisor = new JScrollPane(taVisor);

    public ClienteSwing() {

        setTitle("Chat com sockets");
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        liUsarios.setBackground(Color.GRAY);
        taEditor.setBackground(Color.CYAN);

        taEditor.setPreferredSize(new Dimension(400, 50));
		taVisor.setPreferredSize(new Dimension(300, 200));
        taVisor.setEditable(false);
        liUsarios.setPreferredSize(new Dimension(10, 140));

        add(taEditor, BorderLayout.SOUTH);
        add(scrollTaVisor , BorderLayout.CENTER);
        add(new JScrollPane(liUsarios), BorderLayout.WEST);

        pack();
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        String[] usuarios = new String[]{"elvis", "maria", "joao", "jose", "renata", "marizete", "mateus", "robson"};


    }

    public void eventos(){
        taEditor.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {

            }

            @Override
            public void keyReleased(KeyEvent e) {
                taEditor.getText();
                if (e.getKeyCode() == KeyEvent.VK_ENTER){
                    taEditor.setText("");
                }

            }
        });
    }


    public static void main(String[] args) {
        new ClienteSwing();
    }



}





