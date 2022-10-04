/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.LinkedList;
import javax.faces.model.SelectItem;
import Model.OrdenadosModelo;

/**
 *
 * @author aniba
 */
public class beanLlenadoOrdenados {

    public LinkedList<SelectItem> getListaOrdenados() {
        OrdenadosModelo obOrdenadosModelo = new OrdenadosModelo();
        return obOrdenadosModelo.leerOdenado();
    }
}
