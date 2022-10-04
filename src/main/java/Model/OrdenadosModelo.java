/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.LinkedList;
import javax.faces.model.SelectItem;

/**
 *
 * @author aniba
 */
public class OrdenadosModelo {

    public LinkedList<SelectItem> leerOdenado() {
        LinkedList ListaConsulta = new LinkedList();
        ListaConsulta.add(new SelectItem("Precio"));
        ListaConsulta.add(new SelectItem("Año"));
        ListaConsulta.add(new SelectItem("Marca"));
        ListaConsulta.add(new SelectItem("Modelo"));
        return ListaConsulta;
    }
}
