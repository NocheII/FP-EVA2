/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_29_contra_for;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA2_29_CONTRA_FOR {
    final static String USUARIO = "Carlos";
    final static String PSWD = "1234";
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String Usuario, Contra;
        
        for (int i = 4; i >= 0; i--){
            System.out.println ("Usuario: ");
            Usuario = input.nextLine();

            System.out.println ("Contraseña: ");
            Contra = input.nextLine();
            
            if(Usuario.equals(USUARIO)&& Contra.equals(PSWD)){
                System.out.println ("Acceso concedido");
                break;
            }else{
                System.out.println ("Acceso denegado");
            }
            
            if(i == 0){
               System.out.println ("Numero maximo de intentos, intentelo mas tarde");
            }else{
               System.out.println ("");
            }
            
        }
       
        // TODO code application logic here
    }
    
}
