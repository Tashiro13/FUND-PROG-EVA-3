/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eva3_2_factorial;

import java.util.Scanner;

/**
 *
 * @author invitado
 */
public class EVA3_2_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("El factorial de 5 es = " + calcularfactorial(5));
        System.out.println("5 elevado a la 3 = " + calcularpotencia(5,3));
    }
    public static int calcularfactorial(int num){
        int resu = 1;
        for (int i = 1; i <= num; i++) {
            resu *= i;   
        }
        return resu;
    }
    public static int calcularpotencia(int base, int exp){
    Scanner input = new Scanner(System.in);
        int resu = 1;
        for (int i = 0; i <= exp; i++) {
            resu *= base;
        }
    return resu;
    
    }
}
