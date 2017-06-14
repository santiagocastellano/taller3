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
public class Shampoo implements Producto {
    public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public void setDescrip(String descrip) {
            this.descrip = descrip;
        }

        public void setPrecio(float precio) {
            this.precio = precio;
        }

        @Override
        public String getNombre() {
            return nombre;
        }

        public String getDescrip() {
            return descrip;
        }

        @Override
        public float getPrecio() {
            return precio;
        }
        
        private String nombre, descrip;
        private float precio;
        @Override
        public void propiedades(String nombre, float precio, String descrip) {
            this.nombre=nombre;
            this.precio=precio;
            this.descrip=descrip;
        }
        @Override
        public void print(){
            System.out.println("Nombre: "+ this.nombre+"///"+this.descrip+"///"+"Precio: $"+this.precio);
        }
}
