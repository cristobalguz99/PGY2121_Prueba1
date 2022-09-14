package deportesatlas.DTO;
import java.util.Date;
//CORREGir DATE

public class ClubDeportivo {
    //Rol único otorgado por la asociación de Handball, Nombre del Club, 
    //nombre del fundador, año de fundación, País de origen, Lema, colores y valor de su suscripción.
    
    private String Rol;
    private String NombreClub;
    private String NombreFundador;
    private int AnioFundacion;
    private String PaisOrigen;
    private String Lema;
    private String ColoresClub;
    private int PrecioSuscripcion;
    
    public ClubDeportivo() {
        this.Rol = "";
        this.NombreClub = "";
        this.NombreFundador = "";
        this.AnioFundacion = 0;
        this.PaisOrigen = "";
        this.Lema = "";
        this.ColoresClub = "";
        this.PrecioSuscripcion = 0;
    }    

    public ClubDeportivo(String Rol, String NombreClub, String NombreFundador, int AnioFundacion, String PaisOrigen, String Lema, String ColoresClub, int PrecioSuscripcion) {
        this.Rol = Rol;
        this.NombreClub = NombreClub;
        this.NombreFundador = NombreFundador;
        this.AnioFundacion = AnioFundacion;
        this.PaisOrigen = PaisOrigen;
        this.Lema = Lema;
        this.ColoresClub = ColoresClub;
        this.PrecioSuscripcion = PrecioSuscripcion;
    }

    public String getRol() {
        return Rol;
    }

    public void setRol(String Rol) {
        this.Rol = Rol;
    }

    public String getNombreClub() {
        return NombreClub;
    }

    public void setNombreClub(String NombreClub) {
        this.NombreClub = NombreClub;
    }

    public String getNombreFundador() {
        return NombreFundador;
    }

    public void setNombreFundador(String NombreFundador) {
        this.NombreFundador = NombreFundador;
    }

    public int getAnioFundacion() {
        return AnioFundacion;
    }

    public void setAnioFundacion(int AnioFundacion) {
        this.AnioFundacion = AnioFundacion;
    }

    public String getPaisOrigen() {
        return PaisOrigen;
    }

    public void setPaisOrigen(String PaisOrigen) {
        this.PaisOrigen = PaisOrigen;
    }

    public String getLema() {
        return Lema;
    }

    public void setLema(String Lema) {
        this.Lema = Lema;
    }

    public String getColoresClub() {
        return ColoresClub;
    }

    public void setColoresClub(String ColoresClub) {
        this.ColoresClub = ColoresClub;
    }

    public int getPrecioSuscripcion() {
        return PrecioSuscripcion;
    }

    public void setPrecioSuscripcion(int PrecioSuscripcion) {
        this.PrecioSuscripcion = PrecioSuscripcion;
    }
    
    
    
    
}
