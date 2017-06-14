/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class SetContent {
    public static ArrayList<Producto> listado(){
        ArrayList<Producto> lista=new ArrayList<>();
        
        Producto producto1= new Bebida();
        producto1.propiedades("Coca-Cola Zero",20,"Litros:1.5");
        Producto producto2= new Bebida();
        producto2.propiedades("Coca-Cola",18,"Litros:1.5");
        Producto producto3= new Shampoo();
        producto3.propiedades("Shampoo Sedal",30,"Contenido:500mm");
        Producto producto4= new Verdura();
        producto4.propiedades("Frutillas",64,"Unidad de venta: kilo"); 
        lista.add(producto1);
        lista.add(producto2);
        lista.add(producto3);
        lista.add(producto4);
        return lista;
        
    }
}
