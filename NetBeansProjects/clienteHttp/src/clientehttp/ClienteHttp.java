/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clientehttp;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author mariano
 */
public class ClienteHttp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Socket e = new Socket("88",80);
            PrintWriter pw = new PrintWriter(e.getOutputStream());
            pw.print("GET /  HTTP / 1.1");
            pw.print("antel.com.uy");
            pw.print("User-Agent: Navegador de todopiola");
            pw.print("\r\n");
            pw.flush();
            Scanner sc = new Scanner(e.getInputStream());
            while(sc.hasNextLine()){
                System.out.println(sc.nextLine()); 
            }
        } catch (IOException ex) {
            Logger.getLogger(ClienteHttp.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
