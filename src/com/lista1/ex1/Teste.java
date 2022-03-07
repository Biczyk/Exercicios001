package com.lista1.ex1;


public class Teste {
	
	public static void main(String[] args) {

	Pessoa p1 = new Pessoa("Jose" , Sexo.Masculino , 12, false);
	Pessoa p2 = new Pessoa("Maria" , Sexo.Feminino , 20 , false);
	Pessoa p3 = new Pessoa("Camila", Sexo.Feminino , 30,true);
	
	Churrasco festa= new Churrasco();
	
	festa.verificarConsumo(p1);
	festa.verificarConsumo(p2);
	festa.verificarConsumo(p3);
	
	System.out.println(festa.getQtdCarne());
	
}
}
