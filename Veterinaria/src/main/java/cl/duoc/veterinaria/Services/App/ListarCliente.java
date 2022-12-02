/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cl.duoc.veterinaria.Services.App;

import cl.duoc.veterinaria.DTO.dtoCliente;
import cl.duoc.veterinaria.Services.IListCliente;
import java.util.ArrayList;

/**
 *
 * @author cristobalguzman
 */
public class ListarCliente implements IListCliente{
    
    private ArrayList<dtoCliente> Lista;
    
    public ListarCliente(){
        this.Lista = new ArrayList();
    }
    

    @Override
    public ArrayList<dtoCliente> ListarClientes() {
        return Lista;  
    }

    @Override
    public void GuardarCliente(dtoCliente Cliente) {
        Lista.add(Cliente);
    }
    
    
    
}
