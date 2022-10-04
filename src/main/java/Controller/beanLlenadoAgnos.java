/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.util.LinkedList;
import javax.faces.model.SelectItem;
import Model.AgnosModelo;

/**
 *
 * @author aniba
 */
public class beanLlenadoAgnos {

    LinkedList<SelectItem> listaAgnosMenorMayor = new LinkedList();
    LinkedList<SelectItem> listaAgnosMayorMenos = new LinkedList();

    public LinkedList<SelectItem> getListaAgnosMenorMayor() {
        AgnosModelo agnosModelo = new AgnosModelo();
        LinkedList<SelectItem> listaAgnos = agnosModelo.leerAgnos();
        for (int i = 0; i < listaAgnos.size(); i++) {
            listaAgnosMenorMayor.add(listaAgnos.get(i));
        }
        return listaAgnosMenorMayor;
    }

    public LinkedList<SelectItem> getListaAgnosMayorMenos() {
        AgnosModelo agnosModelo = new AgnosModelo();
        LinkedList<SelectItem> listaAgnos = agnosModelo.leerAgnos();
        for (int i = listaAgnos.size() - 1; i >= 0; i--) {
            listaAgnosMayorMenos.add(listaAgnos.get(i));
        }
        return listaAgnosMayorMenos;
    }

}
