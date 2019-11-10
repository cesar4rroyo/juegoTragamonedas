package solucion;

import java.util.Random;
import java.util.Scanner;

public class tragamonedas 
{
    public static void main(String[] args) 
    {
        Random aleatorio = new Random();
        String carta1 ="";
        String carta2 ="";
        String carta3 ="";
        Scanner teclado = new Scanner(System.in);
        System.out.print("Monedas ::: ");
        int monedas;
        do{
            monedas = teclado.nextInt();
        }while(monedas<=0);
        
        do{
            //numero de la carta
            int numero1 = aleatorio.nextInt(13)+1;
            int numero2 = aleatorio.nextInt(13)+1;
            int numero3 = aleatorio.nextInt(13)+1;
            //palo de la carta
            int palo1 = aleatorio.nextInt(4)+1;
            //aca se evaluara el duplicado con carta1
            int palo2 = aleatorio.nextInt(4)+1;            
            //aca se evaluara el duplicado con carta1 o con carta2
            int palo3 = aleatorio.nextInt(4)+1;            
            switch(palo1)
            {
                case 1:
                    carta1 = numero1 + "C";
                    break;
                case 2:
                    carta1 = numero1 + "D";
                    break;
                case 3:
                    carta1 = numero1 + "E";
                    break;
                case 4:
                    carta1 = numero1 + "T";
                    break;
            }
            switch(palo2)
            {
                case 1:
                    carta2 = numero2 + "C";
                    break;
                case 2:
                    carta2 = numero2 + "D";
                    break;
                case 3:
                    carta2 = numero2 + "E";
                    break;
                case 4:
                    carta2 = numero2 + "T";
                    break;
            } 
            switch(palo3)
            {
                case 1:
                    carta3 = numero3 + "C";
                    break;
                case 2:
                    carta3 = numero3 + "D";
                    break;
                case 3:
                    carta3 = numero3 + "E";
                    break;
                case 4:
                    carta3 = numero3 + "T";
                    break;
            }
            monedas--;
            System.out.println(carta1 + "--" + carta2 + "--" + carta3);
            //aqui van las condiciones
            //si son tres 1 : ganas 5 monedas
            if(numero1 == 1 &&  numero2 == 1 && numero3 == 1)
            {
                monedas = monedas + 5;
                System.out.println("Felicitaciones :: tres 1s -- ganas 5 monedas");
            }
            //si son tres 13 o tres 12 o tres 11 : ganas 4 monedas
            if((numero1 == 13 &&  numero2 == 13 && numero3 == 13) || 
                (numero1 == 12 &&  numero2 == 12 && numero3 == 12) ||
                (numero1 == 11 &&  numero2 == 11 && numero3 == 11))
            {
                monedas = monedas + 4;
                System.out.println("Felicitaciones :: tres 13s o tres 12s o tres 11s -- ganas 4 monedas");
            }
            
            System.out.println("Acumulas :: " + monedas);            
            System.out.print("Continuas (Si/No)");
            if(teclado.next().toLowerCase().equals("no"))
                monedas = 0;
        }while(monedas!=0);
    }
}
