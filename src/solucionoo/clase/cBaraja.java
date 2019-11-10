package solucionoo.clase;

import java.util.Random;

public class cBaraja {

    private String cartas[][] = new String[52][2];
      
    public int obtenerNumero(String cadena){
        int numeroCarta = Integer.parseInt(cadena.substring(0, 2));
        return numeroCarta;
    }
           

    public String obtenerCarta(int posicion) {
        return cartas[posicion][0];
    }

    public String obtenerEstado(int posicion) {
        return cartas[posicion][1];
    }

    public String[][] obtenerBaraja() {
        return this.cartas;
    }

    public cBaraja() {       
       
        //calcula el numero para el palo C
        for (int numero = 0; numero < 13; numero++) {
            this.cartas[numero][0] = this.defineNumero(numero + 1) + "-" + this.definePalo(1);
        }
        //calcula el numero para el palo D
        for (int numero = 13; numero < 26; numero++) {
            this.cartas[numero][0] = defineNumero(numero - 12) + "-" + definePalo(2);
        }
        //calcula el numero para el palo E
        for (int numero = 26; numero < 39; numero++) {
            this.cartas[numero][0] = defineNumero(numero - 25) + "-" + definePalo(3);
        }
        //calcula el numero para el palo T
        for (int numero = 39; numero < 52; numero++) {
            this.cartas[numero][0] = defineNumero(numero - 38) + "-" + definePalo(4);
        }             
        this.iniciarEstado();
    }

    //metodo para inicializar el estado de carta en N = no salio
    public void iniciarEstado() {
        for (int numero = 0; numero < 52; numero++) {
            this.cartas[numero][1] = "N";
        }
    }    

    //metodo para definir NUMERO de la carta
    private String defineNumero(int numerocarta) {
        if (numerocarta < 10) {
            return "0" + Integer.toString(numerocarta);
        } else {
            return Integer.toString(numerocarta);
        }
    }

    //metodo para definir LETRA que corresponde al numero del palo
    private String definePalo(int numeropalo) {
        switch (numeropalo) {
            case 1:
                return "C";
            case 2:
                return "D";
            case 3:
                return "E";
            case 4:
                return "T";
            default:
                return "";
        }
    }

    public String sacarCarta() {
        Random aleatorio = new Random();
        int posicionCarta;
        do {
            posicionCarta = (aleatorio.nextInt(52));
        } while (this.obtenerEstado(posicionCarta).equals("S"));
        if (this.actualizaEstado(posicionCarta)) {
            return this.cartas[posicionCarta][0];
        } else {
            return "**-*";
        }
    }

    private boolean actualizaEstado(int posicion) {
        try {
            this.cartas[posicion][1] = "S";
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
