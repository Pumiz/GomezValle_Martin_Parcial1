/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gomezvalle_martin_parcial1;

import exceptions.InvaliCodServicioException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Gastronomia;
import model.Hospedaje;
import model.Servicio;
import model.Sistema;

/**
 *
 * @author taekw
 */
public class Main {
    public static void main(String[] args) throws InvaliCodServicioException {
        System.out.println("1-1");

        try {
            Gastronomia gastro1 = new Gastronomia("Hamburguesa criolla", 180.0, 4, "4892", 15.0, true);
            System.out.println("Gastronomia se ha creado con exito: " + gastro1);
        } catch (InvaliCodServicioException error) {
            System.out.println("Error: " + error.getMessage());
        }
         System.out.println();
         
         
         System.out.println("1-2");
        try {
            Gastronomia gastro2 = new Gastronomia("Hamburguesa criolla", 180.0, 4, "489235", 15.0, true);
            System.out.println("Gastronomia se ha creado con exito: " + gastro2);
        } catch (InvaliCodServicioException error) {
            System.out.println("Error: " + error.getMessage());
        }
         System.out.println();
         
         
         System.out.println("1-3");
         try {
              Hospedaje hospedaje1 = new Hospedaje("Cabana 3 personas", 1500.0, "2872", 10.0, true);
              System.out.println("Hospedaje creado con exito: " + hospedaje1);
         } catch (InvaliCodServicioException error) {
            System.out.println("Error: " + error.getMessage());
        }
         System.out.println();
         
         
        System.out.println("1-4");
         try {
              Hospedaje hospedaje2 = new Hospedaje("Cabana 3 personas", 1500.0, "287282", 10.0, true);
              System.out.println("Hospedaje creado con exito: " + hospedaje2);
         } catch (InvaliCodServicioException error) {
            System.out.println("Error: " + error.getMessage());
        }
         System.out.println();
         
         
        System.out.println("2-1"); 
        LocalDate dia = LocalDate.parse("2020-10-28");
        try {
            Gastronomia gastro3 = new Gastronomia("Hamburguesa criolla", 180.0, 4, "489235", 15.0, true);
            double precioFinal = gastro3.calcularPrecioFinal(dia);
            System.out.println("El precio final de la Hamburguesa es de: $" + precioFinal);
        } catch (InvaliCodServicioException error) {
            System.out.println("Error: " + error.getMessage());
        }
        System.out.println();
        
        
        System.out.println("2-2"); 
        LocalDate dia2 = LocalDate.parse("2020-10-27");
         try {
              Hospedaje hospedaje3 = new Hospedaje("Cabana 3 personas", 1500.0, "287282", 10.0, true);
              System.out.println("Hospedaje creado con exito: " + hospedaje3);
              double precioFinal2 = hospedaje3.calcularPrecioFinal(dia2);
              System.out.println("El precio final de la Cabana 3 personas es de: $" + precioFinal2);
         } catch (InvaliCodServicioException error) {
            System.out.println("Error: " + error.getMessage());
        }
        System.out.println();
        
        
        System.out.println("3"); 
        List<Servicio> listServicios = new ArrayList<>();
        Sistema sistema = new Sistema(listServicios);
         try {
              sistema.agregarGastronomia("858927", 15.0, true, "Milanesa con pure", 350.0, 3);
              
         } catch (InvaliCodServicioException error) {
            System.out.println("Error: " + error.getMessage());
         }
         
         
        try {
            sistema.agregarHospedaje("489259", 10.0, true, "Habitacion triple", 2200.0);
              
        } catch (InvaliCodServicioException error) {
            System.out.println("Error: " + error.getMessage());
        }

        try {
            sistema.agregarGastronomia("182835", 20.0, false, "Gaseosa", 120.0, 3);
        } catch (InvaliCodServicioException error) {
            System.out.println("Error: " + error.getMessage());
        }
        
        try {
            sistema.agregarHospedaje("758972", 15.0, false, "Habitacion simple", 1000.0);
        } catch (InvaliCodServicioException error) {
            System.out.println("Error: " + error.getMessage());
        }
        
        sistema.mostrarServicios();
        System.out.println();
        
        System.out.println("4-1"); 
        System.out.println(sistema.traerServicio(true));
        System.out.println();
        
        
        System.out.println("4-2"); 
        
    }
}





