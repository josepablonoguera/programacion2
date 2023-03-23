/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package collecionesjava;

/**
 *
 * @author pablonoguera
 */
import java.util.Scanner;

public class ReproductorMusica {
    public static void menu() {
        Scanner input = new Scanner(System.in);
        boolean salir = false;
        
        while(!salir) {
            System.out.println("-------- Menú de Reproductor de Música --------");
            System.out.println("1. Reproducir canción");
            System.out.println("2. Pausar canción");
            System.out.println("3. Detener canción");
            System.out.println("4. Siguiente canción");
            System.out.println("5. Anterior canción");
            System.out.println("6. Salir");
            System.out.print("Ingrese el número de opción que desea: ");
            int opcion = input.nextInt();
            
            switch(opcion) {
                case 1:
                    System.out.println("Reproduciendo canción...");
                    break;
                case 2:
                    System.out.println("Pausando canción...");
                    break;
                case 3:
                    System.out.println("Deteniendo canción...");
                    break;
                case 4:
                    System.out.println("Cambiando a siguiente canción...");
                    break;
                case 5:
                    System.out.println("Cambiando a canción anterior...");
                    break;
                case 6:
                    salir = true;
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
            
            System.out.println(); // Salto de línea para separar las opciones
        }
        
        System.out.println("Gracias por usar el Reproductor de Música.");
    }
}

