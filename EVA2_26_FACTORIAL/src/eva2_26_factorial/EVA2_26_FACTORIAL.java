/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_26_factorial;

import java.util.Scanner;

/**
 *
 * @author Moren
 */
public class EVA2_26_FACTORIAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor, factorial = 1;
       
        System.out.println("Ingrese el valor: ");
        valor = input.nextInt();
        
        for (int i = 1; i <= valor; i++){
            factorial = factorial * i;
        }
        System.out.println("El factorial de " + valor + " es: " + factorial);
        // TODO code application logic here
    }
    
}
