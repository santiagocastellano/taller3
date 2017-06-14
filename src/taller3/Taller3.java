/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller3;

import java.util.ArrayList;
import java.util.OptionalDouble;

/**
 *
 * @author santi
 */
public class Taller3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList<Producto> listado=new ArrayList<>();
       //inflo el listado en el metodo estatico
       listado=SetContent.listado();
       //operacion funcional sobre el listado que imprime los datos de los objetos
       listado.forEach(n->n.print());
       //operacion funcional que recoje el mayor del stream
       OptionalDouble mayor=listado.stream()
               .mapToDouble(Producto::getPrecio)
               .max();
       //operacion funcional que recoje el menor del stream
       OptionalDouble menor=listado.stream()
               .mapToDouble(Producto::getPrecio)
               .min();
       //recupero mediante un filtro funcional el objeto que contiene el mayor precio
       Producto objMasCaro=listado.stream()
               .filter(x->mayor.getAsDouble()==x.getPrecio())
               .findFirst()
               .orElse(null);
       //recupero mediante un filtro funcional el objeto que contiene el menor precio
       Producto objMasBarato=listado.stream()
               .filter(x->menor.getAsDouble()==x.getPrecio())
               .findFirst()
               .orElse(null);
               
        System.out.println("========================================================");
        System.out.println("Producto mas caro: "+objMasCaro.getNombre());
        System.out.println("Producto mas barato: "+objMasBarato.getNombre());
        
    }
    
}
