/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_21_break;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA2_21_BREAK {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num, adivinar;
        
        adivinar = (int)(Math.random() * 5) + 1;
        
        while(true){
            System.out.println ("Adivina el numero: (-1 para salir del juego)");
            num = input.nextInt();
            if (num == -1){
                System.out.println ("gracias por jugar");
                break;
            }else if (num == adivinar){
                System.out.println ("Ganaste, gracias por jugar");
                break;
            }
        }
        
        
        
        // TODO code application logic here
    }
    
}
