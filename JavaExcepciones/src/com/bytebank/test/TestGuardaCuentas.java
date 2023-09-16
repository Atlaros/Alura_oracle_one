package com.bytebank.test;
import com.bytebank.modelo.*;
public class TestGuardaCuentas {
	public static void main(String[] args) {

		GuardaCuentas guardaCuentas = new GuardaCuentas();
		Cuenta cc = new CuentaCorriente(11, 22);
		guardaCuentas.adicionar(cc);
		Cuenta cc2 = new CuentaCorriente(22, 44);
		guardaCuentas.adicionar(cc2);
		
		guardaCuentas.obtener(1);
		System.out.println(guardaCuentas.obtener(0));
		System.out.println(guardaCuentas.obtener(1));
	}

}
