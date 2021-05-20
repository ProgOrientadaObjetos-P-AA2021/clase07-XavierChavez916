/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author xavierchavez
 */
public class Ejecutor {

    public static void main(String[] args) {

        String nombreArchivo = "hospitales.data";

        Hospital h1 = new Hospital("Hospital Básico San Gregorio", 15, 1234.56);
        Hospital h2 = new Hospital("Hospital Clínica San Agustín", 12, 123.123);
        Hospital h3 = new Hospital("Clínica Hospital San José", 14, 1223.12);

        Hospital[] lista = {h1, h2, h3};

        EscrituraArchivoSecuencial archivo = new EscrituraArchivoSecuencial
        (nombreArchivo);

        for (int i = 0; i < lista.length; i++) {
            archivo.establecerRegistro(lista[i]);

            archivo.establecerSalida();
        }

        archivo.cerrarArchivo();

        LecturaArchivoSecuencial lectura = new LecturaArchivoSecuencial
        (nombreArchivo);
        lectura.establecerListaHospital();
        System.out.println(lectura);

    }

}
