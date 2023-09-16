package com.bytebank.modelo;

public class GuardaReferencias {

	//crear un objeto apra ugardas mhcas cuentas
		//permitir agregar cuentas con un metodo
		//guardacuentas.adiciona(cuenta)
		//obtener, remover etc
		Object[] referencia = new Object[10];
		int indice = 0;
		public void adicionar(Object cc) {
			// TODO Auto-generated method stub
			referencia[indice] = cc;
			indice++;
		}
		public Object obtener(int indice) {
			return referencia[indice];
		}
			
}
