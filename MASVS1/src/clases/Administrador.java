/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;
import javax.swing.*;
/**
 *
 * @author Victor M
 */
public class Administrador extends Usuario {

    public Administrador() {
    }

    public Administrador(int codigo, String nombre, String apellido, String usuario, String telefono, String direccion, String contraseña) {
        super(codigo, nombre, apellido, usuario, telefono, direccion, contraseña);
    }
    
    public void mostrar(int codigo, String nombre, String apellido, String usuario, String telefono, String direccion, String contraseña){
    JOptionPane.showMessageDialog(null, "Codigo: "+codigo+"\n"+"Nombre: "+nombre+"\n"+"Apellido: "+apellido+"\n"+"Usuario: "+usuario+"\n"+"Telefono: "+telefono+"\n"+"Direccion: "+direccion+"\n"+"Contraseña: "+contraseña,"Administrador", JOptionPane.INFORMATION_MESSAGE);
    
    }
    
    
    
}
