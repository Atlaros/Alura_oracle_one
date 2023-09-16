package com.bytebank.test;
import com.bytebank.modelo.*;
public class TesCuentaExceptionSaldo {
	public static void main(String[] args) {
		Cuenta cuenta = new CuentaAhorros(123, 456);
		cuenta.deposita(200);
		try {
			cuenta.saca(210);
			cuenta.saca(10);
		} catch (SaldoInsuficienteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
