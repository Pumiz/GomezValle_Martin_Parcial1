/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import exceptions.InvaliCodServicioException;
import java.time.LocalDateTime;
import java.time.LocalDate;

/**
 *
 * @author taekw
 */

public abstract class Servicio {
     protected String codServicio;
     protected double porcentajeDescuento;
     protected boolean enPromocion;

     public Servicio(String codServicio, double porcentajeDescuento, boolean enPromocion) throws InvaliCodServicioException {
          validateCodServicio(codServicio);
          this.codServicio = codServicio;
          this.porcentajeDescuento = porcentajeDescuento;
          this.enPromocion = enPromocion;
     }
     
     private void validateCodServicio (String codServicio) throws InvaliCodServicioException {
          if (codServicio.length() != 6){
               throw new InvaliCodServicioException("El codigo de servicio es invalido!");
          }
          

          
     } 
     
     public abstract double calcularPrecioFinal(LocalDate dia);


     public String getCodServicio() {
          return codServicio;
     }
     
     public boolean isEnPromocion() {
          return enPromocion;
     }

     @Override
     public String toString() {
          return "Servicio{" + "codServicio=" + codServicio + ", porcentajeDescuento=" + porcentajeDescuento + ", enPromocion=" + enPromocion + '}';
     }
            
     
     
}
