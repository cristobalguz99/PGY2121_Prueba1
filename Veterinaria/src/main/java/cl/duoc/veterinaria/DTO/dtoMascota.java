/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.veterinaria.DTO;

/**
 *
 * @author cristobalguzman
 */
public class dtoMascota {
    
    protected String nombremascota;
    protected int microchip;
    protected String fechanacimiento;
    protected String especie;
    protected String raza;
    protected String descripcion;

    public dtoMascota(String nombremascota, int microchip, String fechanacimiento, String especie, String raza, String descripcion) {
        this.nombremascota = nombremascota;
        this.microchip = microchip;
        this.fechanacimiento = fechanacimiento;
        this.especie = especie;
        this.raza = raza;
        this.descripcion = descripcion;
    }

    public String getNombremascota() {
        return nombremascota;
    }

    public void setNombremascota(String nombremascota) {
        this.nombremascota = nombremascota;
    }

    public int getMicrochip() {
        return microchip;
    }

    public void setMicrochip(int microchip) {
        this.microchip = microchip;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
