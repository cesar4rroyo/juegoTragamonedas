/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solucionoo.vista;

import solucionoo.clase.Condiciones;
import solucionoo.clase.cBaraja;

/**
 *
 * @author User
 */
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cBaraja baraja = new cBaraja();
        
        String cartas[] = {baraja.sacarCarta(), baraja.sacarCarta(), baraja.sacarCarta()};
        Condiciones juegoCartas = new Condiciones(cartas[0], cartas[1], cartas[2]);
        int numeroCartas [] ={juegoCartas.dameNumero(1), juegoCartas.dameNumero(2), juegoCartas.dameNumero(2)};
        
        
        
        
        
        

        


       
    }

}
