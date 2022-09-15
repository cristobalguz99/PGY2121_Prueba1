package deportesatlas.DTO;
import java.util.Date;
import java.time.Period;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Usuario {
    //ID, nombre completo, rut, digito verificador, fecha de nacimiento, teléfono, email, nombre de usuario y contraseña.
    
    private int ID;
    private String PrimerNombre;
    private String SegundoNombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int Rut;
    private String Dv;
    private String FechaNacimiento;
    private String Telefono;
    private String Email;
    private String NombreUser;
    private String Contrasena;
    
    public Usuario() {
        this.ID = 0;
        this.PrimerNombre = "";
        this.SegundoNombre = "";
        this.ApellidoPaterno = "";
        this.ApellidoMaterno = "";
        this.Rut = 0;
        this.Dv = "";
        this.FechaNacimiento = "";
        this.Telefono = "";
        this.Email = "";
        this.NombreUser = "";
        this.Contrasena = "";
    }    

    public Usuario(int ID, String PrimerNombre, String SegundoNombre, String ApellidoPaterno, String ApellidoMaterno, int Rut, String Dv, String FechaNacimiento, String Telefono, String Email, String NombreUser, String Contrasena) {
        this.ID = ID;
        this.PrimerNombre = PrimerNombre;
        this.SegundoNombre = SegundoNombre;
        this.ApellidoPaterno = ApellidoPaterno;
        this.ApellidoMaterno = ApellidoMaterno;
        this.Rut = Rut;
        this.Dv = Dv;
        this.FechaNacimiento = FechaNacimiento;
        this.Telefono = Telefono;
        this.Email = Email;
        this.NombreUser = NombreUser;
        this.Contrasena = Contrasena;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPrimerNombre() {
        return PrimerNombre;
    }

    public void setPrimerNombre(String PrimerNombre) {
        this.PrimerNombre = PrimerNombre;
    }

    public String getSegundoNombre() {
        return SegundoNombre;
    }

    public void setSegundoNombre(String SegundoNombre) {
        this.SegundoNombre = SegundoNombre;
    }

    public String getApellidoPaterno() {
        return ApellidoPaterno;
    }

    public void setApellidoPaterno(String ApellidoPaterno) {
        this.ApellidoPaterno = ApellidoPaterno;
    }

    public String getApellidoMaterno() {
        return ApellidoMaterno;
    }

    public void setApellidoMaterno(String ApellidoMaterno) {
        this.ApellidoMaterno = ApellidoMaterno;
    }

    public int getRut() {
        return Rut;
    }

    public void setRut(int Rut, char Dv) {
        if(this.validarRut(Rut, Dv)){
            this.Rut = Rut;
            this.Dv = Dv+"";
        }
    }        

    public String getDv() {
        return Dv;
    }

    public String getFechaNacimiento() {
        return FechaNacimiento;
    }

    //LA FOX CON LAS FECHAS :(
    public void setFechaNacimiento(String FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    
    }

    public String getTelefono() {
        return Telefono;
    }
        
    public void setTelefono(String Telefono) {
        if(Telefono.length()>=8 && Telefono.startsWith("56")){
            this.Telefono = Telefono; 
        }        
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        if(Email.contains("@") && Email.contains(".")){
           this.Email = Email; 
           //Como hacer para verificar que existan caracteres despues del Punto
        }
    }

    public String getNombreUser() {
        return NombreUser;
    }

    public void setNombreUser(String NombreUser) {
        if(NombreUser.length() >= 4){
            this.NombreUser=NombreUser;
        }
    }

    public String getContrasena() {
        return Contrasena;
    }

    public void setContrasena(String Contrasena) {
        int mayuscula=0;
        int numero=0;
        for (int i=0; i<Contrasena.length(); i++){
            char c = Contrasena.charAt(i);
            if(c>=97 && c<=122){
                mayuscula++;
            }else if(Character.isDigit(c)){
                numero++;
            }
        }
        if(mayuscula>0 && numero>0 && Contrasena.length()>6){
                this.Contrasena = Contrasena;
        }
}
    
    public boolean validarRut(int rut, char dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }    
       
    //METODO OBTENER EDAD----------------------------
    public String getEdad(){
        LocalDate FechaActual = LocalDate.now();
        DateTimeFormatter FormatoFecha = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate FechaNacFormato = LocalDate.parse(FechaNacimiento, FormatoFecha);
        Period Edad = Period.between(FechaNacFormato, FechaActual);
        return "La edad es: "+Edad.getYears()+" años "+Edad.getMonths()+" meses "+Edad.getDays()+" dias.";
    }
    
    //METODO LOGIN
    public String getLogin(String NombreUser, String Contrasena){
        if (NombreUser.equals(this.NombreUser) && Contrasena.equals(this.Contrasena)){
            return "Logeado Correctamente";
        }else{
            return "User o Pass Incorrecta";
        }
    }
    
    //METODO REINICIAR CONTRASENA
    //LO SIENTO X REPETIR CODIGO PERO PARA INGRESAR EL SET CONTRASENA DECIA QUE NO DEBIA SER ESTATICO Y NOSE COMO CAMBIARLO :(
    public String getReinciarPass(String NombreUser, String NuevaContrasena){
        if(NombreUser.equals(this.NombreUser)){
            int mayuscula=0;
            int numero=0;
            for (int i=0; i<NuevaContrasena.length(); i++){
                char c = NuevaContrasena.charAt(i);
                if(c>=97 && c<=122){
                    mayuscula++;
                }else if(Character.isDigit(c)){
                    numero++;
                }
            }
            if(mayuscula>0 && numero>0 && NuevaContrasena.length()>6){
                    this.Contrasena = NuevaContrasena;
                    return "Contrasena Actualizada";
            }else{
                System.out.println("Contrasena no cumple requisitos");
            }
        }
        return "Nombre Usuario Incorrecto";
    }
}
