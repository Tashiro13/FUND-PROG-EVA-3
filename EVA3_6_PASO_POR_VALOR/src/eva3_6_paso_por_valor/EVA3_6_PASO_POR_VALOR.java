/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_6_paso_por_valor;

/**
 *
 * @author alex_
 */
public class EVA3_6_PASO_POR_VALOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x = 10;
        System.out.println("El valor de x en el main es " + x);
        sumarValor(x);
        System.out.println("El valor dsspues de llamer a sumarValor es " + x);
        
    }
    public static void sumarValor(int valor){
        System.out.println("El valor recibido en sumarValor es " + valor);
    valor++;
        System.out.println("El vlaor modificado es " + valor);
    }
}
