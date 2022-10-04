/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

/**
 *
 * @author aniba
 */
public class VehiculoBean {

    String modelo;
    String mensaje;

    int precioInicial;
    int precioFinal;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void metodoVerNulos() {
        if (modelo.isEmpty() || precioFinal == 0 || precioInicial < 0 || precioInicial > 9999999.99) {
            this.mensaje = "Verificar campos nulos\nEl precio final no puede ser 0\nEl precio no puede ser mayor a 9999999.99 ";
        } else {
            this.mensaje = "Bien";
        }
    }

    public int getPrecioInicial() {
        return precioInicial;
    }

    public void setPrecioInicial(int precioInicial) {
        this.precioInicial = precioInicial;
    }

    public int getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(int precioFinal) {
        this.precioFinal = precioFinal;
    }

}
