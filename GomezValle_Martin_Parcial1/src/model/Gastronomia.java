/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import exceptions.InvaliCodServicioException;
import java.time.LocalDate;
/**
 *
 * @author taekw
 */
public class Gastronomia extends Servicio {
    private String gastronomia;
    private double precio;
    private int diaSemDesc;

    public Gastronomia(String gastronomia, double precio, int diaSemDesc, String codServicio, double porcentajeDescuento, boolean enPromocion) throws InvaliCodServicioException {
        super(codServicio, porcentajeDescuento, enPromocion);
        this.gastronomia = gastronomia;
        this.precio = precio;
        this.diaSemDesc = diaSemDesc;
    }

    public double calcularPrecioFinal(LocalDate dia) {
         // No se como saber si es un dia de semana  ;(   (Crisis)
        double precioFinal = this.precio;
        if (enPromocion) {
            double descuento = (this.precio * porcentajeDescuento) / 100;
            precioFinal = this.precio - descuento;
        }
        return precioFinal;
    }
}

