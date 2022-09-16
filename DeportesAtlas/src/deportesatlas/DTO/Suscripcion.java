package deportesatlas.DTO;
import java.util.Date;

public class Suscripcion {

    private int NumeroSuscripcion;
    private Usuario Usuario;
    private Date InicioSuscripcion;
    private String ClubDeportivo;
    private int PagoTotal;

    public Suscripcion(int NumeroSuscripcion, Usuario Usuario, Date InicioSuscripcion, String ClubDeportivo, int PagoTotal) {
        this.NumeroSuscripcion = NumeroSuscripcion;
        this.Usuario = Usuario;
        this.InicioSuscripcion = InicioSuscripcion;
        this.ClubDeportivo = ClubDeportivo;
        this.PagoTotal = PagoTotal;
    }
    
    public Suscripcion(){
        this.NumeroSuscripcion = 0;
        this.Usuario = new Usuario();
        this.InicioSuscripcion = new Date();
        this.ClubDeportivo = "";
        this.PagoTotal = 0;
    }

    public int getNumeroSuscripcion() {
        return NumeroSuscripcion;
    }

    public void setNumeroSuscripcion(int NumeroSuscripcion) {
        if(NumeroSuscripcion>0){
            this.NumeroSuscripcion = NumeroSuscripcion;
        }
    }

    public Usuario getUsuario() {
        return Usuario;
    }

    public void setUsuario(Usuario Usuario) {
        this.Usuario = Usuario;
    }

    public Date getInicioSuscripcion() {
        return InicioSuscripcion;
    }

    public void setInicioSuscripcion(Date InicioSuscripcion) {
        this.InicioSuscripcion = InicioSuscripcion;
    }

    public String getClubDeportivo() {
        return ClubDeportivo;
    }

    public void setClubDeportivo(String ClubDeportivo) {
        this.ClubDeportivo = ClubDeportivo;
    }

    public int getPagoTotal() {
        return PagoTotal;
    }

    public void setPagoTotal(int PagoTotal) {
        if(PagoTotal>0){
            this.PagoTotal = PagoTotal;
        }    
    }

    //METODO AGREGAR CLUB A SUSCRIPCION, ACTUALIZA EL PRECIO TOTAL Y AGREGA EL ROL DEL EQUIPO
    public void agregarClubDeportivo(ClubDeportivo club){
        if(this.ClubDeportivo == null){
            this.ClubDeportivo = "";
        }
        if(!this.ClubDeportivo.equals("")){
            this.ClubDeportivo += "; ";
        }
        this.ClubDeportivo += club.FormatoSuscripcion();
        this.PagoTotal += club.getPrecioSuscripcion();
    }    
    
    @Override
    public String toString() {
        return "Suscripcion \n Numero: " + NumeroSuscripcion + 
                "\n Usuario: " + Usuario.FormatoSuscripcion() + 
                "\n FechaInicio: " + InicioSuscripcion + 
                "\n AbonoTotal: " + PagoTotal + 
                "\n Equipos: " + ClubDeportivo; 
    }      
}
