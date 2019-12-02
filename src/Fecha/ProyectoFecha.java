package Fecha;

import java.util.Scanner;


public class ProyectoFecha {
	
	 public static void main(String[]args){
	        Scanner sc = new Scanner(System.in);
	        int d,m,a;
	        //Se introduce en el teclado el dia,mes y año
	        System.out.println("introducefecha");
	        System.out.println("dia:");
	        d = sc.nextInt();
	        System.out.println("mes:");
	        m = sc.nextInt();
	        System.out.println("año:");
	        a = sc.nextInt();
	        
	        // Se crea el objeto Fecha utilizando el constructor con parametros
	        Fecha fecha = new Fecha(d,m,a);
	        
	        if(fecha.fechaCorrecta()){ // si la fecha es correcta
	            
	        // Se muestra utilizando el metodo toString()
	        System.out.println("Fecha introducida:" + fecha);
	        
	        // Se muestran los 10 dias siguientes utilizando el metodo diaSiguiente()
	        System.out.println("Los 10 dias siguientes son:");
	        for(int i = 1; i <= 10; i++){
	            fecha.diaSiguiente();
	            System.out.println(fecha);
	        }
	        }else{//Si la fecha no es correcta
	            System.out.println("Fecha no valida");
	            
	        }
	        }
	    }



