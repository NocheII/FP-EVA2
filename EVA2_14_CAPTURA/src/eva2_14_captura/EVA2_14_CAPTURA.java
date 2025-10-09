/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_14_captura;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA2_14_CAPTURA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tamaño;
        System.out.println("Cuantas calificaciones va a capturar?: ");
        tamaño = input.nextInt();
        int califa [] = new int [tamaño];
        
        for( int i = 0; i < califa.length; i++){
            System.out.println("Cual es la calficacion " + (i + 1) + " ?: ");
            califa[i] = input.nextInt();
        }
        for( int i = 0; i < califa.length; i++){
            System.out.print("{" + califa[i] + "}");
        }
        // TODO code application logic here
    }
    
}
