/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_7_paso_por_referencia;

/**
 *
 * @author alex_
 */
public class EVA3_7_PASO_POR_REFERENCIA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arreglo = new int[10];
        System.out.println("El valor en arreglo en el main " + arreglo);
        llenararreglo(arreglo);
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print("[" + arreglo[i] + "]");
        }
        
    }
    public static void llenararreglo(int[] valores){
        System.out.println("El valor del arreglo en llamerarreglo es " + valores);
        for (int i = 0; i < valores.length; i++) {
            valores[i] = (int) (Math.random() * 100);
           
        }
    }
    
}
