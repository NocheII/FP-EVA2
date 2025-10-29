/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_19_do_while;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA2_19_DO_WHILE {
    final static String USUARIO = "Carlos";
    final static String PSWD = "1234";

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Usuario, Contra;
        
        do{
            System.out.println ("Usuario: ");
            Usuario = input.nextLine();

            System.out.println ("Contraseña: ");
            Contra = input.nextLine();
            
        }while(!(Usuario.equals(USUARIO)&& Contra.equals(PSWD)));
            if (Usuario.equals(USUARIO)&& Contra.equals(PSWD))
                System.out.println ("Acceso concedido");
            else
                System.out.println ("Acceso denegado");
            
        // TODO code application logic here
    }
    
}
