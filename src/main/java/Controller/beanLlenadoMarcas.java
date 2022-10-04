/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.LinkedList;
import javax.faces.model.SelectItem;
import Model.MarcasModelo;

/**
 *
 * @author aniba
 */
public class beanLlenadoMarcas {

    LinkedList<SelectItem> listaMarcas = new LinkedList();

    public LinkedList<SelectItem> getListaMarcas() {
        MarcasModelo objListaMarcasModel = new MarcasModelo();
        return objListaMarcasModel.leerMarcas();
    }

}
