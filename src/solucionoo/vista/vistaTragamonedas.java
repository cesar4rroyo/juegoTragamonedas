package solucionoo.vista;
import java.util.Arrays;
import javax.swing.JOptionPane;
import solucionoo.clase.Condiciones;
import solucionoo.clase.cBaraja;
public class vistaTragamonedas {
    public static void main(String[] args) {
        cBaraja baraja = new cBaraja();
        String rpta;
        boolean seguirJugando = false;
        int monedas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de monedas: "));
        System.out.println("Tienes: " + monedas + " monedas");
        monedas = monedas - 1;
        do {
            String cartas[] = {baraja.sacarCarta(), baraja.sacarCarta(), baraja.sacarCarta()};
            System.out.println(cartas[0] + " °°°°° " + cartas[1] + " °°°°° " + cartas[2]);
            Condiciones juegoCartas = new Condiciones(cartas[0], cartas[1], cartas[2]);
            int numeroCartas[] = {juegoCartas.dameNumero(1), juegoCartas.dameNumero(2), juegoCartas.dameNumero(3)};
            juegoCartas.setMonedas(monedas);
            if (juegoCartas.condicion4(numeroCartas[0], numeroCartas[1], numeroCartas[2])) {
                System.out.println(juegoCartas.mensajeGano());
            }
            if (juegoCartas.condicion5(numeroCartas[0], numeroCartas[1], numeroCartas[2])) {
                System.out.println(juegoCartas.mensajeGano());
            }
            Arrays.sort(numeroCartas);
            if (juegoCartas.condicion1(numeroCartas[0], numeroCartas[1], numeroCartas[2])) {
                System.out.println(juegoCartas.mensajeGano());
            }
            if (juegoCartas.condicion2_1(numeroCartas[0], numeroCartas[1], numeroCartas[2])) {
                System.out.println(juegoCartas.mensajeGano());
            }
            if (juegoCartas.condicion2_2(numeroCartas[0], numeroCartas[1], numeroCartas[2])) {
                System.out.println(juegoCartas.mensajeGano());
            }
            if (juegoCartas.condicion2_3(numeroCartas[0], numeroCartas[1], numeroCartas[2])) {
                System.out.println(juegoCartas.mensajeGano());
            }
            if (juegoCartas.condicion3_1(numeroCartas[0], numeroCartas[1], numeroCartas[2])) {
                System.out.println(juegoCartas.mensajeGano());
            }
            if (juegoCartas.condicion3_2(numeroCartas[0], numeroCartas[1], numeroCartas[2])) {
                System.out.println(juegoCartas.mensajeGano());
            }
            if (juegoCartas.condicion3_3(numeroCartas[0], numeroCartas[1], numeroCartas[2])) {
                System.out.println(juegoCartas.mensajeGano());
            }
            if (juegoCartas.condicion6_1(numeroCartas[0], numeroCartas[1], numeroCartas[2])) {
                System.out.println(juegoCartas.mensajeGano());
            }
            if (juegoCartas.condicion6_2(numeroCartas[0], numeroCartas[1], numeroCartas[2])) {
                System.out.println(juegoCartas.mensajeGano());
            }
            if (juegoCartas.condicion7(numeroCartas[0], numeroCartas[1], numeroCartas[2])) {
                System.out.println(juegoCartas.mensajeGano());
            }
            rpta = (JOptionPane.showInputDialog("Desea Continuar Mascota: (Si/No)")).toUpperCase();
            System.out.println("==================Tienes: " + juegoCartas.getMonedas() + "=======================");
            monedas = juegoCartas.getMonedas() - 1;
            baraja.iniciarEstado();
            if (rpta.equalsIgnoreCase("No")) {
                seguirJugando = true;
                System.out.println("El juego ha finalizado, claro p ");
                break;
            }
            if (monedas == 0) {
                seguirJugando = true;
                System.out.println("Ya no tienes mas monedas, el Juego Ha finalizado");
            }
        } while (!seguirJugando);

    }

}
