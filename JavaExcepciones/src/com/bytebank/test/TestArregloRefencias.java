package com.bytebank.test;

import com.bytebank.modelo.*;
import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
public class TestArregloRefencias {

	public static void main(String[] args) {
		Object[] referencias = new Object[5];
		CuentaCorriente cc = new CuentaCorriente(23, 44);
		//                         [new |cc |null |null | null| ]
		//Object[] cuentas = new Object[5];

		referencias[1] = cc;
		Cliente cliente = new Cliente();
		referencias[4] = cliente;
		Cliente obtenido =  (Cliente)  referencias[4];
		System.out.println(obtenido);
		CuentaAhorros ca = new CuentaAhorros(44, 56);
		referencias[3] = ca;
		
		System.out.println(cc);
		System.out.println(referencias[1]);
		
		referencias[0] = new CuentaCorriente(11, 99);
		System.out.println(referencias[0]);
		//cast
		//CuentaCorriente cuenta = (CuentaCorriente) cuentas[1];
		CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
		System.out.println(referencias);
		
		for(int i = 0; i < referencias.length; i++) {
		System.out.println(referencias[i]);
		}
		}
}
