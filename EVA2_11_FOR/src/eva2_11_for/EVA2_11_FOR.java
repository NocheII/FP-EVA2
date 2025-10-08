    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_11_for;
import java.util.Scanner; 
/**
 *
 * @author Moren
 */
public class EVA2_11_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, Inicio, Fin, resi;
        System.out.println("Introduce el numero donde inicia: ");
        Inicio = input.nextInt();
        System.out.println("Introduce el numero donde Termina: ");
        Fin = input.nextInt();
        
        for (i = Inicio; i <= Fin; i++){
            resi = i % 2;
            if (resi == 0){
                System.out.print(i + "-");
                
            }
        }
        // TODO code application logic here
    }
    
}
