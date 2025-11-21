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
    public int dinero;
    
    
    public Usuario[] usuarios = new Usuario [10];
    public objeto_venta productos []=new objeto_venta[10];
    public int IDusuarioactual = 0;
    public int IDproducto1 = 0;
    public int IDproducto2 = 0;
    public int IDproducto3 = 0;
    public int IDproductoactual = 0;
    public int cantproductousuario = 0;
    
    
    public String gusuario(String nombre , String email, String cedula , String contrasena,String rol){
        
        Usuario u = new Usuario(nombre,email,contrasena,cedula,rol,10000);
        
        usuarios [cantusuario] = u;
        cantusuario++;
        
        String cara = "(=_=)))";
        return cara;
    
    }
    public String gproductoinicialsado (String nombre,String descripcion,int precio,String cedulausu){
    objeto_venta producto = new objeto_venta(nombre,descripcion,precio,cedulausu,0);
         productos [canproducto] = producto;
         canproducto++;
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
    
    
    
    public String listarUsuarios() {
    String lista = "USUARIOS REGISTRADOS:\n\n";
    
    for (int i = 0; i < cantusuario; i++) {
        Usuario u = usuarios[i];
        lista +="Nombre: " + u.nombreCompleto 
                + " | contraseña: " + u.cedula 
                + " | Email: " + u.email 
                + " | Rol: " + u.rol 
                + "\n";
    }
    
    return lista;
}
    

    
    
 public String suspenderUsuario(String email) {
    for (int i = 0; i < cantusuario; i++) {
        if (usuarios[i].email.equals(email)) {
            usuarios[i].rol = "SUSPENDIDO"; 
            return "Usuario suspendido";
        }
    }
    return "Usuario no encontrado";
}
 
public int buscarUsuarioPorCedula(String correo) {
    for (int i = 0; i < cantusuario; i++) {
        if (usuarios[i].cedula.equals(correo)) {
            return i;
        }
    }
    return -1; // No encontrado
}
 
public String modificarUsuario(String correo, String nuevoNombre, String nuevaContrasena) {
    int pos = buscarUsuarioPorCedula(correo);

    if (pos == -1) {
        return "Usuario no encontrado";
    }

    usuarios[pos].nombreCompleto = nuevoNombre;
    usuarios[pos].password = nuevaContrasena;

    return "Usuario modificado correctamente";
}

public String listarVendedores() {
    String mensaje = "";

    for (int i = 0; i < cantusuario; i++) {
        if (usuarios[i].rol.equals("2")) {  
            mensaje += "Nombre completo: " + usuarios[i].nombreCompleto + "\n";
            mensaje += "Contraseña: " + usuarios[i].cedula + "\n";
            mensaje += "Correo: " + usuarios[i].email + "\n";
            mensaje += "Cédula: " + usuarios[i].password + "\n";
            mensaje += "Estado: " + "2" + "\n";
            mensaje += "-----------------------------\n";
        }
    }

    return mensaje;
}
public String suspenderVendedorPorCorreo(String correo) {
    for (int i = 0; i < cantusuario; i++) {

        
        if (usuarios[i].rol.equals("2") && usuarios[i].email.equals(correo)) {

            usuarios[i].rol = "0";  

            return "Vendedor suspendido correctamente.";
        }
    }

    return "No se encontró un vendedor con ese correo.";
}

public String modificarVendedor(String correoViejo, String nombreNuevo, String correoNuevo) {
    for (int i = 0; i < cantusuario; i++) {

        // Solo vendedores
        if (usuarios[i].rol.equals("2") && usuarios[i].email.equals(correoViejo)) {

            usuarios[i].nombreCompleto = nombreNuevo;
            usuarios[i].email = correoNuevo;

            return "Vendedor modificado correctamente.";
        }
    }

    return "No se encontró un vendedor con ese correo.";
}

public int buscarUsuarioPorCorreo(String correo) {
    for (int i = 0; i < cantusuario; i++) {
        if (usuarios[i].email.equals(correo)) {
            return i;
        }
    }
    return -1;
}
public String agregarMonto(String correo, int cantidad) {
    int pos = buscarUsuarioPorCorreo(correo);

    if (pos == -1) {
        return "No se encontró el usuario.";
    }

    usuarios[pos].dinero += cantidad;

    return "Monto agregado correctamente. Dinero actual: " + usuarios[pos].dinero;
}
public String descontarMonto(String correo, int cantidad) {
    int pos = buscarUsuarioPorCorreo(correo);

    if (pos == -1) {
        return "No se encontró el usuario.";
    }

    usuarios[pos].dinero -= cantidad;

    return "Monto descontado. Dinero actual: " + usuarios[pos].dinero;
}

    /////
    
    
    
    
    
}
