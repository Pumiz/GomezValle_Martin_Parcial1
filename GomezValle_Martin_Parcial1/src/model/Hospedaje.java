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
public class Hospedaje extends Servicio{
     private String hospedaje;
     private double precioPorNoche;

     public Hospedaje(String hospedaje, double precioPorNoche, String codServicio, double porcentajeDescuento, boolean enPromocion) throws InvaliCodServicioException{
          super(codServicio, porcentajeDescuento, enPromocion);
          this.hospedaje = hospedaje;
          this.precioPorNoche = precioPorNoche;
     }
     
     public double calcularPrecioFinal(LocalDate dia){
         // No se como saber si es un dia de semana  ;(   (Crisis)
          double precioFinal = this.precioPorNoche;
                 
         //Condicion del dia        
         double descuento = (this.precioPorNoche * porcentajeDescuento) / 100;
         precioFinal = this.precioPorNoche - descuento;
         
         
         return precioFinal;
     }
     
}
