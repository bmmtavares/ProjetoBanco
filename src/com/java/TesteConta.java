package com.java;

public class TesteConta {
	public static void main(String[] args) {

		Conta contaCorrente = new Conta();
		Conta contaPoupanca = new Conta();
		Conta contaInvestimento = new Conta();
		
		contaCorrente.setAgencia(8048);
		contaCorrente.numero=11;
		contaCorrente.saldo=20.50;
		contaCorrente.cliente.nome="Bruno";
		contaCorrente.cliente.idade=34;
		
		contaPoupanca.numero=22;
		contaPoupanca.saldo=30;
		contaPoupanca.cliente.nome="Fulano";
		contaPoupanca.cliente.idade=40;
		
				
		contaInvestimento.numero=33;
		contaInvestimento.saldo=40;
		contaInvestimento.cliente.nome="Ciclano";
		contaInvestimento.cliente.idade=40;
		
		System.out.println(contaCorrente.agencia);
		System.out.println(contaCorrente.numero);
		System.out.println(contaCorrente.saldo);
		System.out.println(contaCorrente.cliente.nome);
		System.out.println(contaCorrente.cliente.idade);
		
		contaCorrente.depositar(100);
		System.out.println("Depositou: R$100,00");
		System.out.println("Novo saldo: R$"+contaCorrente.recuperarSaldo());
		
		contaCorrente.retirar(10);
		System.out.println("Retirou 10, novo saldo:"+contaCorrente.recuperarSaldo());
		
		contaCorrente.retirar(10, 9.99); 
		System.out.println("Retirou 10 com taxa de 9.99, novo saldo:"+contaCorrente.recuperarSaldo());
		
		Conta cc = new Conta(); //invocando construtor default
		cc.setNumero(1000);
		System.out.println(cc.recuperarSaldo());
		
		Conta cc1 = new Conta(1000,50); //construtor com 2 args, int e double		
		System.out.println(cc1.recuperarSaldo());
		
		Conta cc2 = new Conta(2000); //constutor 1 arg tipo int
		System.out.println(cc2.getNumero());
		
		Conta cc3 = new Conta(44.99); //construtor 1 arg tipo double
		System.out.println(cc3.recuperarSaldo());
	}
}
