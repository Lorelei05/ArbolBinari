/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.arbolbinari;

/**
 *
 * @author pamel
 */
public class Nodo {
     private int valor;
    private Nodo nodoIzq;
    private Nodo nodoDer;
    
    public Nodo ( int valor ) {
        this.valor = valor;
        this.nodoIzq = null;
        this.nodoDer = null;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public Nodo getNodoIzq() {
        return nodoIzq;
    }

    public Nodo getNodoDer() {
        return nodoDer;
    }    
    
    
    public void insertar ( int v ) {
        if ( v < this.valor ) {
            if ( this.nodoIzq == null ) {
                this.nodoIzq = new Nodo(v); 
            } else {
                this.nodoIzq.insertar(v);
            }
        } else {
            if ( this.nodoDer == null ) {
                this.nodoDer = new Nodo(v);
            } else {
                this.nodoDer.insertar(v);
            }
        }
    }
}

