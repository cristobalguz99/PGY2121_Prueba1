/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.veterinaria.Utils;

/**
 *
 * @author cristobalguzman
 */
public class Validaciones {
    
    public Boolean ValidarLargoString(int cantidad, String str){
        return str.length()>cantidad;
    }
    
    public boolean ValidarNombre(String nombre, String user, String direc){
        if((nombre.length()>0)&&(user.length()>0)&&(direc.length()>0)){
            return true;
        }
        else{
            return false;
        }           
    }    
    public boolean ValidarEmail(String email){
        if(email.contains("@") && (email.endsWith(".com") ||  email.endsWith(".cl"))){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean validaRut(int rut, String dv) {
        boolean validacion = false;
        try {
            int m = 0, s = 1;
            for (; rut != 0; rut /= 10) {
                s = (s + rut % 10 * (9 - m++ % 6)) % 11;
            }
            if (1 == dv.length()) {
                validacion = true;
            }

        } catch (java.lang.NumberFormatException e) {
        } catch (Exception e) {
        }
        return validacion;
    }
    
    public boolean validarTelefono(int telefono){
        if(telefono>0 && telefono<1000000000){
            
                return true;
        }else{
            return false;
        }            
        
    }
}    

