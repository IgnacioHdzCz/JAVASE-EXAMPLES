package com.java.app;

import com.java.app.interfaz.AppInterfaz;

public class App1 implements AppInterfaz{

	public static void main(String[] args) {
		
		App1 app1= new App1();
		app1.saludoInterfaz();
		
	}

	@Override
	public void saludoInterfaz() {
		System.out.println("Hello!! desde Interfaz");
		
	}
}
