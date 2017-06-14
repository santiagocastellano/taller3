/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

/**
 *
 * @author santi
 */
public interface Producto{
        void propiedades(String nombre, float precio, String descrip);
        void print();
        float getPrecio();
        String getNombre();
    }

