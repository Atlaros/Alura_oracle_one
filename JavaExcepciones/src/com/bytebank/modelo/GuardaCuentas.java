package com.bytebank.modelo;

public class GuardaCuentas {
//crear un objeto apra ugardas mhcas cuentas
	//permitir agregar cuentas con un metodo
	//guardacuentas.adiciona(cuenta)
	//obtener, remover etc
	Cuenta[] cuenta = new Cuenta[10];
	int indice = 0;
	public void adicionar(Cuenta cc) {
		// TODO Auto-generated method stub
		cuenta[indice] = cc;
		indice++;
	}
	public Cuenta obtener(int indice) {
		return cuenta[indice];
	}
		
	}

