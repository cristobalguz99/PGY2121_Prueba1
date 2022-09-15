package deportesatlas.DTO;
import java.util.Date;

public class Suscripcion {
    //Usuario, fecha de inicio de la suscripción, valor de la suscripción***YA ESTA EN CLUB DEPORTIVOS, SE CREA DENUEVO???
    // equipos al que se está suscrito 
    //y abono total por concepto de pagos, además de un correlativo de la venta
    
    private int NumeroSuscripcion;
    private Usuario Usuario;
    private Date InicioSuscripcion;
    private ClubDeportivo ClubDeportivo;
    private int PagoTotal;

    public Suscripcion(int NumeroSuscripcion, Usuario Usuario, Date InicioSuscripcion, ClubDeportivo ClubDeportivo, int PagoTotal) {
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
        this.ClubDeportivo = new ClubDeportivo();
        this.PagoTotal = 0;
    }

    public int getNumeroSuscripcion() {
        return NumeroSuscripcion;
    }

    public void setNumeroSuscripcion(int NumeroSuscripcion) {
        this.NumeroSuscripcion = NumeroSuscripcion;
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

    public ClubDeportivo getClubDeportivo() {
        return ClubDeportivo;
    }

    public void setClubDeportivo(ClubDeportivo ClubDeportivo) {
        this.ClubDeportivo = ClubDeportivo;
    }

    public int getPagoTotal() {
        return PagoTotal;
    }

    public void setPagoTotal(int PagoTotal) {
        this.PagoTotal = PagoTotal;
    }
     
}
