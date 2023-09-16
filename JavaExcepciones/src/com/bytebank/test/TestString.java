package com.bytebank.test;

public class TestString {

	public static void main(String[] args) {
		String nombre = "alura";
		//String nombre2 = new String("alura"); no utilizada e el mundo real
		System.out.println("antes del metodo " + nombre);
		//nombre.replace("a","A");
		nombre = nombre.replace("a","A");
		nombre = nombre.concat(" cursos online");
		nombre = nombre.toUpperCase();
		System.out.println("depues del metodo " + nombre);
		//el string es imutable nunca puede ser modificado. lo puede modificar asignodnolo aun nuevo objeto. o varaible
		
	}
	
}
