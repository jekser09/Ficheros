/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lectura;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/**
 *
 * @author Torrev_101
 */
public class LecturaFichero {
    
    public static void main (String [] args) throws FileNotFoundException, IOException{
        String registro="";
                
    
        File archivo=new File("C:\\Users\\Torrev_101\\Desktop\\fichero.txt");       
        FileReader fr = new FileReader(archivo);
        BufferedReader br=new BufferedReader(fr);    
                
        do{
            try{
            registro=br.readLine();
            if(registro==null){
                break;
            }
            System.out.println(registro);
            }catch(IOException iox){
                JOptionPane.showMessageDialog(null,"Error: "+iox,"alerta",JOptionPane.ERROR);
            }             
        }while(registro!=null);
        System.out.println("-----------SPLIT-------");        
        br.close();
        fr=new FileReader(archivo);
        br=new BufferedReader(fr);
        do{
            try{
            registro=br.readLine();
            if(registro!=null){
                String []dato=registro.split(",");                     
                System.out.println("cedula");
                System.out.println(dato[0]);
                System.out.println("nombre");
                System.out.println(dato[1]);
                System.out.println("telefono");
                System.out.println(dato[2]);
            }else{
                break;
            }           
            }catch(IOException iox){
                JOptionPane.showMessageDialog(null,"Error: "+iox,"alerta",JOptionPane.ERROR);
            }            
        }while(null!=registro);
       
    }
   
        
    
    
}
