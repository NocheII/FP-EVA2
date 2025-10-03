/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_5_arreglos_string;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA2_5_ARREGLOS_STRING {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia;
        String diasemana[] = new String[7];
        diasemana[0] = "Domingo";
        diasemana[1] = "Lunes";
        diasemana[2] = "Martes";
        diasemana[3] = "Miercoles";
        diasemana[4] = "Jueves";
        diasemana[5] = "Viernes";
        diasemana[6] = "Sabado";
        System.out.println("Intruduce el dia en numero (0 al 6):");
        dia = input.nextInt();
        System.out.println("El dia es " + diasemana[dia]);
        // TODO code application logic here
    }
    
}
