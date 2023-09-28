/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema_votaciones2;

import java.util.Scanner;

/**
 *
 * @author Valeria Guzman
 */
public class Sistema_votaciones2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan=new Scanner(System.in);
        String contrasenia="admin";
        String contraseniaIngresada;
        
        
        System.out.println("Sistema de votaciones");
        System.out.print("Ingrese una contraseña para el usuario admin: ");
        contraseniaIngresada=scan.nextLine();
        System.out.println(contraseniaIngresada);
        
        if (contrasenia.equals(contraseniaIngresada)){
             System.out.println("La contraseña es igual");
        } else{
             System.out.println("La contraseña es incorrecta");
        }
        
       
    }
    
}
