
package deportesatlas;
import deportesatlas.DTO.ClubDeportivo;
import deportesatlas.DTO.Suscripcion;
import deportesatlas.DTO.Usuario;
import java.util.Date;

public class Principal {

    public static void main(String[] args) {
        int correlativoID=1000;
        int correlativoRol=10;
        
        Usuario User01 = new Usuario();
        
        User01.setID(correlativoID+10);
        User01.setPrimerNombre("Cristobal");
        User01.setSegundoNombre("Alexis");
        User01.setApellidoPaterno("Guzman");
        User01.setApellidoMaterno("Lorca");
        User01.setRut(19768866, '1');
        User01.setFechaNacimiento("1999/02/23");
        User01.setEmail("crguzman@duoc.cl");
        User01.setTelefono("56996966344");        
        User01.setNombreUser("GuzmanCR");
        User01.setContrasena("Holaaa2");

        //VALIDAR RUT
        User01.validarRut(19768866, '1');
        
        //OBTENER EDAD USUARIO 
        System.out.println("Usuario 1 "+User01.Edad());
        
        //LOGIN
        System.out.println(User01.Login("GuzmanCR", "Holaaa2"));
        System.out.println(User01.Login("guzmanCR", "Holaaa2")); //Logeamos con usuario incorrecto para probar
        
        //REINICAR CONTRASEÑA
        System.out.println(User01.ReinciarPass("GuzmanCR", "Holaaa3"));
        System.out.println(User01.ReinciarPass("GuzmanCR", "haaa3")); //Introducimos contrasena que no cumple requisitos a modo de prueba
        System.out.println(User01.getContrasena());//Contraseña actualizada
        
        //----------------------------------------------------------------------
        ClubDeportivo Club01 = new ClubDeportivo();
        
        Club01.setNombreClub("ChesterUnido");
        Club01.setRol(correlativoRol++);
        Club01.setColoresClub("Blanco, Rojo");
        Club01.setNombreFundador("Benito Juarez");
        Club01.setAnioFundacion(1969);
        Club01.setPaisOrigen("Chilezuela");
        Club01.setLema("Dar hasta que duela");
        Club01.setPrecioSuscripcion(13990);
        
        //ROL
        System.out.println(Club01.getRol());
        
        //ACTUALIZAR NOMBRE
        Club01.ActualizarNombre("Rocky");
        System.out.println(Club01.getNombreClub());
        
        //ROL ACTUALIZADO
        Club01.setRol(correlativoRol++);
        System.out.println(Club01.getRol());
        
        //CONCATENAR COLORES EQUIPOS
        ClubDeportivo Club02 = new ClubDeportivo();
        Club02.setColoresClub("Blanco, azul y rojo");
        System.out.println(Club01.ConcatenaColor(Club02));
        
        //----------------------------------------------------------------------
        
        Suscripcion Suscripcion01 = new Suscripcion();
        
        Suscripcion01.setNumeroSuscripcion(100);
        Suscripcion01.setUsuario(User01);
        Suscripcion01.setClubDeportivo(Club01);
        Suscripcion01.setInicioSuscripcion(new Date());
        Suscripcion01.setPagoTotal(0);

    }
}
