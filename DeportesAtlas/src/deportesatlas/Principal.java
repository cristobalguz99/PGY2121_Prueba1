
package deportesatlas;
import deportesatlas.DTO.ClubDeportivo;
import deportesatlas.DTO.Suscripcion;
import deportesatlas.DTO.Usuario;

public class Principal {

    public static void main(String[] args) {
        int correlativoID=1000;         //avanza de 1
        int correlativoRol=10;   //avanza de 10
        
//ID, nombre completo, rut, digito verificador, fecha de nacimiento, teléfono, email, nombre de usuario y contraseña.

        Usuario User01 = new Usuario();
        
        User01.setID(correlativoID+10);
        User01.setPrimerNombre("Cristobal");
        User01.setApellidoPaterno("Guzman");
        User01.setRut(19768866, '1');
        User01.setFechaNacimiento("1999/02/23");
        User01.setEmail("crguzman@duoc.cl");
        User01.setTelefono("56996966344");        
        User01.setNombreUser("GuzmanCR");
        User01.setContrasena("holaaa2");
        
        Usuario User02 = new Usuario(); //Creamos nuevo usuario para ver si el correlativo ID es distinto y suma 10.
        User02.setID(correlativoID+10);
        System.out.println("ID Usuario 2 es: "+User02.getID());
        System.out.println("ID Usuario 1 es: "+User01.getID());
        
        
        //OBTENER EDAD
        System.out.println("Usuario 1 "+User01.getEdad());
        
        //LOGIN
        System.out.println(User01.getLogin("GuzmanCR", "Holaaa2"));
        System.out.println(User01.getLogin("guzmanCR", "Holaaa2")); //Logeamos con usuario incorrecto para probar

        
        //REINICAR CONTRASEÑA
        //System.out.println(User01.getReinciarPass("GuzmanCR", "Holaaa3"));
        //System.out.println(User01.getReinciarPass("GuzmanCR", "haaa3")); //Introducimos contrasena que no cumple requisitos a modo de prueba

        System.out.println(User01.getContrasena());
        

        
     //Rol único otorgado por la asociación de Handball, Nombre del Club, 
    //nombre del fundador, año de fundación, País de origen, Lema, colores y valor de su suscripción.
    
        ClubDeportivo Club01 = new ClubDeportivo();
        Club01.setNombreClub("ChesterUnido");
        Club01.setRol(Club01.getNombreClub(),correlativoRol++);
        System.out.println(Club01.getRol());
        
        //Creamos otro club para comprobar que el correlativo del Rol sume 1
        ClubDeportivo Club02 = new ClubDeportivo();
        Club02.setNombreClub("Universidad de Chester");
        Club02.setRol(Club02.getNombreClub(),correlativoRol++);
        System.out.println(Club02.getRol());
    
        
    }
    
}
