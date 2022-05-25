package Listas;
import javax.swing.JOptionPane;
import java.util.*;
import java.lang.String;


public class Proyecto1 
{
        		
    public class Nodo //construimos donde ingresaremos los datos y el apuntador
    {
       String dato;
       Nodo siguiente;
       int n;
    }
    
    public class Listas //este sera nuestro constructor principal para llamar los metodos
    {
        Scanner Teclado = new Scanner(System.in);
        Nodo Primero;
        Nodo Ultimo;

        public Listas()
        {
            Primero = null;
            Ultimo = null;
        }

    }
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion, opcion2, opcion3;
        int valor1= 0;
        while(!salir){
            System.out.println("Escribe 1 para Calcular el Factorial ");
            System.out.println("Escribe 2 para Positivo? o Negativo? ");
            System.out.println("Escribe 3 para Serie Fibonacci ");
            System.out.println("Escribe 4 para división por restas sucesivas");
            System.out.println("Escribe 5 para Invertir un número");
            System.out.println("Escribe 6 para sumar los dígitos de un número");
            System.out.println("Escribe 7 para Multiplicación utilizando el método Ruso");
            System.out.println("Escribe 8 para Calcular el cuadrado");
            System.out.println("Escribe 9 para contar atras metodo recursivo");
            System.out.println("Escribe 10 para potencial de un numero");
            System.out.println("Escribe 11 para Invertir String");
            System.out.println("Escribe 12 para combinar los numeros");
            System.out.println("Escribe 13 para Suma de numeros recursivo");
            System.out.println("Escribe 14 para salir");
            System.out.println("Solo números entre 1 y 13");
            
            opcion = sn.nextInt();
            
            
            switch(opcion){
                
           }    	             
            	        }
                	}
    }
   


