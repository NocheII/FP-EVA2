/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_9_for;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA2_9_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, rep;
        String mensaje;
        System.out.println("Mensaje a repetir: ");
        mensaje = input.nextLine();
        System.out.println("Cantidad de repeticiones: ");
        rep = input.nextInt();
        for(i = 1; i <= rep; i++){
        System.out.println(mensaje);
    }
        // TODO code application logic here
    }
    
}
