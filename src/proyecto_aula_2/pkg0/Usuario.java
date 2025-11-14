/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_aula_2.pkg0;

/**
 *
 * @author YARITZA
 */
public class Usuario {

   
    
    public String nombreCompleto;
    public String email;
    public String password;
    public String cedula;
    public String rol;
 
    public Usuario(String nombreCompleto, String email, String password,String cedula,String rol) {
        this.nombreCompleto = nombreCompleto;
        this.email = email;
        this.password = password;
        this.cedula = cedula;
        this.rol = rol;
    }      
}
