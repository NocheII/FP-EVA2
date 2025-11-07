/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_27_cuenta;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA2_27_CUENTA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int valor;
        int cuenta = 1000000;
        
        do{
            System.out.println("Cantidad a retirar: ");
            valor = input.nextInt();
            cuenta = cuenta - valor;
        }while(cuenta > 0);
        System.out.println("Su saldo es de: " + cuenta);
        // TODO code application logic here
    }
    
}
