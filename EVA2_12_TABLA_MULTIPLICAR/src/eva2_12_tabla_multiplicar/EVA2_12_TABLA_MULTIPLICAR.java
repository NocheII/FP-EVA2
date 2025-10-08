/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_12_tabla_multiplicar;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA2_12_TABLA_MULTIPLICAR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, NumTabla;
        System.out.println("Que tabla de multiplicar deseas ver? ");
        NumTabla = input.nextInt();
        
        for (i = 1; i <= 10; i++){
            System.out.println(i + "x" + NumTabla + "=" + NumTabla*i);
        }
        
        // TODO code application logic here
    }
    
}
