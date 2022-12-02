/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package cl.duoc.veterinaria.Services;

import cl.duoc.veterinaria.DTO.dtoCliente;
import java.util.ArrayList;

/**
 *
 * @author cristobalguzman
 */
public interface IListCliente {
    
    public ArrayList<dtoCliente> ListarClientes();
    public void GuardarCliente(dtoCliente Cliente);
        
    
    
}
