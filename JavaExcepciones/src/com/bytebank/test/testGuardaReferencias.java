package com.bytebank.test;

import com.bytebank.modelo.*;


public class testGuardaReferencias {

	public static void main(String[] args) {

		GuardaReferencias guardaReferencia = new GuardaReferencias();
		Cuenta cc = new CuentaCorriente(11, 22);
		guardaReferencia.adicionar(cc);
		Cuenta cc2 = new CuentaCorriente(22, 44);
		guardaReferencia.adicionar(cc2);
		
		guardaReferencia.obtener(1);
		System.out.println(guardaReferencia.obtener(0));
		System.out.println(guardaReferencia.obtener(1));
	}

}
