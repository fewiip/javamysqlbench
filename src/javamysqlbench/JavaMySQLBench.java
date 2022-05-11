/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javamysqlbench;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

import java.io.*;

/**
 *
 * @author felipe
 */
public class JavaMySQLBench {
    
    public static String login;
    public static String password;
    public static String database;
    
    public static void main(String[] args) {
        
        // Getting the file by creating object of File class
        File f = new File("login.txt");
        String [] parametros = null;
        
        
        // Checking if the specified file exists or not
        if (f.exists()) {
            try {
                Path fileName = Path.of("login.txt");
                String file_content = Files.readString(fileName);
                parametros = file_content.split("-");
            }catch(Exception e) {
                System.out.println(e);
            }
            login = parametros[0];
            password = parametros[1];
            database = parametros[2];
            
            new NewJFrame2().setVisible(true);
        
        } else {
            new Login().setVisible(true);
        }
 
            
        
    }
}
