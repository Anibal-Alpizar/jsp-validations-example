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
public class AgnosModelo {

    public LinkedList<SelectItem> leerAgnos() {
        LinkedList ListaConsulta = new LinkedList();
        //para no tener que digitar uno por uno
        //años del 1960 hasta el 2012
        for (int i = 1960; i <= 2012; i++) {
            ListaConsulta.add(new SelectItem(i, String.valueOf(i)));
        }
        return ListaConsulta;
    }
}
