/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primoserver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author pc15
 */
public class PrimoServer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            ServerSocket ss = new ServerSocket(2323);
            for(;;){
                Socket s = ss.accept();
                int x = s.getInputStream().read();
                System.out.println("Ricevuto : " + x);
                s.close();
            }
        } catch (IOException ex) {
            Logger.getLogger(PrimoServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
