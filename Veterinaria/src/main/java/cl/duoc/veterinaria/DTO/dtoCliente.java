/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.veterinaria.DTO;

/**
 *
 * @author cristobalguzman
 */
public class dtoCliente {
    
    protected String nombre;
    protected String usuario;
    protected String contrasena;
    protected int rut;
    protected String dv;
    protected String direccion;
    protected String comuna;
    protected int telefono;
    protected String correo;
    protected boolean empresa;

    public dtoCliente(String nombre, String usuario, String contrasena, int rut, String dv, String direccion, String comuna, int telefono, String correo, boolean empresa) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.rut = rut;
        this.dv = dv;
        this.direccion = direccion;
        this.comuna = comuna;
        this.telefono = telefono;
        this.correo = correo;
        this.empresa = empresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isEmpresa() {
        return empresa;
    }

    public void setEmpresa(boolean empresa) {
        this.empresa = empresa;
    }
    
    

    @Override
    public String toString() {
        return "Cliente" + "\n nombre=" + nombre + "\n usuario=" + usuario + "\n contrasena=" + contrasena + "\n rut=" + rut + "-" + dv + "\n direccion=" + direccion + "\n comuna=" + comuna + "\n telefono=" + telefono + "\n correo=" + correo + "\n empresa=" + empresa;
    }

    
}