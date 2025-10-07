/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva2_10_for;
import java.util.Scanner;
/**
 *
 * @author Moren
 */
public class EVA2_10_FOR {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int i, Inicio,Fin, NumTabla;
        for (i = 1; i <= 20; i++){
            System.out.print(i + "-");
        }
        System.out.println("");
        // TODO code application logic here
        
        for (i = 0; i <= 100; i+=2){
            System.out.print(i + "-");
        }
        System.out.println("");
        for (i = 100; i >= 0; i-=2){
            System.out.print(i + "-");
        }
        System.out.println("");
        for (i = 100; i >= 0; i-=2){
            System.out.print(i + "-");
        }
        System.out.println("");
        
        System.out.println("Introduce el numero donde inicia: ");
        Inicio = input.nextInt();
        System.out.println("Introduce el numero donde Termina: ");
        Fin = input.nextInt();
        
        for (i = Inicio; i <= Fin; i++){
            System.out.print(i + "-");
        }
        System.out.println("");
        
        System.out.println("Que tabla de multiplicar deseas ver? ");
        NumTabla = input.nextInt();
        
        for (i = 1; i <= 10; i++){
            System.out.println(i + "x" + NumTabla + "=" + NumTabla*i);
        }
        
    }
    
}
