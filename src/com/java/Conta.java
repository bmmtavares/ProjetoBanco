package com.java;

public class Conta {
	int agencia;
	int numero;
	double saldo;
	
	public Conta() { //construtor default
		
	}
	
	public Conta(int numero) { //constutor 1 arg tipo int
		this.numero=numero;
		this.saldo=0;
		
	}
	
	public Conta(double saldo) { //construtor 1 arg tipo double
		this.saldo=saldo;
	}
	
	public Conta(int numero, double saldo) { //construtor com 2 args, int e double
		this.numero=numero;
		this.saldo=saldo;
	}
	
	Cliente cliente = new Cliente(); 
	
	public void setAgencia(int agencia) {
		this.agencia=agencia;
	}
	
	public double recuperarSaldo() {
		return saldo;
	}
	
	public void depositar(double valor) {
		saldo=saldo+valor;
	}
	
	public void retirar(double valor) { //sobrecarga, mesmo nome de metodo com assinatura diferente
		saldo=saldo-valor;
	}
	
	public void retirar(double valor,double taxa) { //sobrecarga, mesmo nome de metodo com assinatura diferente
		saldo=saldo-valor-taxa;
	}
	
	public void setNumero(int numero) {
		this.numero=numero;
		
	}
	
	public int getNumero() {
		return numero;
	}
}
