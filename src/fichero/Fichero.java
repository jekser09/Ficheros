/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fichero;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Torrev_101
 */
public class Fichero {
    public static void main (String [] args) throws IOException{
        int ced, tel;
        String nom;
        String registro="";
        File archivo;
        FileWriter fw;
        BufferedWriter bw;
        FileReader fr;
        BufferedReader br;
        Scanner sc=new Scanner(System.in);
        
        archivo=new File("C:\\Users\\Torrev_101\\Desktop\\fichero.txt");
        fw=new FileWriter(archivo,true);
        bw=new BufferedWriter(fw);
        for(int i=0;i<1;i++){           
            System.out.println("cedula");
            ced=sc.nextInt();
            System.out.println("nombre");
            nom=sc.next();
            System.out.println("telefono");
            tel=sc.nextInt();
            registro=ced+","+nom+","+tel;
            bw.write(registro);
            bw.newLine();           
        }
        bw.close();
        fr=new FileReader(archivo);
        br=new BufferedReader(fr);
        do{
            registro=br.readLine();
            System.out.println(registro);
        }while(registro!=null);
        
    }
}
