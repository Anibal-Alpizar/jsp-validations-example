/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.LinkedList;
import javax.faces.model.SelectItem;
import Model.FinanciamientosModelo;

/**
 *
 * @author aniba
 */
public class beanLlenadoFinanciamientos {

    public LinkedList<SelectItem> getListaFinanciamientos() {
        FinanciamientosModelo objFinanciamientosModelo = new FinanciamientosModelo();
        return objFinanciamientosModelo.leerFinanciamiento();
    }
}
