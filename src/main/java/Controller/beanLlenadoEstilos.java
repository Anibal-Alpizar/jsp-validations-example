/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.LinkedList;
import javax.faces.model.SelectItem;
import Model.EstilosModelo;

/**
 *
 * @author aniba
 */
public class beanLlenadoEstilos {

    LinkedList<SelectItem> listaEstilos = new LinkedList();

    public LinkedList<SelectItem> getListaEstilos() {

        EstilosModelo objEstilosModelo = new EstilosModelo();
        return objEstilosModelo.leerEstilos();
    }
}
