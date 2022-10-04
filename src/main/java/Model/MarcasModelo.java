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
public class MarcasModelo {

    public LinkedList<SelectItem> leerMarcas() {

        LinkedList ListaConsulta = new LinkedList();
        ListaConsulta.add(new SelectItem("No importa"));
        ListaConsulta.add(new SelectItem("Toyota"));
        ListaConsulta.add(new SelectItem("Renault"));
        return ListaConsulta;
    }
}
