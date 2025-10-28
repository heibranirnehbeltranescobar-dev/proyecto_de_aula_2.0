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

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedulas) {
        this.cedula = cedulas;
    }
      public String getrol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    private String nombreCompleto;
    private String email;
    private String password;
    private String cedula;
    private String rol;
}
