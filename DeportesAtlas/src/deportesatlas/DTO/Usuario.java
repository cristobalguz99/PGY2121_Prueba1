package deportesatlas.DTO;
import java.util.Date;

public class Usuario {
    //ID, nombre completo, rut, digito verificador, fecha de nacimiento, teléfono, email, nombre de usuario y contraseña.
    
    private int ID;
    private String PrimerNombre;
    private String SegundoNombre;
    private String ApellidoPaterno;
    private String ApellidoMaterno;
    private int Rut;
    private String Dv;
    private Date FechaNacimiento;
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
        this.FechaNacimiento = new Date();
        this.Telefono = "";
        this.Email = "";
        this.NombreUser = "";
        this.Contrasena = "";
    }    

    public Usuario(int ID, String PrimerNombre, String SegundoNombre, String ApellidoPaterno, String ApellidoMaterno, int Rut, String Dv, Date FechaNacimiento, String Telefono, String Email, String NombreUser, String Contrasena) {
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

    public void setRut(int Rut) {
        this.Rut = Rut;
    }

    public String getDv() {
        return Dv;
    }

    public void setDv(String Dv) {
        this.Dv = Dv;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
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

    public void setContrasena(String Contrasena) {//Rexito
        int mayuscula=0;
        int numero=0;
        for (int i=0; i<Contrasena.length(); i++){
            char c = Contrasena.charAt(i);
            if(c>=97 && c<=122){
                mayuscula++;
            }
            if(Character.isDigit(c)){
                numero++;
            }
            if(mayuscula>0 && numero>0 && Contrasena.length()>6){
                this.Contrasena = Contrasena;
            }
        } 
    }
    


}
