/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_6_arreglos_string_2;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA2_6_ARREGLOS_STRING_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dia;
        String diasemana[] = {"Domingo","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"};
        System.out.println("Introduce el dia en numero (0 al 6):");
        dia = input.nextInt();
        System.out.println("El dia es: " + diasemana[dia]);
        
        // TODO code application logic here
    }
    
}
