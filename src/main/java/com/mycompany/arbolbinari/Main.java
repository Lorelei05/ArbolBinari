/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinari;

/**
 *
 * @author pamel
 */
public class Main {
     public static void main(String[] args) {
        ArbolBinari arbol = new ArbolBinari();
        
        arbol.insertar(10);
        arbol.insertar(2);
        arbol.insertar(75);        
        arbol.insertar(1);
        arbol.insertar(45);

        System.out.println("InOrden: ");
        arbol.dispararInorden();
        System.out.println("");
        
        System.out.println("PostOrden: ");
        arbol.dispararPostorden();
        System.out.println("");

        System.out.println("PreOrden: ");
        arbol.dispararPreorden();
        System.out.println("");



    }
    
}
