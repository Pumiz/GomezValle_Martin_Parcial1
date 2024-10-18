/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import exceptions.InvaliCodServicioException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Gastronomia;

/**
 *
 * @author taekw
 */
public class Sistema {

     private List<Servicio> listServicio;

     public Sistema(List<Servicio> listServicio) throws InvaliCodServicioException {
          this.listServicio = new ArrayList<>();
     }

     public void mostrarServicios() {
          System.out.println(listServicio);
     }

     public Servicio traerServicio(String codServicio) throws InvaliCodServicioException {
          for (Servicio s : this.listServicio) {
               if (s.getCodServicio().equals(codServicio)) {
                    System.out.println(s.toString());
               }
          }
     }

     public List<Servicio> traerServicio(boolean enPromocion) {
          List<Servicio> serviciosEnPromocion = new ArrayList<>();

          for (Servicio s : listServicio) {
               if (s.isEnPromocion() == enPromocion) {
                    serviciosEnPromocion.add(s);
               }
          }

          return serviciosEnPromocion;
     }

     public List<Servicio> traerServicio(boolean enPromocion, LocalDate dia) {
          for (Servicio s : this.listServicio) {
               if (s.isEnPromocion() == enPromocion) { //No se si el dia ingresado es un dia de semana ;( 
                    listServicio.add(s);
               }
          }
     }

     public boolean agregarGastronomia(String codServicio, double porcentajeDescuento, boolean enPromocion, String gastronomia, double precio, int diaSemDesc) throws InvaliCodServicioException {
          for (Servicio s : listServicio) {
               if (s.getCodServicio().equals(codServicio)) {
                    throw new InvaliCodServicioException("El codigo de servicio ya se encuentra en la lista");
               }
          }
          Gastronomia gastro = new Gastronomia(gastronomia, precio, diaSemDesc, codServicio, porcentajeDescuento, enPromocion);

          listServicio.add(gastro);
          return true;

     }

     public boolean agregarHospedaje(String codServicio, double porcentajeDescuento, boolean enPromocion, String hospedaje, double precioPorNoche) throws InvaliCodServicioException {
          for (Servicio s : listServicio) {
               if (s.getCodServicio().equals(codServicio)) {
                    throw new InvaliCodServicioException("El codigo de servicio ya se encuentra en la lista");
               }
          }
          Hospedaje hospe = new Hospedaje(hospedaje, precioPorNoche, codServicio, porcentajeDescuento, enPromocion);

          listServicio.add(hospe);
          return true;
     }

}
