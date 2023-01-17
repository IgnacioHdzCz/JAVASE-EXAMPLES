package com.java.app;

import com.java.app.utils.UtilsApp;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UtilsApp utilsApp = new UtilsApp();
		utilsApp.saludo();
		
		/*
		 * Concepto de Variables
		 * int  : son numeros enteros positivos y negativos
		 * float : hace referencia a valores flotantes : decimales : 1.2 , 4.6, 9.7
		 * double : valores decimales : guarda mas números 1.2 ...
		 * String : cadenas : Hola mi nombre es Christian
		 * char : character : solo letras
		 * boolean : TRUE o False
		 */
		
		// Primera variable entera
		
		int numero = 19;
		
		System.out.println(numero);
		//Creamos nuestras primeras varianles en flotantes y double
		// Cuando se crea un numero flotante se pone una f
		float numeroFloat = 2.09f;
		double numeroDouble = 9.7;
		
		System.out.println("Numero float " + numeroFloat);
		System.out.println("Numero double " + numeroDouble);
				
		
		//Variables char y String
		String texto = "Hola me llamo Ignacio";
		texto += " soy un String";
		char caracter = 'K';
		
		System.out.println("Cadena de caracter " + texto);
		System.out.println("Caracter " + caracter);
		//Variable boolean
		boolean variable_boolean = true;
		System.out.println(variable_boolean);
		
		
	}

}
