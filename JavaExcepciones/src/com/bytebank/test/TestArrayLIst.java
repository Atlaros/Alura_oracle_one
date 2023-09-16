package com.bytebank.test;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import com.bytebank.modelo.*;
public class TestArrayLIst {

	public static void main(String[] args) {
		
		//<> forzando a que acepte un solo tipo de objeto
		//List<Cliente> ListaCliente = new LinkedList<>();
		// en el primero es obligatori en el segundo no es obligatorio
		List<Cuenta> lista = new ArrayList<>();
		Cuenta cc = new CuentaCorriente(11, 22);
		Cuenta cc2 = new CuentaCorriente(13, 42);
		Cuenta cc3 = new CuentaCorriente(11, 22);
		lista.add(cc);
		lista.add(cc2);
		
		Cuenta obtenerCuenta =  (Cuenta) lista.get(0);
		System.out.println(obtenerCuenta);
		
		for (int i = 0; i < lista.size(); i++) {
			
		}
		//por cada cuetna en lista 
		for (Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		boolean contiene = lista.contains(cc);
		//por referencia
		if (lista.contains(cc)) {
			System.out.println("si, es igual con equals()");
			
		}

	}
}
