/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.LinkedList;
import javax.faces.model.SelectItem;
import Model.CombustiblesModelo;

/**
 *
 * @author aniba
 */
public class beanLlenadoCombustibles {

    LinkedList<SelectItem> listaCombustibles = new LinkedList();

    public LinkedList<SelectItem> getListaCombustible() {

        CombustiblesModelo objCombustiblesModelo = new CombustiblesModelo();
        return objCombustiblesModelo.leerCombustibles();
    }

}
