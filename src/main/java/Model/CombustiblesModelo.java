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
public class CombustiblesModelo {

    public LinkedList<SelectItem> leerCombustibles() {
        LinkedList listaConsulta = new LinkedList();
        listaConsulta.add(new SelectItem("No importa"));
        listaConsulta.add(new SelectItem("Gasolina"));
        listaConsulta.add(new SelectItem("Diesel"));

        return listaConsulta;

    }

}
