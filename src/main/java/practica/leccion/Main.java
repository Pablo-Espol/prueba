package practica.leccion;

import java.util.Scanner;

public class Main {
    String nombre;
    String elemento;
    int edad;
    int vida;
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese cuantos personajes quiere: ");

         
        int cantidadPersonajes = sc.nextInt();

        personaje[] array= new personaje[cantidadPersonajes];

        for (int i = 0; i < array.length; i++) {
            sc.nextLine();
            System.out.println("nombre del personaje " + (i+1) +":");
            String nombre = sc.nextLine();
            System.out.println("elemento: ");
            String elemento = sc.nextLine();
            System.out.println("edad: ");
            int edad = sc.nextInt();
            System.out.println("vida: ");
            int vida= sc.nextInt();
            personaje prj = new personaje(nombre,edad , elemento, vida);
            array[i] = prj;
        }
        sc.nextLine();

        System.out.println("quieres ver los datos de un personaje (s/n): ");
        String conf = sc.nextLine();

       while (conf.equals("s")|| conf.equals("si")) {
            System.out.println("Que personaje quiere ve, ingrese el numero: ");

            int npersonaje = sc.nextInt();
            array[npersonaje-1].datosPersonaje() ; 
            
            sc.nextLine();
            System.out.println("quieres ver otro personaje: ");
            conf = sc.nextLine();
        }
        
        System.out.println("TERMINADO");
        
  sc.close();
  System.out.println("yo estoy bien");
  System.out.println("hola como estas mi querido amigo");
  System.out.println("hola");
  System.out.println("ya tu sabe de lo mas guchi");
    }
}