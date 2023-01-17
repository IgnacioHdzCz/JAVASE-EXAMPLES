package com.java.entradadatos;

import java.util.Scanner;

public class Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada = new Scanner (System.in);
		
		Variables variables = new Variables();
		 int edad ;
		 String nombre;
		 float  altura;
		 
		 System.out.println("Ingrese tu edad : ");
		 edad = entrada.nextInt();
	
		
		System.out.println("Ingrese su nombre :");
		nombre = entrada.next();
		
		
		System.out.println("Ingrese su altura");
		altura = entrada.nextFloat();
		
		
		System.out.println("Tus datos : ");
		variables.edad(edad);
		variables.nombre(nombre);
		variables.altura(altura);
//		
//		System.out.println("Edad : " + edad);
//		System.out.println("Nombre : " + nombre);
//		System.out.println("Altura : " + altura);
	}
	
	public void edad (int edadIn) {
		System.out.println("Tu edad: " + edadIn);
	}
	
	public void  nombre (String nombre) {
	
		System.out.println("Tu nombre :" + nombre);
	}
	
	public void  altura (float altura) {
		
		System.out.println("Tu altura: " +altura);
	}

}
