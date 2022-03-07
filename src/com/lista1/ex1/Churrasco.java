package com.lista1.ex1;

public class Churrasco {
	
	double qtdCarne;
	
	void verificarConsumo(Pessoa pessoa){
	
		if (pessoa.idade>=0 && pessoa.idade<3 || pessoa.vegetariana==true) {
			
		}	
		
		 else if(pessoa.idade>=4 && pessoa.idade<=12) {
			
					this.qtdCarne++;
		
		 } else if(pessoa.idade>13) {
				
							this.qtdCarne=qtdCarne+2;
		   }
			   
	}
	
	public double getQtdCarne() {
		return qtdCarne;
	}
}

