/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.miprimerproyecto1;

import java.util.Scanner;


/**
 *
 * @author Javier Gomez
 */
public class ClasePrincipal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Byte v1;
        short v2;
        int v3;
        float v4;
        double v5;
        char v6;
        float v33;
        
        
        v1=126;
        v33=v1.floatValue();
        v3=100000;
        v4=100.55f;
        v5=1254125.02;
        v6='J';
        v2=2;
        
        System.out.println("v1="+v1);
        System.out.println("v2="+v2);
        System.out.println("v3="+v33);
        
        Scanner entrada=new Scanner(System.in);
        String cadena;
        System.out.println("Ingresa el valor");
        cadena = entrada.nextLine();
        
        System.out.println("El valor ingresado es "+cadena);
         
        
        
    }
    
}
