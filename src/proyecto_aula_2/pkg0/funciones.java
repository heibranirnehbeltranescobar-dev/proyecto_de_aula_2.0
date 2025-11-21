/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_aula_2.pkg0;
import proyecto_aula_2.pkg0.objeto_venta;
/**
 *
 * @author YARITZA
 */
public class funciones {
    
    
    
    public int cantvendedor = 0 ;
    public int cantusuario = 0 ;
    public int canObjetos = 0;
    public int canproducto = 0;
    public String cedulausuarioactual;
    
    
    public Usuario[] usuarios = new Usuario [10];
    public objeto_venta productos []=new objeto_venta[10];
    public int IDusuarioactual = 0;
    public int IDproducto1 = 0;
    public int IDproducto2 = 0;
    public int IDproducto3 = 0;
    public int IDproductoactual = 0;
    public int cantproductousuario = 0;
    
    
    public String gusuario(String nombre , String cedula, String email , String contrasena,String rol){
        
        Usuario u = new Usuario(nombre,cedula,email,contrasena,rol,10000);
        
        usuarios [cantusuario] = u;
        cantusuario++;
        
        String cara = "(=_=)";
        return cara;
    
    }
    
     
     
     public String Guardarproducto(String nombre , String descripcion ,int precio){
         
         objeto_venta producto = new objeto_venta(nombre,descripcion,precio,cedulausuarioactual,0);
         productos [canproducto] = producto;
         canproducto++;
     
     String cara = "(=_=)";
        return cara;
     }
     public String editusuario (String nombre , String email , String contrasena,int pos){
     
       /* vendedores [IDusuarioactual][0] = nombre;
        vendedores [IDusuarioactual][2] = email;
        vendedores [IDusuarioactual][3] = contrasena;*/
         usuarios[pos].nombreCompleto = nombre;
         usuarios[pos].email = email;
         usuarios[pos].password = contrasena;
         String cara = "(=_=)";
        return cara;
     } 
     public static void eliminarProducto(objeto_venta[] vector, int pos) {
    // Validar posición
    if (pos < 0 || pos >= vector.length) {
        System.out.println("Posición inválida");
        return;
    }

    // Mover los elementos hacia la izquierda desde la posición eliminada
    for (int i = pos; i < vector.length - 1; i++) {
        vector[i] = vector[i + 1];
    }

    // Colocar null al final, para indicar vacío
    vector[vector.length - 1] = null;
}

     
      public boolean validarcorreo(String email) {
        return email.contains("@") && email.contains(".");
    }
     
     
     
     
     
     /////
     ///
     ///
    public boolean validarCedula(String cedula) {
        return cedula.length() >= 8 && cedula.length() <= 10 && cedula.matches("\\d+");
    }
    
    
    
    
    
    /////
    
    
    
    
    
}
