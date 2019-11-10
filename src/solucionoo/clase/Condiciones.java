package solucionoo.clase;

import java.util.Arrays;

public class Condiciones {

    private int carta1, carta2, carta3;
    private int monedas;
    
    private int premio;
    
    public  Condiciones(String carta1, String carta2, String carta3){
        this.carta1= this.mostrarNumero(carta1);
        this.carta2= this.mostrarNumero(carta2);
        this.carta3= this.mostrarNumero(carta3);             
        
    }
    public int dameNumero(int index){
        if(index==1){
            return this.carta1;
        }
        if (index==2) {
            return this.carta2;
        }
        if (index==3){
            return this.carta3;
        }else
            return 1;
    }
    
    public String mostrarNumerosInt(){
        return this.carta1 + "   " + this.carta2 + "  " + this.carta3;
    }
   
    
    private int mostrarNumero(String cadena) {
        int numeroCarta = Integer.parseInt(cadena.substring(0, 2));
        return numeroCarta;
    }
     
    public int getMonedas() {
        return monedas;
    }

    public void setMonedas(int monedas) {
        this.monedas = monedas;
    }    
    
    
 
    public String mensajeGano(){
        return "Haz ganado: " + this.premio + " monedas";
    }
    
    public void darPremio(int premio){
        this.premio=premio;
        this.monedas=this.monedas+this.premio;
    }

    public boolean condicion1(int c1, int c2, int c3) {
        if (c1 == 1 && c2== 1 &&c3 == 1) {
            this.darPremio(5);
            return true;
        }else
            return false;        
    }
    
    public boolean condicion2_1(int c1, int c2, int c3) {
        if (c1 ==13 && c2 == 13 &&c3==13) {
            this.darPremio(4);
            return true;
        }else
            return false;        
    }
    public boolean condicion2_2(int c1, int c2, int c3) {
        if (c1 ==12 && c2 == 12 && c3==12) {
            this.darPremio(4);
            return true;
        }else
            return false;        
    }
    public boolean condicion2_3(int c1, int c2, int c3) {
        if (c1 ==11 && c2 == 11 && c3==11) {
            this.darPremio(5);
            return true;
        }else
            return false;        
    }
    public boolean condicion3_1(int c1, int c2, int c3) {
        if (c1>=6 && c1 !=13 && c2 == 13 && c3==13) {
            this.darPremio(4);
            return true;
        }else
            return false;        
    }
    public boolean condicion3_2(int c1, int c2, int c3) {
        if (c1>=6 && c1!=12 && c2 == 12 && c3==12) {
            this.darPremio(3);
            return true;
        }else
            return false;        
    }
    public boolean condicion3_3(int c1, int c2, int c3) {
        if (c1 >=6 && c1!=11 && c2 == 11 && c3==11) {
            this.darPremio(3);
            return true;
        }else
            return false;        
    }
    public boolean condicion4(int c1, int c2, int c3) {
        if (c1 == 1 && c2 == 5 && c3 == 10) {
            this.darPremio(2);
            return true;
        }else
            return false;        
    }
    public boolean condicion5(int c1, int c2, int c3) {
        if (c1 + 1==c2 && c2+1==c3) {
            this.darPremio(2);
            return true;
        }else
            return false;        
    }
    public boolean condicion6_1(int c1, int c2, int c3) {
        if (c1>6 && c1 <11 && c1 ==c2) {
            this.darPremio(1);
            return true;
        }else
            return false;        
    }
    public boolean condicion6_2(int c1, int c2, int c3) {
        if (c2 >6 && c2 <11 && c2 == c3) {
            this.darPremio(1);
            return true;
        }else
            return false;        
    }
    public boolean condicion7(int c1, int c2, int c3) {
        if (c1 == 3 && c2 == 6 && c3 == 9) {
            this.darPremio(1);
            return true;
        }else
            return false;        
    }
 
    
    

   

}
