/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_2_switch;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA2_2_SWITCH {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int opc;
        System.out.println("Bienvenido");
        System.out.println("1. Consultar saldo ");
        System.out.println("2. Retirar dinero ");
        System.out.println("3. Depositar dinero ");
        opc = input.nextInt();
        switch(opc){
            case 1:
                System.out.println("Eligio imprimir saldo");
                break;
            case 2:
                System.out.println("Eligio retirar monto");
                break;
            case 3:
                System.out.println("Eligio depositar monto");
                break;
            default:
                System.out.println("opcion incorrecta");
        }
        
        
            
    }
    
}
